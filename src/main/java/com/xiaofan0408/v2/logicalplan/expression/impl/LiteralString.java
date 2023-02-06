package com.xiaofan0408.v2.logicalplan.expression.impl;

import com.xiaofan0408.v2.datatype.DataType;
import com.xiaofan0408.v2.datatype.Field;
import com.xiaofan0408.v2.logicalplan.expression.LogicExpr;
import com.xiaofan0408.v2.logicalplan.plan.LogicalPlan;

public class LiteralString implements LogicExpr{

    private String str;

    public LiteralString(String str){
        this.str = str;
    }

    @Override
    public Field toField(LogicalPlan plan) {
        return Field.of(DataType.StringType, str);
    }

    @Override
    public String toString() {
        return str;
    }

}