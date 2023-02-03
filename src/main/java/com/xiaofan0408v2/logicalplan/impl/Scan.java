package com.xiaofan0408v2.logicalplan.impl;

import com.xiaofan0408v2.datasource.DataSource;
import com.xiaofan0408v2.datatype.Schema;
import com.xiaofan0408v2.logicalplan.AbstractLogicalPlan;
import com.xiaofan0408v2.logicalplan.LogicalPlan;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: xuzefan
 * @date: 2023/2/3 10:02
 */
public class Scan extends AbstractLogicalPlan {

    private String path;

    private DataSource dataSource;

    private List<String> projection;

    private Schema schema;

    public Scan(String path, DataSource dataSource, List<String> projection) {
        this.path = path;
        this.dataSource = dataSource;
        this.projection = projection;
        schema = deriveSchema();
    }

    private Schema deriveSchema() {
        Schema schema = dataSource.schema();
        if (projection.isEmpty()) {
            return schema;
        } else {
            return schema.select(projection);
        }

    }

    @Override
    public Schema schema() {
        return schema;
    }

    @Override
    public List<LogicalPlan> children() {
        return new ArrayList<>();
    }

    @Override
    public String toString() {
        if (projection.isEmpty()) {
           return  "Scan: "+ path+"; projection=None";
        } else {
           return  "Scan: "+path+"; projection=" + projection;
        }
    }
}
