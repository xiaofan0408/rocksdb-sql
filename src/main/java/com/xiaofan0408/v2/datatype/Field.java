package com.xiaofan0408.v2.datatype;

public class Field{

    private DataType dataType;

    private String name;

    public Field (DataType dataType, String name){
        this.dataType = dataType;
        this.name = name;
    }

    public static Field of(DataType dataType, String name){
        return new Field(dataType,name);
    }

    public DataType getDataType() {
        return dataType;
    }

    public String getName() {
        return name;
    }

}