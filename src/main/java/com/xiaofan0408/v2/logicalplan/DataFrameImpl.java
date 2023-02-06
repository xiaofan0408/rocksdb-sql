package com.xiaofan0408.v2.logicalplan;

import com.xiaofan0408.v2.datatype.Schema;
import com.xiaofan0408.v2.logicalplan.expression.LogicExpr;
import com.xiaofan0408.v2.logicalplan.expression.impl.AggregateExpr;
import com.xiaofan0408.v2.logicalplan.plan.LogicalPlan;
import com.xiaofan0408.v2.logicalplan.plan.impl.Aggregate;
import com.xiaofan0408.v2.logicalplan.plan.impl.Projection;
import com.xiaofan0408.v2.logicalplan.plan.impl.Selection;

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
