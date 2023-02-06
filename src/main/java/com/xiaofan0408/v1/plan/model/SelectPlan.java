package com.xiaofan0408.v1.plan.model;

import com.xiaofan0408.v1.parser.model.Filter;

import java.util.List;

public class SelectPlan extends Plan{

    private String databaseName;

    private String tableName;

    private List<String> cols;

    private List<Filter> filters;

    public SelectPlan(String databaseName, String tableName, List<String> cols, List<Filter> filters) {
        this.databaseName = databaseName;
        this.tableName = tableName;
        this.cols = cols;
        this.filters = filters;
    }

    public SelectPlan() {
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public List<String> getCols() {
        return cols;
    }

    public void setCols(List<String> cols) {
        this.cols = cols;
    }

    public List<Filter> getFilters() {
        return filters;
    }

    public void setFilters(List<Filter> filters) {
        this.filters = filters;
    }
}
