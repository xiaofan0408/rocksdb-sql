package com.xiaofan0408v2.logicalplan.impl;

import com.xiaofan0408v2.datatype.Schema;
import com.xiaofan0408v2.logicalplan.AbstractLogicalPlan;
import com.xiaofan0408v2.logicalplan.LogicExpr;
import com.xiaofan0408v2.logicalplan.LogicalPlan;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: xuzefan
 * @date: 2023/2/3 10:15
 */
public class Projection extends AbstractLogicalPlan {

    private LogicalPlan input;

    private List<LogicExpr> expr;

    public Projection(LogicalPlan input, List<LogicExpr> expr) {
        this.input = input;
        this.expr = expr;
    }

    @Override
    public Schema schema() {
        return new Schema(expr.stream().map(it -> it.toField(input)).collect(Collectors.toList()));
    }

    @Override
    public List<LogicalPlan> children() {
        return Arrays.asList(input);
    }

    @Override
    public String toString() {
        return "Projection: " + expr.stream().map(it -> it.toString()).collect(Collectors.joining(","));
    }
}
