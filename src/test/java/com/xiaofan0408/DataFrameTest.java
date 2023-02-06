package com.xiaofan0408;

import com.xiaofan0408.v2.execution.ExecutionContext;
import com.xiaofan0408.v2.logicalplan.plan.AbstractLogicalPlan;
import com.xiaofan0408.v2.logicalplan.plan.LogicalPlan;
import com.xiaofan0408.v2.logicalplan.expression.impl.BooleanBinaryExpr;
import com.xiaofan0408.v2.logicalplan.expression.impl.Column;
import com.xiaofan0408.v2.logicalplan.expression.impl.LiteralString;
import org.junit.Test;

public class DataFrameTest {

    @Test
    public void test(){
        ExecutionContext ctx = new ExecutionContext();
        LogicalPlan plan = ctx.csv("employee")
                .filter(BooleanBinaryExpr.eq(Column.of("state"), new LiteralString("CO")))
                .project(Column.listOf("id",
                        "first_name",
                        "last_name",
                        "salary")
                        )
                .logicalPlan();

        System.out.println(AbstractLogicalPlan.format(plan,0));

    }

}
