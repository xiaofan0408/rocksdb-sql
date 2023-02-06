package com.xiaofan0408.v1.plan;

import com.xiaofan0408.v1.parser.operate.*;
import com.xiaofan0408.v1.plan.model.*;

public class SqlPlanner {

    public Plan plan(OperateBase operateBase) {

        if (operateBase instanceof CreateTable) {
            return buildCreateTablePlan((CreateTable)operateBase);
        } else if (operateBase instanceof ShowTable) {
            return new ShowTablePlan(operateBase.getDatabase());
        } else if (operateBase instanceof InsertOpt) {
            return buildInsertPlan((InsertOpt)operateBase);
        } else if (operateBase instanceof SelectOpt){
            return buildSelectPlan((SelectOpt)operateBase);
        }
        return null;
    }

    private Plan buildSelectPlan(SelectOpt operateBase) {
        SelectPlan selectPlan = new SelectPlan(operateBase.getDatabase(),
                operateBase.getTableName(),
                operateBase.getCols(),
                operateBase.getFilters());
        return selectPlan;
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
