package com.xiaofan0408.storage.namespace;

public interface Namespace {
    default String cfName(){
        return "default";
    }
}
