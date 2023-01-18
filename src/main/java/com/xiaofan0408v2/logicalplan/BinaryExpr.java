package com.xiaofan0408v2.logicalplan;

public abstract class BinaryExpr implements LogicExpr{

    private String name;

    private String op;

    private LogicExpr l;

    private LogicExpr r;

    public BinaryExpr(String name, String op, LogicExpr l,LogicExpr r){
        this.name = name;
        this.op = op;
        this.l = l;
        this.r = r;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s ",l.toString() ,op, r.toString());
    }
}