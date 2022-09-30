package com.xiaofan0408.model;

import java.util.List;

public class TableInfo {

    private long id;
    
    private String name;

    private List<ColumnInfo> columnInfos;

    public TableInfo(long id,String name,List<ColumnInfo> columnInfos){
        this.id = id;
        this.name = name;
        this.columnInfos = columnInfos;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<ColumnInfo> getColumnInfos() {
        return columnInfos;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColumnInfos(List<ColumnInfo> columnInfos) {
        this.columnInfos = columnInfos;
    }
    
}
