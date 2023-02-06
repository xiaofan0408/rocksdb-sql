package com.xiaofan0408.v2.physicalplan.expression.impl;

import com.xiaofan0408.v2.datatype.ColumnVector;
import com.xiaofan0408.v2.datatype.DataType;
import com.xiaofan0408.v2.datatype.LiteralValueVector;
import com.xiaofan0408.v2.datatype.RecordBatch;
import com.xiaofan0408.v2.physicalplan.expression.Expression;

public class LiteralDoubleExpression implements Expression {

    private Double val;

    public LiteralDoubleExpression(Double val) {
        this.val = val;
    }

    @Override
    public ColumnVector evaluate(RecordBatch input) {
        return new LiteralValueVector<>(DataType.DoubleType,val,input.rowCount());
    }
}
