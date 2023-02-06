package com.xiaofan0408.v1.storage.namespace;

public interface Namespace {
    default String cfName(){
        return "default";
    }
}
