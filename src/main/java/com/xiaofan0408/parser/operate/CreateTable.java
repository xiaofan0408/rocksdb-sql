package com.xiaofan0408.parser.operate;

import java.util.ArrayList;
import java.util.List;

import com.xiaofan0408.parser.model.ColumnDefinition;

public class CreateTable extends OperateBase{

    private String tableName;
 
    private List<ColumnDefinition> columns;

    public CreateTable(){
        columns = new ArrayList<>();
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

    @Override
    public String toString() {
        return "CreateTable{" +
                "database=" + this.getDatabase() + ","+
                "tableName='" + tableName + '\'' +
                ", columns=" + columns +
                '}';
    }
}