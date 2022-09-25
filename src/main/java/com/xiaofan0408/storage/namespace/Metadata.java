package com.xiaofan0408.storage.namespace;

public class Metadata implements Namespace{

    public static Metadata instance = new Metadata();

    @Override
    public String cfName() {
        return "metadata";
    }
}
