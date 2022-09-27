package com.xiaofan0408.executor;

import com.xiaofan0408.base.Result;
import com.xiaofan0408.plan.model.Plan;
import com.xiaofan0408.storage.Storage;

public class SqlExecutor {

    private Storage storage;

    public SqlExecutor(Storage storage) {
        this.storage = storage;
    }

    public Result execute(Plan plan) {
        return null;
    }
}
