package com.xiaofan0408.executor;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.alibaba.fastjson.JSONObject;
import com.ibm.icu.impl.UResource.Table;
import com.xiaofan0408.base.DbException;
import com.xiaofan0408.base.Result;
import com.xiaofan0408.codec.Codec;
import com.xiaofan0408.model.TableInfo;
import com.xiaofan0408.parser.model.ColumnDefinition;
import com.xiaofan0408.model.ColumnInfo;
import com.xiaofan0408.model.ColumnType;
import com.xiaofan0408.plan.model.CreateTablePlan;
import com.xiaofan0408.plan.model.Plan;
import com.xiaofan0408.storage.Storage;
import com.xiaofan0408.storage.namespace.Metadata;

public class SqlExecutor {

    private Storage storage;

    public SqlExecutor(Storage storage) {
        this.storage = storage;
    }

    public Result execute(Plan plan) {

        if (plan instanceof CreateTablePlan) {
            return executeCreateTable((CreateTablePlan)plan);
        }
        return null;
    }

    private Result executeCreateTable(CreateTablePlan plan){
        long id = System.currentTimeMillis();
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
        TableInfo tableInfo = new TableInfo(id, tableName, infos);
        String jsonTableInfo = JSONObject.toJSONString(tableInfo);
        String key = Codec.TABLE_PREFIX + tableName;
        storage.put(Metadata.instance,key.getBytes(StandardCharsets.UTF_8), jsonTableInfo.getBytes(StandardCharsets.UTF_8));
        return new Result();
    }
}
