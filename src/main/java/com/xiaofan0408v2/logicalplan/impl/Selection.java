package com.xiaofan0408v2.logicalplan.impl;

import com.xiaofan0408v2.datatype.Schema;
import com.xiaofan0408v2.logicalplan.AbstractLogicalPlan;
import com.xiaofan0408v2.logicalplan.LogicExpr;
import com.xiaofan0408v2.logicalplan.LogicalPlan;

import java.util.Arrays;
import java.util.List;

/**
 * @author: xuzefan
 * @date: 2023/2/3 10:20
 */
public class Selection extends AbstractLogicalPlan {

    private LogicalPlan input;

    private LogicExpr expr;

    public Selection(LogicalPlan input, LogicExpr expr) {
        this.input = input;
        this.expr = expr;
    }

    @Override
    public Schema schema() {
        return input.schema();
    }

    @Override
    public List<LogicalPlan> children() {
        return Arrays.asList(input);
    }

    @Override
    public String toString() {
        return "Filter: " + expr.toString();
    }
}
