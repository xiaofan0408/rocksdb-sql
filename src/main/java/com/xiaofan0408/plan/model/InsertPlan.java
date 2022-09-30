package com.xiaofan0408.plan.model;

import java.util.List;

public class InsertPlan extends Plan{
    
    private String database;

    private String tableName;

    private List<List<String>> values;
    
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public List<List<String>> getValues() {
        return values;
    }

    public void setValues(List<List<String>> values) {
        this.values = values;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    
}
