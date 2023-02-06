package com.xiaofan0408;

import com.xiaofan0408.v1.parser.SqlParser;
import com.xiaofan0408.v1.parser.operate.OperateBase;
import org.junit.Test;

public class ParserTest {

    @Test
    public void testCreateTable(){
        SqlParser sqlParser = new SqlParser();
        OperateBase operateBase = sqlParser.parseSql("test","CREATE TABLE T1(T1A INTEGER, T1B STRING, T1C FLOAT, T1D BOOLEAN);");
        System.out.println(operateBase);
    }

}
