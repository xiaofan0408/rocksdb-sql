package com.xiaofan0408.parser.model;

public class ColumnDefinition {
    
    private String columnType;

    private String columnName;

    public ColumnDefinition(String type,String name){
        this.columnType = type;
        this.columnName = name;
    }

    public String getColumnName() {
        return columnName;
    }
    
    public String getColumnType() {
        return columnType;
    }

    @Override
    public String toString() {
        return "ColumnDefinition{" +
                "columnType='" + columnType + '\'' +
                ", columnName='" + columnName + '\'' +
                '}';
    }
}
