package com.xiaofan0408.v2.datatype;

public class LiteralValueVector<T> implements ColumnVector<T>{

    private DataType dataType;

    private T value;

    private int size;

    public LiteralValueVector(DataType dataType, T value, int size){
        this.dataType = dataType;
        this.value = value;
        this.size = size;
    }

    @Override
    public DataType getType() {
       return dataType;
    }

    @Override
    public T getValue(int i) {
       if (i < 0 || i > size) {
            throw new IndexOutOfBoundsException();
       }
       return value;
    }

   @Override
   public int size() {
       return size;
   }

}