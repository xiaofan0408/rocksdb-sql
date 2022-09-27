package com.xiaofan0408;

import com.xiaofan0408.storage.RocksIteratorWrapper;
import com.xiaofan0408.storage.Storage;
import com.xiaofan0408.storage.namespace.Metadata;
import org.junit.Test;

import java.nio.charset.StandardCharsets;

public class StorageTest {

    @Test
    public void testStartStorage(){
        Storage storage = new Storage("./data");
        System.out.println(storage.getColumnFamilyHandleMap().keySet());
        storage.close();
    }

    @Test
    public void testPut(){
        Storage storage = new Storage("./data");
        storage.put(Metadata.instance,"key".getBytes(StandardCharsets.UTF_8),"value".getBytes(StandardCharsets.UTF_8));
    }

    @Test
    public void testGet(){
        Storage storage = new Storage("./data");
        byte[] value = storage.get(Metadata.instance,"key".getBytes(StandardCharsets.UTF_8));
        System.out.println(new String(value));
    }

    @Test
    public void testIter() {
        Storage storage = new Storage("./data");
        for (int i=0; i< 100;i++) {
            String key = "key" + i;
            String value = "value" + i;
            storage.put(Metadata.instance,key.getBytes(StandardCharsets.UTF_8),value.getBytes(StandardCharsets.UTF_8));
        }

        RocksIteratorWrapper iter = storage.iterator(Metadata.instance);
        for (iter.seekToFirst();iter.isValid();iter.next()) {
            System.out.println("iter key: " + new String(iter.key()) + ",iter value: " +
                    new String(iter.value()));
        }
    }
}
