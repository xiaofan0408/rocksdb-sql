package com.xiaofan0408.v2.physicalplan.expression.impl;

import com.xiaofan0408.v2.datatype.ColumnVector;
import com.xiaofan0408.v2.datatype.DataType;
import com.xiaofan0408.v2.datatype.LiteralValueVector;
import com.xiaofan0408.v2.datatype.RecordBatch;
import com.xiaofan0408.v2.physicalplan.expression.Expression;

public class LiteralLongExpression implements Expression {

    private Long val;

    public LiteralLongExpression(Long val) {
        this.val = val;
    }

    @Override
    public ColumnVector evaluate(RecordBatch input) {
        return new LiteralValueVector<>(DataType.Int64Type,val,input.rowCount());
    }
}
