package com.xiaofan0408v2.logicalplan;

import java.util.stream.IntStream;

public class AbstractLogicalPlan implements LogicalPlan{


    public String pretty(){
        return format(this, 0);
    }

    public String format(LogicalPlan plan, int indent){
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