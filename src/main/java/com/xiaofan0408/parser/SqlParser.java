package com.xiaofan0408.parser;

import com.xiaofan0408.parser.antlr.SqlBaseLexer;
import com.xiaofan0408.parser.antlr.SqlBaseParser;
import com.xiaofan0408.parser.operate.OperateBase;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class SqlParser {

    private SqlVisitor sqlVisitor = new SqlVisitor();

    public OperateBase parseSql(String database,String sql){
        CharStream input = CharStreams.fromString(sql);
        SqlBaseLexer lexer = new SqlBaseLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SqlBaseParser parser = new SqlBaseParser(tokens);
        ParseTree parseTree = parser.singleStatement();
        OperateBase operateBase = sqlVisitor.visit(parseTree);
        operateBase.setDatabase(database);
        return operateBase;
    }

}
