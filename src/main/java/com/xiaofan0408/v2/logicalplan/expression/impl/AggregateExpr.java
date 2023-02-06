package com.xiaofan0408.v2.logicalplan.expression.impl;

import com.xiaofan0408.v2.datatype.DataType;
import com.xiaofan0408.v2.datatype.Field;
import com.xiaofan0408.v2.logicalplan.expression.LogicExpr;
import com.xiaofan0408.v2.logicalplan.plan.LogicalPlan;

public class AggregateExpr implements LogicExpr{

    private String name;

    private LogicExpr expr;

    public AggregateExpr(String name,LogicExpr expr){
        this.name = name;
        this.expr = expr;
    }

    @Override
    public Field toField(LogicalPlan input) {
       return Field.of(expr.toField(input).getDataType(),name);
    }

    @Override
    public String toString() {
        return String.format("%s(%s)", name, expr.toString());
    }

    public static AggregateExpr sum(LogicExpr input){
        return new AggregateExpr("SUM",input);
    }

    public static AggregateExpr min(LogicExpr input){
        return new AggregateExpr("MIN",input);
    }

    public static AggregateExpr max(LogicExpr input){
        return new AggregateExpr("MAX",input);
    }

    public static AggregateExpr avg(LogicExpr input){
        return new AggregateExpr("AVG",input);
    }

    public static AggregateExpr count(LogicExpr input){
        return new AggregateExpr("count",input){
            @Override
            public Field toField(LogicalPlan plan) {
                return Field.of(DataType.Int32Type, "COUNT");
            }

            @Override
            public String toString() {
                return String.format("COUNT(%s)", input.toString());
            }
        };
    }

}