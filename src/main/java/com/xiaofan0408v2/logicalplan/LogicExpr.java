package com.xiaofan0408v2.logicalplan;

import com.xiaofan0408v2.datatype.Field;

public interface LogicExpr{
    Field toField(LogicalPlan plan);
}