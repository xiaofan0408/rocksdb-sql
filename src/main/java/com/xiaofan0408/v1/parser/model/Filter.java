package com.xiaofan0408.v1.parser.model;

public class Filter {

    private String column;

    private String operate;

    private String value;

    public Filter(String column, String operate, String value) {
        this.column = column;
        this.operate = operate;
        this.value = value;
    }

    public Filter() {
    }

    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    public String getoperate() {
        return operate;
    }

    public void setoperate(String operate) {
        this.operate = operate;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
