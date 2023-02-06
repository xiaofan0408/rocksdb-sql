package com.xiaofan0408.v1.storage;

import com.xiaofan0408.v1.base.DbException;
import com.xiaofan0408.v1.storage.namespace.Metadata;
import com.xiaofan0408.v1.storage.namespace.Namespace;
import org.rocksdb.*;


import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

public class Storage {

    private RocksDB db;

    private Map<String,ColumnFamilyHandle> columnFamilyHandleMap = new ConcurrentHashMap<>();

    private Namespace defaultNamespace;

    static {
        RocksDB.loadLibrary();
    }

    public Storage(String path) {
        defaultNamespace = new Namespace() {
            @Override
            public String cfName() {
                return Namespace.super.cfName();
            }
        };
        initRocksDb(path);
    }

    private void initRocksDb(String path){
        try {
            Options options = new Options();
            options.setErrorIfExists(false);
            options.setCreateIfMissing(true);
            options.setCreateMissingColumnFamilies(true);
            List<byte[]> cfs = RocksDB.listColumnFamilies(options,path);
            List<ColumnFamilyDescriptor> columnFamilyDescriptors = new ArrayList<>(); //ColumnFamilyDescriptor集合
            for (byte[] cf : cfs) {
                columnFamilyDescriptors.add(new ColumnFamilyDescriptor(cf, new ColumnFamilyOptions()));
            }
            Boolean needToCreateMetadataCf = findCf(columnFamilyDescriptors, Metadata.instance);
            // 添加 default cf
            Boolean needCreateDefault = findCf(columnFamilyDescriptors, defaultNamespace);
            if (needCreateDefault) {
                columnFamilyDescriptors.add(
                        new ColumnFamilyDescriptor(defaultNamespace.cfName().getBytes(StandardCharsets.UTF_8),
                                new ColumnFamilyOptions()));
            }
            List<ColumnFamilyHandle> columnFamilyHandles = new ArrayList<>();
            DBOptions dbOptions = new DBOptions(options);
            db = RocksDB.open(dbOptions,path,columnFamilyDescriptors,columnFamilyHandles);
            for (ColumnFamilyHandle columnFamilyHandle : columnFamilyHandles) {
                String cfName = new String(columnFamilyHandle.getName(), StandardCharsets.UTF_8);
                columnFamilyHandleMap.put(cfName,columnFamilyHandle);
            }

            if (needToCreateMetadataCf) {
                createColumnFamily(Metadata.instance.cfName());
            }

        }catch (Exception e){
            throw new DbException("",e);
        }
    }

    public void createColumnFamily(String cfName) {
        try{
            ColumnFamilyDescriptor columnFamilyDescriptor = new ColumnFamilyDescriptor(cfName.getBytes(),new ColumnFamilyOptions());
            ColumnFamilyHandle columnFamilyHandle = db.createColumnFamily(columnFamilyDescriptor);
            columnFamilyHandleMap.put(cfName,columnFamilyHandle);
        }catch(Exception e){
            throw new DbException("",e);
        }
    }


    private ColumnFamilyHandle getColumnFamily(Namespace namespace){
        return columnFamilyHandleMap.get(namespace.cfName());
    }

    private Boolean findCf(List<ColumnFamilyDescriptor> columnFamilyDescriptors, Namespace namespace) {
        String cfName = namespace.cfName();
        for (ColumnFamilyDescriptor cf : columnFamilyDescriptors) {
            String cfStr = new String(cf.getName());
            if (cfStr.equals(cfName)) {
                return false;
            }
        }
        return true;
    }

    public void close(){
        for (ColumnFamilyHandle columnFamilyHandle: columnFamilyHandleMap.values()) {
            columnFamilyHandle.close();
        }
        db.close();
    }

    public Map<String, ColumnFamilyHandle> getColumnFamilyHandleMap() {
        return columnFamilyHandleMap;
    }

    public RocksIteratorWrapper iterator(Namespace namespace){
        ColumnFamilyHandle columnFamilyHandle = getColumnFamilyHandle(namespace);
        ReadOptions readOptions = new ReadOptions();
        RocksIterator rocksIterator = db.newIterator(columnFamilyHandle,readOptions);
        return new RocksIteratorWrapper(rocksIterator);
    }

    private ColumnFamilyHandle getColumnFamilyHandle(Namespace namespace) {
        ColumnFamilyHandle columnFamilyHandle = columnFamilyHandleMap.get(namespace.cfName());
        if (Objects.isNull(columnFamilyHandle)) {
            throw new DbException("cf 不存在");
        }
        return columnFamilyHandle;
    }


    public byte[] get(Namespace namespace,byte[] key) {
        ColumnFamilyHandle columnFamilyHandle = getColumnFamilyHandle(namespace);
        try {
            return db.get(columnFamilyHandle,key);
        } catch (RocksDBException e) {
            throw new DbException("",e);
        }
    }

    public void put(Namespace namespace, byte[] key, byte[] value){
        ColumnFamilyHandle columnFamilyHandle = getColumnFamilyHandle(namespace);
        try {
            db.put(columnFamilyHandle,key,value);
        } catch (RocksDBException e) {
            throw new DbException("",e);
        }

    }
}
