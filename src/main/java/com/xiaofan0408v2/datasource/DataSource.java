package com.xiaofan0408v2.datasource;

import com.xiaofan0408v2.datatype.Schema;

public interface DataSource{

    Schema schema();

    List<RecordBatch> scan(List<String> projection);

}