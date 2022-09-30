package com.xiaofan0408.plan.model;

import java.util.ArrayList;
import java.util.List;

import com.xiaofan0408.parser.model.ColumnDefinition;

public class CreateTablePlan extends Plan{

    private String database;
    
    private String tableName;
 
    private List<ColumnDefinition> columns;

    public CreateTablePlan(){
        columns = new ArrayList<>();
    }
      

    public void setDatabase(String database) {
        this.database = database;
    }

    public String getDatabase() {
        return database;
    }

    public void setTableName(String tableName){
     this.tableName = tableName;
    }

    public String getTableName(){
       return this.tableName;
    }

    public void setColumns(List<ColumnDefinition> columns) {
       this.columns.clear();
       this.columns.addAll(columns);
    }

    public void addColumn(ColumnDefinition column){
        this.columns.add(column);
    }

    public List<ColumnDefinition> getColumns() {
        return columns;
    }

    @Override
    public String toString() {
        return "CreateTablePlan{" +
                "database=" + database + ","+
                "tableName='" + tableName + '\'' +
                ", columns=" + columns +
                '}';
    }
}
