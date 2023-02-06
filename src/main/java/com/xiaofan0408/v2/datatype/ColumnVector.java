package com.xiaofan0408.v2.datatype;

public interface ColumnVector<T> {

    DataType getType();

    T getValue(int i);

    int size();

}