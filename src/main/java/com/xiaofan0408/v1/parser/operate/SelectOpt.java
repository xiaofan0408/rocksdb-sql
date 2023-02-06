package com.xiaofan0408.v1.parser.operate;
import java.util.List;

import com.xiaofan0408.v1.parser.model.Filter;


public class SelectOpt extends OperateBase{

    private String tableName;

    private List<String> cols;

    private List<Filter> filters;

    public SelectOpt(String tableName, List<String> cols, List<Filter> filters) {
        this.tableName = tableName;
        this.cols = cols;
        this.filters = filters;
    }

    public SelectOpt() {
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public List<String> getCols() {
        return cols;
    }

    public void setCols(List<String> cols) {
        this.cols = cols;
    }

    public List<Filter> getFilters() {
        return filters;
    }

    public void setFilters(List<Filter> filters) {
        this.filters = filters;
    }
}
