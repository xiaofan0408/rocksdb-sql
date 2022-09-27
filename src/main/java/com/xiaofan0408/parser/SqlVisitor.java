package com.xiaofan0408.parser;

import com.xiaofan0408.parser.antlr.SqlBaseBaseVisitor;
import com.xiaofan0408.parser.antlr.SqlBaseParser;
import com.xiaofan0408.parser.operate.OperateBase;


public class SqlVisitor extends SqlBaseBaseVisitor<OperateBase> {

    @Override
    public OperateBase visitShowSchemaStatement(SqlBaseParser.ShowSchemaStatementContext ctx) {
        return super.visitShowSchemaStatement(ctx);
    }

    @Override
    public OperateBase visitShowTableStatement(SqlBaseParser.ShowTableStatementContext ctx) {
        return super.visitShowTableStatement(ctx);
    }

    @Override
    public OperateBase visitCreateTableStatement(SqlBaseParser.CreateTableStatementContext ctx) {
        return super.visitCreateTableStatement(ctx);
    }

    @Override
    public OperateBase visitDeleteStatement(SqlBaseParser.DeleteStatementContext ctx) {
        return super.visitDeleteStatement(ctx);
    }

    @Override
    public OperateBase visitInsertStatement(SqlBaseParser.InsertStatementContext ctx) {
        return super.visitInsertStatement(ctx);
    }

    @Override
    public OperateBase visitQueryStatement(SqlBaseParser.QueryStatementContext ctx) {
        return super.visitQueryStatement(ctx);
    }
}
