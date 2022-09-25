package com.xiaofan0408.storage;

import com.xiaofan0408.base.DbException;
import com.xiaofan0408.storage.namespace.Metadata;
import com.xiaofan0408.storage.namespace.Namespace;
import org.rocksdb.*;


import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Storage {

    private RocksDB db;

    private Map<String,ColumnFamilyHandle> columnFamilyHandleMap = new ConcurrentHashMap<>();

    static {
        RocksDB.loadLibrary();
    }

    public Storage(String path) {
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

    private void createColumnFamily(String cfName) throws RocksDBException {
        ColumnFamilyDescriptor columnFamilyDescriptor = new ColumnFamilyDescriptor(cfName.getBytes(),new ColumnFamilyOptions());
        ColumnFamilyHandle columnFamilyHandle = db.createColumnFamily(columnFamilyDescriptor);
        columnFamilyHandleMap.put(cfName,columnFamilyHandle);
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
}
