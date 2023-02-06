package com.xiaofan0408.v2.physicalplan.expression.impl;

import com.xiaofan0408.v2.datatype.ColumnVector;
import com.xiaofan0408.v2.datatype.DataType;
import com.xiaofan0408.v2.datatype.LiteralValueVector;
import com.xiaofan0408.v2.datatype.RecordBatch;
import com.xiaofan0408.v2.physicalplan.expression.Expression;

public class LiteralStringExpression implements Expression {

    private String val;

    public LiteralStringExpression(String val) {
        this.val = val;
    }

    @Override
    public ColumnVector evaluate(RecordBatch input) {
        return new LiteralValueVector<>(DataType.StringType,val,input.rowCount());
    }
}
