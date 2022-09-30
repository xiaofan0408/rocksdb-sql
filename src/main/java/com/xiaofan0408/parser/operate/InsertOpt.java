package com.xiaofan0408.parser.operate;
import java.util.List;


public class InsertOpt extends OperateBase{

    private String tableName;

    private List<List<Object>> values;
    
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public List<List<Object>> getValues() {
        return values;
    }

    public void setValues(List<List<Object>> values) {
        this.values = values;
    }

}
