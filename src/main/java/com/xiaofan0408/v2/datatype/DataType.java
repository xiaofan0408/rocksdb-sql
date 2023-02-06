package com.xiaofan0408.v2.datatype;


public enum DataType {
    BooleanType(1),
    Int8Type(2),
    Int16Type(3),
    Int32Type(4),
    Int64Type(5),
    UInt8Type(6),
    UInt16Type(7),
    UInt32Type(8),
    UInt64Type(9),
    FloatType(10),
    DoubleType(11),
    StringType(12),
    ;
    private int value;

    DataType(int i){
        this.value = i;
    }

    public int getValue(){
        return this.value;
    }    

}