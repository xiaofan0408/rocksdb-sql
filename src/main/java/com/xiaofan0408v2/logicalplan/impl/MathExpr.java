package com.xiaofan0408v2.logicalplan;

import com.xiaofan0408v2.common.BinaryExprType;
import com.xiaofan0408v2.datatype.DataType;
import com.xiaofan0408v2.datatype.Field;
import com.xiaofan0408v2.logicalplan.BinaryExpr;
import com.xiaofan0408v2.logicalplan.LogicExpr;
import com.xiaofan0408v2.logicalplan.LogicalPlan;

public class MathExpr extends BinaryExpr {

    private String name;

    private String op;

    private LogicExpr l;

    private LogicExpr r;

    public MathExpr(String name, String op, LogicExpr l,LogicExpr r){
        super(name, op, l, r);
    }

    @Override
    public Field toField(LogicalPlan plan) {
        return Field.of(l.toField(plan).getDataType(),name);
    }

    public static MathExpr add(LogicExpr l, LogicExpr r){
        return new MathExpr(BinaryExprType.Add.getName(), BinaryExprType.Add.getOp(), l, r);
    }

    public static MathExpr sub(LogicExpr l, LogicExpr r){
        return new MathExpr(BinaryExprType.Sub.getName(), BinaryExprType.Sub.getOp(), l, r);
    }

    public static MathExpr mult(LogicExpr l, LogicExpr r){
        return new MathExpr(BinaryExprType.Mult.getName(), BinaryExprType.Mult.getOp(), l, r);
    }

    public static MathExpr div(LogicExpr l, LogicExpr r){
        return new MathExpr(BinaryExprType.Div.getName(), BinaryExprType.Div.getOp(), l, r);
    }

    public static MathExpr mod(LogicExpr l, LogicExpr r){
        return new MathExpr(BinaryExprType.MOd.getName(), BinaryExprType.MOd.getOp(), l, r);
    }

}