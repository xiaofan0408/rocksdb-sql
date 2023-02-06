package com.xiaofan0408.v2.physicalplan.expression.impl;

import com.xiaofan0408.v2.datatype.ColumnVector;
import com.xiaofan0408.v2.datatype.RecordBatch;
import com.xiaofan0408.v2.physicalplan.expression.Expression;

public abstract class BinaryExpression implements Expression {

    private Expression l;

    private Expression r;

    @Override
    public ColumnVector evaluate(RecordBatch input) {
        ColumnVector ll = l.evaluate(input);
        ColumnVector rr = r.evaluate(input);
        if (ll.size() != rr.size()) {
            throw new IllegalStateException("Binary expression operands do not have the same size: " + ll.size() + "!="+ rr.size());
        }

        if (!ll.getType().equals(rr.getType())) {
            throw new IllegalStateException("Binary expression operands do not have the same type: " + ll.getType().name() + "!="+ rr.getType().name());
        }
        return evaluate(ll,rr);
    }

    abstract ColumnVector evaluate(ColumnVector ll, ColumnVector rr);
}
