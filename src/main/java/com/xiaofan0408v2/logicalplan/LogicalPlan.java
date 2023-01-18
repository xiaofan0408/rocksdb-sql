package com.xiaofan0408v2.logicalplan;

import java.util.List;

import com.xiaofan0408v2.datatype.Schema;

public interface LogicalPlan{

    Schema schema();
    
    List<LogicalPlan> children();

}