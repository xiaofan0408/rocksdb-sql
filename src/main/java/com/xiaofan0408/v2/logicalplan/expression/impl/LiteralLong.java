package com.xiaofan0408.v2.logicalplan.expression.impl;

import com.xiaofan0408.v2.datatype.DataType;
import com.xiaofan0408.v2.datatype.Field;
import com.xiaofan0408.v2.logicalplan.expression.LogicExpr;
import com.xiaofan0408.v2.logicalplan.plan.LogicalPlan;

public class LiteralLong implements LogicExpr{

    private Long n;

    public LiteralLong(Long n){
        this.n = n;
    }

    @Override
    public Field toField(LogicalPlan plan) {
        return Field.of(DataType.Int64Type, n.toString());
    }

    @Override
    public String toString() {
        return n.toString();
    }

}