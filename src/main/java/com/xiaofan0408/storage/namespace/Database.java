package com.xiaofan0408.storage.namespace;

public class Database implements Namespace{

    private String name;

    public Database(String name) {
        this.name = name;
    }

    @Override
    public String cfName() {
        return name;
    }
}
