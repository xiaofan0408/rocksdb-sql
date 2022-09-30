package com.xiaofan0408.parser;

import com.xiaofan0408.parser.antlr.SqlBaseBaseVisitor;
import com.xiaofan0408.parser.antlr.SqlBaseParser;
import com.xiaofan0408.parser.antlr.SqlBaseParser.SingleStatementContext;
import com.xiaofan0408.parser.model.ColumnDefinition;
import com.xiaofan0408.parser.operate.CreateTable;
import com.xiaofan0408.parser.operate.OperateBase;



public class SqlVisitor extends SqlBaseBaseVisitor<OperateBase> {

    @Override
    public OperateBase visitSingleStatement(SingleStatementContext ctx) {
        return ctx.statement().accept(this);
    }

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
       CreateTable operateBase = new CreateTable();
       String tableName = ctx.createStatement().tablenName.getText();
       operateBase.setTableName(tableName);
        for (int i = 0 ;i < ctx.createStatement().identifier().size();i++) {
            SqlBaseParser.IdentifierContext identifierContext = ctx.createStatement().identifier(i);
            SqlBaseParser.DataTypeContext dataTypeContext = ctx.createStatement().dataType(i);
            ColumnDefinition columnDefinition = new ColumnDefinition(dataTypeContext.getText(),identifierContext.getText());
            operateBase.addColumn(columnDefinition);
        }
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
