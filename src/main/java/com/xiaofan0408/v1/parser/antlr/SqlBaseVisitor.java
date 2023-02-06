// Generated from E:/code/java4/rocksdb-sql/g4\SqlBase.g4 by ANTLR 4.10.1
package com.xiaofan0408.v1.parser.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SqlBaseParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SqlBaseVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#singleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleStatement(SqlBaseParser.SingleStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showSchemaStatement}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowSchemaStatement(SqlBaseParser.ShowSchemaStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showTableStatement}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowTableStatement(SqlBaseParser.ShowTableStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createTableStatement}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableStatement(SqlBaseParser.CreateTableStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code deleteValueStatement}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteValueStatement(SqlBaseParser.DeleteValueStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code insertValueStatement}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertValueStatement(SqlBaseParser.InsertValueStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code QueryStatement}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryStatement(SqlBaseParser.QueryStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code copyFileStatement}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopyFileStatement(SqlBaseParser.CopyFileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#showSchema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowSchema(SqlBaseParser.ShowSchemaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#showTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowTable(SqlBaseParser.ShowTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#createStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateStatement(SqlBaseParser.CreateStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#indexClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexClause(SqlBaseParser.IndexClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#deleteStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteStatement(SqlBaseParser.DeleteStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#insertStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertStatement(SqlBaseParser.InsertStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#copyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopyStatement(SqlBaseParser.CopyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#selectStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectStatement(SqlBaseParser.SelectStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#selectClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectClause(SqlBaseParser.SelectClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#fromCluse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromCluse(SqlBaseParser.FromCluseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#whereCluse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereCluse(SqlBaseParser.WhereCluseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#expressionStruct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStruct(SqlBaseParser.ExpressionStructContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SqlBaseParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link SqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalNot(SqlBaseParser.LogicalNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanExpressionDefaule}
	 * labeled alternative in {@link SqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanExpressionDefaule(SqlBaseParser.BooleanExpressionDefauleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalBinary}
	 * labeled alternative in {@link SqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalBinary(SqlBaseParser.LogicalBinaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueExpressionDefault}
	 * labeled alternative in {@link SqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueExpressionDefault(SqlBaseParser.ValueExpressionDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link SqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(SqlBaseParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmeticBinary}
	 * labeled alternative in {@link SqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticBinary(SqlBaseParser.ArithmeticBinaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmeticUnary}
	 * labeled alternative in {@link SqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticUnary(SqlBaseParser.ArithmeticUnaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code columnReference}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnReference(SqlBaseParser.ColumnReferenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constantValue}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantValue(SqlBaseParser.ConstantValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedExpression(SqlBaseParser.ParenthesizedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link SqlBaseParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(SqlBaseParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberLiteral}
	 * labeled alternative in {@link SqlBaseParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberLiteral(SqlBaseParser.NumberLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link SqlBaseParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(SqlBaseParser.BooleanLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataType(SqlBaseParser.DataTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code columnWithTable}
	 * labeled alternative in {@link SqlBaseParser#columnIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnWithTable(SqlBaseParser.ColumnWithTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code columnWithoutTable}
	 * labeled alternative in {@link SqlBaseParser#columnIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnWithoutTable(SqlBaseParser.ColumnWithoutTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableIdentifierDefault}
	 * labeled alternative in {@link SqlBaseParser#tableIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableIdentifierDefault(SqlBaseParser.TableIdentifierDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableAlias}
	 * labeled alternative in {@link SqlBaseParser#tableIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableAlias(SqlBaseParser.TableAliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(SqlBaseParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(SqlBaseParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#predicateOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicateOperator(SqlBaseParser.PredicateOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#booleanValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanValue(SqlBaseParser.BooleanValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link SqlBaseParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(SqlBaseParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code floatLiteral}
	 * labeled alternative in {@link SqlBaseParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLiteral(SqlBaseParser.FloatLiteralContext ctx);
}