package com.xiaofan0408.v2.logicalplan.plan;

import java.util.List;

import com.xiaofan0408.v2.datatype.Schema;

public interface LogicalPlan{

    Schema schema();
    
    List<LogicalPlan> children();

}