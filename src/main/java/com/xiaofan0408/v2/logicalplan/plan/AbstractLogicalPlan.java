package com.xiaofan0408.v2.logicalplan.plan;

import com.xiaofan0408.v2.logicalplan.plan.LogicalPlan;

import java.util.stream.IntStream;

public abstract class AbstractLogicalPlan implements LogicalPlan {


    public String pretty(){
        return format(this, 0);
    }

    public static String format(LogicalPlan plan, int indent){
        StringBuilder b = new StringBuilder();
        IntStream.range(0, indent).forEach(i -> {
            b.append("\t");
        });
        b.append(plan.toString()).append("\n");
        plan.children().forEach(p-> {
            b.append(format(p, indent + 1));
        });
        return b.toString();
    }

}