package com.xiaofan0408.v2.datasource;

import com.xiaofan0408.v2.datatype.RecordBatch;
import com.xiaofan0408.v2.datatype.Schema;

import java.util.List;

public interface DataSource{

    Schema schema();

    List<RecordBatch> scan(List<String> projection);

}