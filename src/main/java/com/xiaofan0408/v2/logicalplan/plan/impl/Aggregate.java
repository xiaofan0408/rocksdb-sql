package com.xiaofan0408.v2.logicalplan.plan.impl;

import com.xiaofan0408.v2.datatype.Field;
import com.xiaofan0408.v2.datatype.Schema;
import com.xiaofan0408.v2.logicalplan.expression.impl.AggregateExpr;
import com.xiaofan0408.v2.logicalplan.plan.AbstractLogicalPlan;
import com.xiaofan0408.v2.logicalplan.expression.LogicExpr;
import com.xiaofan0408.v2.logicalplan.plan.LogicalPlan;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: xuzefan
 * @date: 2023/2/3 10:39
 */
public class Aggregate extends AbstractLogicalPlan {

    private LogicalPlan input;

    private List<LogicExpr> groupExpr;

    private List<AggregateExpr> aggregateExpr;


    public Aggregate(LogicalPlan input, List<LogicExpr> groupExpr, List<AggregateExpr> aggregateExpr) {
        this.input = input;
        this.groupExpr = groupExpr;
        this.aggregateExpr = aggregateExpr;
    }

    @Override
    public Schema schema() {
        List<Field> fields = groupExpr.stream().map(it -> it.toField(input)).collect(Collectors.toList());
        fields.addAll(aggregateExpr.stream().map(it -> it.toField(input)).collect(Collectors.toList()));
        return new Schema(fields);
    }

    @Override
    public List<LogicalPlan> children() {
        return Arrays.asList(input);
    }

    @Override
    public String toString() {
        String group = groupExpr.stream().map(it -> it.toString()).collect(Collectors.joining(","));
        String agg = aggregateExpr.stream().map(it -> it.toString()).collect(Collectors.joining(","));
        return "Aggregate: groupExpr="+group+", aggregateExpr=" + agg;

    }
}
