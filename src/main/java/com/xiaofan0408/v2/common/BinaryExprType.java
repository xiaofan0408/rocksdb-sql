package com.xiaofan0408.v2.common;

public enum BinaryExprType{
   Eq("eq","="),
   Neq("neq","!="),
   Gt("gt",">"),
   GtEq("gteq",">="),
   Lt("lt","<"),
   LtEq("lteq","<="),
   And("and","AND"),
   Or("or","OR"),
   Add("add","+"),
   Sub("subtract","-"),
   Mult("mulr","*"),
   Div("div","/"),
   MOd("mod","%"),

   ;
    private String name;

    private String op;

    BinaryExprType(String name,String op){
        this.name = name;
        this.op = op;
    }

    public String getName() {
        return name;
    }
    public String getOp() {
        return op;
    }

}