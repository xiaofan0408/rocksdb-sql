package com.xiaofan0408.base;

import com.xiaofan0408.storage.namespace.Namespace;

public class DbException extends RuntimeException{

    public DbException(String message) {
        super(message);
    }

    public DbException(String message,Throwable throwable){
        super(message,throwable);
    }


    public static DbException namespaceNotFound(Namespace namespace){
        return new DbException(String.format("ColumnFamily({}) not found", namespace.cfName()));
    }
}
