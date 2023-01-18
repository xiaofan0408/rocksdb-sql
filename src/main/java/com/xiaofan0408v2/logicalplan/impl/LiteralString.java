package com.xiaofan0408v2.logicalplan.impl;

import com.xiaofan0408v2.datatype.DataType;
import com.xiaofan0408v2.datatype.Field;
import com.xiaofan0408v2.logicalplan.LogicExpr;
import com.xiaofan0408v2.logicalplan.LogicalPlan;

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