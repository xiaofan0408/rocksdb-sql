package com.xiaofan0408.model;

import java.util.HashMap;
import java.util.Map;

public enum ColumnType {
    INTEAGR(1,"INTEGER"),
    STRING(2,"STRING"),
    FLOAT(3,"FLOAT"),
    BOOLEAN(4,"BOOLEAN")
    ;

    private int id;
    private String type;

    private static Map<String,ColumnType> SEEK = new HashMap<>();

    static {
        for (ColumnType columnType : values()) {
            SEEK.put(columnType.getType(), columnType);
        }
    }

    private ColumnType(int id,String type){
        this.id = id;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public static ColumnType getByType(String type){
        return SEEK.get(type);
    }
}
