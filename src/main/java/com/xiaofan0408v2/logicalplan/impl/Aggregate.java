package com.xiaofan0408v2.logicalplan.impl;

import com.xiaofan0408v2.datatype.Field;
import com.xiaofan0408v2.datatype.Schema;
import com.xiaofan0408v2.logicalplan.AbstractLogicalPlan;
import com.xiaofan0408v2.logicalplan.LogicExpr;
import com.xiaofan0408v2.logicalplan.LogicalPlan;

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
