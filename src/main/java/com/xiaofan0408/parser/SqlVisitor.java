package com.xiaofan0408.parser;

import java.util.ArrayList;
import java.util.List;

import com.xiaofan0408.parser.antlr.SqlBaseBaseVisitor;
import com.xiaofan0408.parser.antlr.SqlBaseParser;
import com.xiaofan0408.parser.antlr.SqlBaseParser.ExpressionStructContext;
import com.xiaofan0408.parser.antlr.SqlBaseParser.SingleStatementContext;
import com.xiaofan0408.parser.model.ColumnDefinition;
import com.xiaofan0408.parser.operate.CreateTable;
import com.xiaofan0408.parser.operate.InsertOpt;
import com.xiaofan0408.parser.operate.OperateBase;
import com.xiaofan0408.parser.operate.ShowTable;



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
        ShowTable showTable = new ShowTable();
        return showTable;
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
        InsertOpt insertOpt = new InsertOpt();
        String tableName = ctx.insertStatement().tableName.getText();
        insertOpt.setTableName(tableName);
        List<List<String>> values = new ArrayList<>();
        List<ExpressionStructContext> list = ctx.insertStatement().expressionStruct();
        for (ExpressionStructContext eStructContext : list) {
            List<String> objects = new ArrayList<>();
            eStructContext.expression().forEach(context -> {
                objects.add(context.getText());
            });
            values.add(objects);
        }

        insertOpt.setValues(values);
        return insertOpt;
    }

    @Override
    public OperateBase visitQueryStatement(SqlBaseParser.QueryStatementContext ctx) {
        System.out.println("visitQueryStatement");
        return super.visitQueryStatement(ctx);
    }
}
