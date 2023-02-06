// Generated from E:/code/java4/rocksdb-sql/g4\SqlBase.g4 by ANTLR 4.10.1
package com.xiaofan0408.v1.parser.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SqlBaseParser}.
 */
public interface SqlBaseListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#singleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSingleStatement(SqlBaseParser.SingleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#singleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSingleStatement(SqlBaseParser.SingleStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showSchemaStatement}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowSchemaStatement(SqlBaseParser.ShowSchemaStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showSchemaStatement}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowSchemaStatement(SqlBaseParser.ShowSchemaStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showTableStatement}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowTableStatement(SqlBaseParser.ShowTableStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showTableStatement}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowTableStatement(SqlBaseParser.ShowTableStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createTableStatement}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableStatement(SqlBaseParser.CreateTableStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createTableStatement}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableStatement(SqlBaseParser.CreateTableStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code deleteValueStatement}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDeleteValueStatement(SqlBaseParser.DeleteValueStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code deleteValueStatement}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDeleteValueStatement(SqlBaseParser.DeleteValueStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code insertValueStatement}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterInsertValueStatement(SqlBaseParser.InsertValueStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code insertValueStatement}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitInsertValueStatement(SqlBaseParser.InsertValueStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code QueryStatement}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterQueryStatement(SqlBaseParser.QueryStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code QueryStatement}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitQueryStatement(SqlBaseParser.QueryStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code copyFileStatement}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCopyFileStatement(SqlBaseParser.CopyFileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code copyFileStatement}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCopyFileStatement(SqlBaseParser.CopyFileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#showSchema}.
	 * @param ctx the parse tree
	 */
	void enterShowSchema(SqlBaseParser.ShowSchemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#showSchema}.
	 * @param ctx the parse tree
	 */
	void exitShowSchema(SqlBaseParser.ShowSchemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#showTable}.
	 * @param ctx the parse tree
	 */
	void enterShowTable(SqlBaseParser.ShowTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#showTable}.
	 * @param ctx the parse tree
	 */
	void exitShowTable(SqlBaseParser.ShowTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#createStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreateStatement(SqlBaseParser.CreateStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#createStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreateStatement(SqlBaseParser.CreateStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#indexClause}.
	 * @param ctx the parse tree
	 */
	void enterIndexClause(SqlBaseParser.IndexClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#indexClause}.
	 * @param ctx the parse tree
	 */
	void exitIndexClause(SqlBaseParser.IndexClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#deleteStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeleteStatement(SqlBaseParser.DeleteStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#deleteStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeleteStatement(SqlBaseParser.DeleteStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#insertStatement}.
	 * @param ctx the parse tree
	 */
	void enterInsertStatement(SqlBaseParser.InsertStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#insertStatement}.
	 * @param ctx the parse tree
	 */
	void exitInsertStatement(SqlBaseParser.InsertStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#copyStatement}.
	 * @param ctx the parse tree
	 */
	void enterCopyStatement(SqlBaseParser.CopyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#copyStatement}.
	 * @param ctx the parse tree
	 */
	void exitCopyStatement(SqlBaseParser.CopyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectStatement(SqlBaseParser.SelectStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectStatement(SqlBaseParser.SelectStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#selectClause}.
	 * @param ctx the parse tree
	 */
	void enterSelectClause(SqlBaseParser.SelectClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#selectClause}.
	 * @param ctx the parse tree
	 */
	void exitSelectClause(SqlBaseParser.SelectClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#fromCluse}.
	 * @param ctx the parse tree
	 */
	void enterFromCluse(SqlBaseParser.FromCluseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#fromCluse}.
	 * @param ctx the parse tree
	 */
	void exitFromCluse(SqlBaseParser.FromCluseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#whereCluse}.
	 * @param ctx the parse tree
	 */
	void enterWhereCluse(SqlBaseParser.WhereCluseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#whereCluse}.
	 * @param ctx the parse tree
	 */
	void exitWhereCluse(SqlBaseParser.WhereCluseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#expressionStruct}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStruct(SqlBaseParser.ExpressionStructContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#expressionStruct}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStruct(SqlBaseParser.ExpressionStructContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SqlBaseParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SqlBaseParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link SqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalNot(SqlBaseParser.LogicalNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link SqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalNot(SqlBaseParser.LogicalNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanExpressionDefaule}
	 * labeled alternative in {@link SqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpressionDefaule(SqlBaseParser.BooleanExpressionDefauleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanExpressionDefaule}
	 * labeled alternative in {@link SqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpressionDefaule(SqlBaseParser.BooleanExpressionDefauleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalBinary}
	 * labeled alternative in {@link SqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalBinary(SqlBaseParser.LogicalBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalBinary}
	 * labeled alternative in {@link SqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalBinary(SqlBaseParser.LogicalBinaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueExpressionDefault}
	 * labeled alternative in {@link SqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterValueExpressionDefault(SqlBaseParser.ValueExpressionDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueExpressionDefault}
	 * labeled alternative in {@link SqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitValueExpressionDefault(SqlBaseParser.ValueExpressionDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link SqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterComparison(SqlBaseParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link SqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitComparison(SqlBaseParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticBinary}
	 * labeled alternative in {@link SqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticBinary(SqlBaseParser.ArithmeticBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticBinary}
	 * labeled alternative in {@link SqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticBinary(SqlBaseParser.ArithmeticBinaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticUnary}
	 * labeled alternative in {@link SqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticUnary(SqlBaseParser.ArithmeticUnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticUnary}
	 * labeled alternative in {@link SqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticUnary(SqlBaseParser.ArithmeticUnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code columnReference}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterColumnReference(SqlBaseParser.ColumnReferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code columnReference}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitColumnReference(SqlBaseParser.ColumnReferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constantValue}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantValue(SqlBaseParser.ConstantValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constantValue}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantValue(SqlBaseParser.ConstantValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(SqlBaseParser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(SqlBaseParser.ParenthesizedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link SqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(SqlBaseParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link SqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(SqlBaseParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberLiteral}
	 * labeled alternative in {@link SqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterNumberLiteral(SqlBaseParser.NumberLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberLiteral}
	 * labeled alternative in {@link SqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitNumberLiteral(SqlBaseParser.NumberLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link SqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(SqlBaseParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link SqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(SqlBaseParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(SqlBaseParser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(SqlBaseParser.DataTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code columnWithTable}
	 * labeled alternative in {@link SqlBaseParser#columnIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterColumnWithTable(SqlBaseParser.ColumnWithTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code columnWithTable}
	 * labeled alternative in {@link SqlBaseParser#columnIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitColumnWithTable(SqlBaseParser.ColumnWithTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code columnWithoutTable}
	 * labeled alternative in {@link SqlBaseParser#columnIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterColumnWithoutTable(SqlBaseParser.ColumnWithoutTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code columnWithoutTable}
	 * labeled alternative in {@link SqlBaseParser#columnIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitColumnWithoutTable(SqlBaseParser.ColumnWithoutTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableIdentifierDefault}
	 * labeled alternative in {@link SqlBaseParser#tableIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterTableIdentifierDefault(SqlBaseParser.TableIdentifierDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableIdentifierDefault}
	 * labeled alternative in {@link SqlBaseParser#tableIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitTableIdentifierDefault(SqlBaseParser.TableIdentifierDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableAlias}
	 * labeled alternative in {@link SqlBaseParser#tableIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterTableAlias(SqlBaseParser.TableAliasContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableAlias}
	 * labeled alternative in {@link SqlBaseParser#tableIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitTableAlias(SqlBaseParser.TableAliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(SqlBaseParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(SqlBaseParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(SqlBaseParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(SqlBaseParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#predicateOperator}.
	 * @param ctx the parse tree
	 */
	void enterPredicateOperator(SqlBaseParser.PredicateOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#predicateOperator}.
	 * @param ctx the parse tree
	 */
	void exitPredicateOperator(SqlBaseParser.PredicateOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void enterBooleanValue(SqlBaseParser.BooleanValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void exitBooleanValue(SqlBaseParser.BooleanValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link SqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(SqlBaseParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link SqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(SqlBaseParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code floatLiteral}
	 * labeled alternative in {@link SqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void enterFloatLiteral(SqlBaseParser.FloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code floatLiteral}
	 * labeled alternative in {@link SqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void exitFloatLiteral(SqlBaseParser.FloatLiteralContext ctx);
}