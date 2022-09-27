package com.xiaofan0408;

import com.xiaofan0408.base.Result;
import com.xiaofan0408.executor.SqlExecutor;
import com.xiaofan0408.parser.SqlParser;
import com.xiaofan0408.parser.operate.OperateBase;
import com.xiaofan0408.plan.SqlPlanner;
import com.xiaofan0408.plan.model.Plan;
import com.xiaofan0408.storage.Storage;

public class RocksDbSql {

    private Storage storage;

    private SqlExecutor sqlExecutor;

    private SqlPlanner sqlPlanner;

    private SqlParser sqlParser;

    public RocksDbSql(String path){
        storage = new Storage(path);
        sqlParser = new SqlParser();
        sqlPlanner = new SqlPlanner();
        sqlExecutor = new SqlExecutor();
    }

    public Result execute(String database, String sql){
        OperateBase operateBase = sqlParser.parseSql(database,sql);
        Plan plan = sqlPlanner.plan(operateBase);
        return sqlExecutor.execute(plan);
    }

}