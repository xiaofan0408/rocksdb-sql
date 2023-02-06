package com.xiaofan0408.v2.physicalplan.expression;

import com.xiaofan0408.v2.datatype.ColumnVector;
import com.xiaofan0408.v2.datatype.RecordBatch;

public interface Expression {
    ColumnVector evaluate(RecordBatch input);
}
