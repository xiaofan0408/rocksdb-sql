package com.xiaofan0408v2.logicalplan.impl;

import com.xiaofan0408v2.datatype.Schema;
import com.xiaofan0408v2.logicalplan.DataFrame;
import com.xiaofan0408v2.logicalplan.LogicExpr;
import com.xiaofan0408v2.logicalplan.LogicalPlan;

import java.util.List;

/**
 * @author: xuzefan
 * @date: 2023/2/3 11:18
 */
public class DataFrameImpl implements DataFrame {

    private LogicalPlan plan;

    public DataFrameImpl(LogicalPlan plan) {
        this.plan = plan;
    }

    @Override
    public DataFrame project(List<LogicExpr> expr) {
        return new DataFrameImpl(new Projection(plan,expr));
    }

    @Override
    public DataFrame filter(LogicExpr expr) {
        return new DataFrameImpl(new Selection(plan,expr));
    }

    @Override
    public DataFrame aggregate(List<LogicExpr> groupBy, List<AggregateExpr> aggregateExpr) {
        return new DataFrameImpl(new Aggregate(plan,groupBy,aggregateExpr));
    }

    @Override
    public Schema schema() {
        return plan.schema();
    }

    @Override
    public LogicalPlan logicalPlan() {
        return plan;
    }
}
