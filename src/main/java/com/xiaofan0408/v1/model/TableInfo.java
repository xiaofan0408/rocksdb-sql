package com.xiaofan0408.v1.model;

import java.util.List;

public class TableInfo {

    private long id;
    
    private String name;

    private List<ColumnInfo> columnInfos;

    private ColumnInfo pk;

    public TableInfo(long id, String name, List<ColumnInfo> columnInfos, ColumnInfo pk) {
        this.id = id;
        this.name = name;
        this.columnInfos = columnInfos;
        this.pk = pk;
    }

    public ColumnInfo getPk() {
        return pk;
    }

    public void setPk(ColumnInfo pk) {
        this.pk = pk;
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
