package com.xiaofan0408.plan;

import com.xiaofan0408.parser.operate.CreateTable;
import com.xiaofan0408.parser.operate.InsertOpt;
import com.xiaofan0408.parser.operate.OperateBase;
import com.xiaofan0408.parser.operate.ShowTable;
import com.xiaofan0408.plan.model.CreateTablePlan;
import com.xiaofan0408.plan.model.InsertPlan;
import com.xiaofan0408.plan.model.Plan;
import com.xiaofan0408.plan.model.ShowTablePlan;

public class SqlPlanner {

    public Plan plan(OperateBase operateBase) {

        if (operateBase instanceof CreateTable) {
            return buildCreateTablePlan((CreateTable)operateBase);
        } else if (operateBase instanceof ShowTable) {
            return new ShowTablePlan(operateBase.getDatabase());
        } else if (operateBase instanceof InsertOpt) {
            return buildInsertPlan((InsertOpt)operateBase);
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

    private Plan buildInsertPlan(InsertOpt insertOpt) {
        InsertPlan insertPlan = new InsertPlan();
        insertPlan.setDatabase(insertOpt.getDatabase());
        insertPlan.setTableName(insertOpt.getTableName());
        insertPlan.setValues(insertOpt.getValues());
        return insertPlan;
    }
}
