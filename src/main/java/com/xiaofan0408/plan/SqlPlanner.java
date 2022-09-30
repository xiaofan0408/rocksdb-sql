package com.xiaofan0408.plan;

import com.xiaofan0408.parser.operate.CreateTable;
import com.xiaofan0408.parser.operate.OperateBase;
import com.xiaofan0408.plan.model.CreateTablePlan;
import com.xiaofan0408.plan.model.Plan;

public class SqlPlanner {

    public Plan plan(OperateBase operateBase) {

        if (operateBase instanceof CreateTable) {
            return buildCreateTablePlan((CreateTable)operateBase);
        }

        return null;
    }


    private Plan buildCreateTablePlan(CreateTable createTable){
        CreateTablePlan createTablePlan = new CreateTablePlan();
        createTablePlan.setTableName(createTable.getTableName());
        createTablePlan.setDatabase(createTable.getDatabase());
        createTablePlan.setColumns(createTable.getColumns());
        return createTablePlan;
    }
}
