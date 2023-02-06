package com.xiaofan0408.v1.storage.namespace;

public class Table implements Namespace{

    private String databaseName;

    private String name;

    public Table(String databaseName, String name) {
        this.databaseName = databaseName;
        this.name = name;
    }

    @Override
    public String cfName() {
        return databaseName + "_" + name;
    }
}
