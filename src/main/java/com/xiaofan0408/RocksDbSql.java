package com.xiaofan0408;

import com.xiaofan0408.storage.Storage;

public class RocksDbSql {

    private Storage storage;

    public RocksDbSql(String path){
        storage = new Storage(path);
    }

}
