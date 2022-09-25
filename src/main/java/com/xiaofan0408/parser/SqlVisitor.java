package com.xiaofan0408.parser;

import com.xiaofan0408.parser.antlr.SqlBaseParser;
import com.xiaofan0408.parser.antlr.SqlBaseVisitor;
import com.xiaofan0408.parser.operate.OperateBase;

public class SqlVisitor implements SqlBaseVisitor<OperateBase> {
    @Override
    public OperateBase visitSingleStatement(SqlBaseParser.SingleStatementContext ctx) {
        return null;
    }

    @Override
    public OperateBase visitShowSchemaStatement(SqlBaseParser.ShowSchemaStatementContext ctx) {
        return null;
    }

    @Override
    public OperateBase visitShowTableStatement(SqlBaseParser.ShowTableStatementContext ctx) {
        return null;
    }

    @Override
    public OperateBase visitCreateTableStatement(SqlBaseParser.CreateTableStatementContext ctx) {
        return null;
    }

    @Override
    public OperateBase visitDeleteValueStatement(SqlBaseParser.DeleteValueStatementContext ctx) {
        return null;
    }

    @Override
    public OperateBase visitInsertValueStatement(SqlBaseParser.InsertValueStatementContext ctx) {
        return null;
    }

    @Override
    public OperateBase visitQueryStatement(SqlBaseParser.QueryStatementContext ctx) {
        return null;
    }

    @Override
    public OperateBase visitCopyFileStatement(SqlBaseParser.CopyFileStatementContext ctx) {
        return null;
    }

    @Override
    public OperateBase visitShowSchema(SqlBaseParser.ShowSchemaContext ctx) {
        return null;
    }

    @Override
    public OperateBase visitShowTable(SqlBaseParser.ShowTableContext ctx) {
        return null;
    }

    @Override
    public OperateBase visitCreateStatement(SqlBaseParser.CreateStatementContext ctx) {
        return null;
    }

    @Override
    public OperateBase visitIndexClause(SqlBaseParser.IndexClauseContext ctx) {
        return null;
    }

    @Override
    public OperateBase visitDeleteStatement(SqlBaseParser.DeleteStatementContext ctx) {
        return null;
    }

    @Override
    public OperateBase visitInsertStatement(SqlBaseParser.InsertStatementContext ctx) {
        return null;
    }

    @Override
    public OperateBase visitCopyStatement(SqlBaseParser.CopyStatementContext ctx) {
        return null;
    }

    @Override
    public OperateBase visitSelectStatement(SqlBaseParser.SelectStatementContext ctx) {
        return null;
    }

    @Override
    public OperateBase visitSelectClause(SqlBaseParser.SelectClauseContext ctx) {
        return null;
    }

    @Override
    public OperateBase visitFromCluse(SqlBaseParser.FromCluseContext ctx) {
        return null;
    }

    @Override
    public OperateBase visitWhereCluse(SqlBaseParser.WhereCluseContext ctx) {
        return null;
    }

    @Override
    public OperateBase visitExpressionStruct(SqlBaseParser.ExpressionStructContext ctx) {
        return null;
    }

    @Override
    public OperateBase visitExpression(SqlBaseParser.ExpressionContext ctx) {
        return null;
    }

    @Override
    public OperateBase visitLogicalNot(SqlBaseParser.LogicalNotContext ctx) {
        return null;
    }

    @Override
    public OperateBase visitBooleanExpressionDefaule(SqlBaseParser.BooleanExpressionDefauleContext ctx) {
        return null;
    }

    @Override
    public OperateBase visitLogicalBinary(SqlBaseParser.LogicalBinaryContext ctx) {
        return null;
    }

    @Override
    public OperateBase visitValueExpressionDefault(SqlBaseParser.ValueExpressionDefaultContext ctx) {
        return null;
    }

    @Override
    public OperateBase visitComparison(SqlBaseParser.ComparisonContext ctx) {
        return null;
    }

    @Override
    public OperateBase visitArithmeticBinary(SqlBaseParser.ArithmeticBinaryContext ctx) {
        return null;
    }

    @Override
    public OperateBase visitArithmeticUnary(SqlBaseParser.ArithmeticUnaryContext ctx) {
        return null;
    }

    @Override
    public OperateBase visitColumnReference(SqlBaseParser.ColumnReferenceContext ctx) {
        return null;
    }

    @Override
    public OperateBase visitConstantValue(SqlBaseParser.ConstantValueContext ctx) {
        return null;
    }

    @Override
    public OperateBase visitParenthesizedExpression(SqlBaseParser.ParenthesizedExpressionContext ctx) {
        return null;
    }

    @Override
    public OperateBase visitStringLiteral(SqlBaseParser.StringLiteralContext ctx) {
        return null;
    }

    @Override
    public OperateBase visitNumberLiteral(SqlBaseParser.NumberLiteralContext ctx) {
        return null;
    }

    @Override
    public OperateBase visitBooleanLiteral(SqlBaseParser.BooleanLiteralContext ctx) {
        return null;
    }

    @Override
    public OperateBase visitDataType(SqlBaseParser.DataTypeContext ctx) {
        return null;
    }

    @Override
    public OperateBase visitColumnWithTable(SqlBaseParser.ColumnWithTableContext ctx) {
        return null;
    }

    @Override
    public OperateBase visitColumnWithoutTable(SqlBaseParser.ColumnWithoutTableContext ctx) {
        return null;
    }

    @Override
    public OperateBase visitTableIdentifierDefault(SqlBaseParser.TableIdentifierDefaultContext ctx) {
        return null;
    }

    @Override
    public OperateBase visitTableAlias(SqlBaseParser.TableAliasContext ctx) {
        return null;
    }

    @Override
    public OperateBase visitIdentifier(SqlBaseParser.IdentifierContext ctx) {
        return null;
    }

    @Override
    public OperateBase visitComparisonOperator(SqlBaseParser.ComparisonOperatorContext ctx) {
        return null;
    }

    @Override
    public OperateBase visitPredicateOperator(SqlBaseParser.PredicateOperatorContext ctx) {
        return null;
    }

    @Override
    public OperateBase visitBooleanValue(SqlBaseParser.BooleanValueContext ctx) {
        return null;
    }

    @Override
    public OperateBase visitIntegerLiteral(SqlBaseParser.IntegerLiteralContext ctx) {
        return null;
    }

    @Override
    public OperateBase visitFloatLiteral(SqlBaseParser.FloatLiteralContext ctx) {
        return null;
    }
}
