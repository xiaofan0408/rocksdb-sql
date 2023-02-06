package com.xiaofan0408.v1.parser.operate;
import java.util.List;


public class InsertOpt extends OperateBase{

    private String tableName;

    private List<List<String>> values;
    
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public List<List<String>> getValues() {
        return values;
    }

    public void setValues(List<List<String>> values) {
        this.values = values;
    }

    @Override
    public String toString() {
        return "InsertOpt{" +
                "tableName='" + tableName + '\'' +
                ", values=" + values +
                '}';
    }

}
