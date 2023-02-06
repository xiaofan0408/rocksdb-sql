package com.xiaofan0408.v2.datasource;

import com.xiaofan0408.v2.datatype.RecordBatch;
import com.xiaofan0408.v2.datatype.Schema;

import java.util.List;

public class CsvDataSource implements DataSource {

    private String filename;

    public CsvDataSource(String filename) {
        this.filename = filename;
    }

    @Override
    public Schema schema() {
        return null;
    }

    @Override
    public List<RecordBatch> scan(List<String> projection) {
        return null;
    }
}