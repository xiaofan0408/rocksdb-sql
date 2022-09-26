package com.xiaofan0408.storage;

public class RocksIteratorWrapper implements RocksIteratorInterface, Closeable{

    private RocksIterator iterator;

    public RocksIteratorWrapper(@Nonnull RocksIterator iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean isValid() {
        return this.iterator.isValid();
    }

    @Override
    public void seekToFirst() {
        iterator.seekToFirst();
        status();
    }

    @Override
    public void seekToLast() {
        iterator.seekToFirst();
        status();
    }

    @Override
    public void seek(byte[] target) {
        iterator.seek(target);
        status();
    }

    @Override
    public void seek(ByteBuffer target)
    {
        iterator.seek(target);
        status();
    }

    @Override
    public void seekForPrev(ByteBuffer target)
    {
        iterator.seekForPrev(target);
        status();
    }

    @Override
    public void refresh()
            throws RocksDBException
    {
        iterator.refresh();
        status();
    }

    @Override
    public void seekForPrev(byte[] target) {
        iterator.seekForPrev(target);
        status();
    }

    @Override
    public void next() {
        iterator.next();
        status();
    }

    @Override
    public void prev() {
        iterator.prev();
        status();
    }

    @Override
    public void status(){
        try {
            iterator.status();
        } catch (RocksDBException ex) {
            throw new LoghubRuntimeException("Internal exception found in RocksDB", ex);
        }
    }

    public byte[] key() {
        return iterator.key();
    }

    public byte[] value() {
        return iterator.value();
    }

    @Override
    public void close() {
        iterator.close();
    }
}