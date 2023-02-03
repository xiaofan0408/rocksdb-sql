package com.xiaofan0408v2.logicalplan.impl;

import com.xiaofan0408v2.common.BinaryExprType;
import com.xiaofan0408v2.datatype.DataType;
import com.xiaofan0408v2.datatype.Field;
import com.xiaofan0408v2.logicalplan.BinaryExpr;
import com.xiaofan0408v2.logicalplan.LogicExpr;
import com.xiaofan0408v2.logicalplan.LogicalPlan;

public class BooleanBinaryExpr extends BinaryExpr {

    private String name;

    private String op;

    private LogicExpr l;

    private LogicExpr r;

    public BooleanBinaryExpr(String name, String op, LogicExpr l,LogicExpr r){
        super(name, op, l, r);
    }

    @Override
    public Field toField(LogicalPlan plan) {
        return Field.of(DataType.BooleanType,name);
    }

    public static BooleanBinaryExpr eq(LogicExpr l, LogicExpr r){
        return new BooleanBinaryExpr(BinaryExprType.Eq.getName(), BinaryExprType.Eq.getOp(), l, r);
    }

    public static BooleanBinaryExpr neq(LogicExpr l, LogicExpr r){
        return new BooleanBinaryExpr(BinaryExprType.Neq.getName(), BinaryExprType.Neq.getOp(), l, r);
    }
    
    public static BooleanBinaryExpr gt(LogicExpr l, LogicExpr r){
        return new BooleanBinaryExpr(BinaryExprType.Gt.getName(), BinaryExprType.Gt.getOp(), l, r);
    }
    
    public static BooleanBinaryExpr Gteq(LogicExpr l, LogicExpr r){
        return new BooleanBinaryExpr(BinaryExprType.GtEq.getName(), BinaryExprType.GtEq.getOp(), l, r);
    }
    
    public static BooleanBinaryExpr lt(LogicExpr l, LogicExpr r){
        return new BooleanBinaryExpr(BinaryExprType.Lt.getName(), BinaryExprType.Lt.getOp(), l, r);
    }
    
    public static BooleanBinaryExpr lteq(LogicExpr l, LogicExpr r){
        return new BooleanBinaryExpr(BinaryExprType.LtEq.getName(), BinaryExprType.LtEq.getOp(), l, r);
    }

    public static BooleanBinaryExpr and(LogicExpr l, LogicExpr r){
        return new BooleanBinaryExpr(BinaryExprType.And.getName(), BinaryExprType.And.getOp(), l, r);
    }

    public static BooleanBinaryExpr or(LogicExpr l, LogicExpr r){
        return new BooleanBinaryExpr(BinaryExprType.Or.getName(), BinaryExprType.Or.getOp(), l, r);
    }
}