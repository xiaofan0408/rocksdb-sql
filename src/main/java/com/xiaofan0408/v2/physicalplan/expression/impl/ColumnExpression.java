package com.xiaofan0408.v2.physicalplan.expression.impl;

import com.xiaofan0408.v2.datatype.ColumnVector;
import com.xiaofan0408.v2.datatype.RecordBatch;
import com.xiaofan0408.v2.physicalplan.expression.Expression;

public class ColumnExpression implements Expression {

    private int val;

    public ColumnExpression(int val) {
        this.val = val;
    }

    @Override
    public ColumnVector evaluate(RecordBatch input) {
        return input.field(val);
    }

    @Override
    public String toString() {
        return "#" + val;
    }
}
