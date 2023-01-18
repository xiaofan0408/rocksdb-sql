package com.xiaofan0408v2.logicalplan.impl;

import java.util.Objects;

import com.xiaofan0408v2.datatype.Field;
import com.xiaofan0408v2.logicalplan.LogicExpr;
import com.xiaofan0408v2.logicalplan.LogicalPlan;

public class Column implements LogicExpr{

    private String name;

    public Column(String name){
        this.name = name;
    }

    @Override
    public Field toField(LogicalPlan plan) {
        Field field = plan.schema().getFields().stream().filter( f -> f.getName().equals(this.name)).findFirst().orElse(null);
        if (Objects.isNull(field)) {
            throw new RuntimeException();
        }
        return field;
    }

    @Override
    public String toString() {
        return name;
    }

}