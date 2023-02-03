package com.xiaofan0408v2.logicalplan;

import com.xiaofan0408v2.datatype.Schema;
import com.xiaofan0408v2.logicalplan.impl.AggregateExpr;

import java.util.List;

public interface DataFrame {

    /** Apply a projection */
    DataFrame project(List<LogicExpr> expr);
    /** Apply a filter */
    DataFrame filter(LogicExpr expr);
    /** Aggregate */
    DataFrame aggregate(List<LogicExpr> groupBy, List<AggregateExpr> aggregateExpr);
    /** Returns the schema of the data that will be produced by this DataFrame.
     */
    Schema schema();
    /** Get the logical plan */
    LogicalPlan logicalPlan();

}
