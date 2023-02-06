package com.xiaofan0408.v2.logicalplan.expression;

import com.xiaofan0408.v2.datatype.Field;
import com.xiaofan0408.v2.logicalplan.plan.LogicalPlan;

public interface LogicExpr{
    Field toField(LogicalPlan plan);
}