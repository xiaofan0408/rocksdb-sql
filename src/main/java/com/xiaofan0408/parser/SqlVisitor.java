package com.xiaofan0408.parser;

import com.xiaofan0408.parser.antlr.SqlBaseBaseVisitor;
import com.xiaofan0408.parser.antlr.SqlBaseParser;
import com.xiaofan0408.parser.operate.OperateBase;


public class SqlVisitor extends SqlBaseBaseVisitor<OperateBase> {

    @Override
    public OperateBase visitShowSchemaStatement(SqlBaseParser.ShowSchemaStatementContext ctx) {
        System.out.println("visitShowSchemaStatement");
        return super.visitShowSchemaStatement(ctx);
    }

    @Override
    public OperateBase visitShowTableStatement(SqlBaseParser.ShowTableStatementContext ctx) {
        System.out.println("visitShowTableStatement");
        return super.visitShowTableStatement(ctx);
    }

    @Override
    public OperateBase visitCreateTableStatement(SqlBaseParser.CreateTableStatementContext ctx) {
       OperateBase operateBase = new OperateBase();
       String tableName = ctx.createStatement().tablenName.getText();

       return operateBase;
    }

    @Override
    public OperateBase visitDeleteValueStatement(SqlBaseParser.DeleteValueStatementContext ctx) {
        System.out.println("visitDeleteValueStatement");
        return super.visitDeleteValueStatement(ctx);
    }

    @Override
    public OperateBase visitInsertValueStatement(SqlBaseParser.InsertValueStatementContext ctx) {
        System.out.println("visitInsertValueStatement");
        return super.visitInsertValueStatement(ctx);
    }

    @Override
    public OperateBase visitQueryStatement(SqlBaseParser.QueryStatementContext ctx) {
        System.out.println("visitQueryStatement");
        return super.visitQueryStatement(ctx);
    }
}
