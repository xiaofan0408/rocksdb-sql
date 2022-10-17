package com.xiaofan0408.executor;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import com.xiaofan0408.parser.model.Filter;
import com.xiaofan0408.plan.model.*;
import org.rocksdb.Status.Code;

import com.alibaba.fastjson.JSONObject;
import com.xiaofan0408.base.DbException;
import com.xiaofan0408.base.Result;
import com.xiaofan0408.codec.Codec;
import com.xiaofan0408.model.TableInfo;
import com.xiaofan0408.parser.model.ColumnDefinition;
import com.xiaofan0408.model.ColumnInfo;
import com.xiaofan0408.model.ColumnType;
import com.xiaofan0408.storage.RocksIteratorWrapper;
import com.xiaofan0408.storage.Storage;
import com.xiaofan0408.storage.namespace.Metadata;
import com.xiaofan0408.storage.namespace.Namespace;
import com.xiaofan0408.storage.namespace.Table;

public class SqlExecutor {

    private Storage storage;

    public SqlExecutor(Storage storage) {
        this.storage = storage;
    }

    public Result execute(Plan plan) {

        if (plan instanceof CreateTablePlan) {
            return executeCreateTable((CreateTablePlan)plan);
        } else if (plan instanceof ShowTablePlan) {
            return executeShowTable((ShowTablePlan)plan);
        } else if (plan instanceof InsertPlan) {
            return executeInsert((InsertPlan)plan);
        } else if (plan instanceof SelectPlan) {
            return executeSelect((SelectPlan)plan);
        }
        return null;
    }

    private Result executeSelect(SelectPlan plan) {
        Result result = new Result();
        String database = plan.getDatabaseName();
        String tableName = plan.getTableName();
        List<String> cols = plan.getCols();
        List<Filter> filters = plan.getFilters();
        Namespace namespace = new Table(database,tableName);
        String tableKey = Codec.encodeTableKey(database,tableName);
        byte[] table = storage.get(Metadata.instance, tableKey.getBytes(StandardCharsets.UTF_8));
        if (table == null) {
            throw new DbException("table: " + tableName + "not exist");
        }
        TableInfo tableInfo = JSONObject.parseObject(new String(table,StandardCharsets.UTF_8), TableInfo.class);
        if (filters != null && filters.size() > 0) {

        } else {
            RocksIteratorWrapper iteratorWrapper = storage.iterator(namespace);
        }

        return result;
    }

    private Result executeCreateTable(CreateTablePlan plan){
        long id = System.currentTimeMillis();
        String database = plan.getDatabase();
        String tableName = plan.getTableName();
        List<ColumnInfo> infos = new ArrayList<>();
        for (ColumnDefinition columnDef: plan.getColumns()) {
            ColumnType columnType = ColumnType.getByType(columnDef.getColumnType());
            if (Objects.isNull(columnType)) {
                throw new DbException(columnDef.getColumnType() + " not support");
            }
            ColumnInfo columnInfo = new ColumnInfo(columnDef.getColumnName(), columnType);
            infos.add(columnInfo);
        }
        ColumnInfo pk = infos.get(0);
        TableInfo tableInfo = new TableInfo(id, tableName, infos,pk);
        String jsonTableInfo = JSONObject.toJSONString(tableInfo);
        String key = Codec.encodeTableKey(database, tableName);
        storage.put(Metadata.instance,key.getBytes(StandardCharsets.UTF_8), jsonTableInfo.getBytes(StandardCharsets.UTF_8));
        Namespace namespace = new Table(database, tableName);
        storage.createColumnFamily(namespace.cfName());
        return new Result();
    }

    public Result executeShowTable(ShowTablePlan showTablePlan) {
        Result result = new Result();
        RocksIteratorWrapper iterator =  storage.iterator(Metadata.instance);
        String key = Codec.TABLE_PREFIX + showTablePlan.getDatabase() + "/";

        List<String> tables = new ArrayList<>();
        iterator.seek(key.getBytes(StandardCharsets.UTF_8));
        while(iterator.isValid()){
            byte[] data =  iterator.key();
            String table = new String(data,StandardCharsets.UTF_8);
            tables.add(table.replaceAll(key, ""));
            iterator.next();
        }
        iterator.close();
        result.setData(tables);
        return result;
    }

    public Result executeInsert(InsertPlan insertPlan) {
        Result result = new Result();
        Namespace namespace = new Table(insertPlan.getDatabase(), insertPlan.getTableName());
        String tableKey = Codec.encodeTableKey(insertPlan.getDatabase(), insertPlan.getTableName());
        byte[] table = storage.get(Metadata.instance, tableKey.getBytes(StandardCharsets.UTF_8));
        if (table == null) {
            throw new DbException("table: " + insertPlan.getTableName() + "not exist");
        }
        TableInfo tableInfo = JSONObject.parseObject(new String(table,StandardCharsets.UTF_8), TableInfo.class);
        int size = tableInfo.getColumnInfos().size();
        Map<Integer,ColumnInfo> map = new HashMap<>();
        for (int i = 0; i< size; i++) {
            map.put(i, tableInfo.getColumnInfos().get(i));
        }

        for (List<String> values : insertPlan.getValues()) {
            if (values.size() < size){
                throw new DbException(" values no invaild");
            }
            String id = values.get(0);
            String recordKey = Codec.encodeRecordKey(insertPlan.getDatabase(), insertPlan.getTableName(), id);
            storage.put(namespace, recordKey.getBytes(StandardCharsets.UTF_8), "null".getBytes(StandardCharsets.UTF_8));
            for (int i=1; i< values.size(); i++) {
                ColumnInfo columnInfo = map.get(i);
                String v = values.get(i);
                String recordFeildKey = Codec.encodeRecordFieldKey(insertPlan.getDatabase(), insertPlan.getTableName(), id, columnInfo.getName());
                storage.put(namespace,recordFeildKey.getBytes(StandardCharsets.UTF_8),v.getBytes(StandardCharsets.UTF_8));
            }
        }
        return result;
    }
}
