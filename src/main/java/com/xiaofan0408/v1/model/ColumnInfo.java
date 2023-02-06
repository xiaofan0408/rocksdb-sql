package com.xiaofan0408.v1.model;

public class ColumnInfo {
    
    private String name;

    private ColumnType type;

    public ColumnInfo(String name,ColumnType type){
        this.name = name;
        this.type = type;
    }
    
    
    public String getName() {
        return name;
    }

    public ColumnType getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(ColumnType type) {
        this.type = type;
    }

}
