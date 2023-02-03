package com.xiaofan0408v2.logicalplan.impl;

import com.xiaofan0408v2.datatype.DataType;
import com.xiaofan0408v2.datatype.Field;
import com.xiaofan0408v2.logicalplan.LogicExpr;
import com.xiaofan0408v2.logicalplan.LogicalPlan;

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