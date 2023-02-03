package com.xiaofan0408v2.execution;


import com.xiaofan0408v2.datasource.CsvDataSource;
import com.xiaofan0408v2.logicalplan.DataFrame;
import com.xiaofan0408v2.logicalplan.impl.DataFrameImpl;
import com.xiaofan0408v2.logicalplan.impl.Scan;

import java.util.ArrayList;

/**
 * @author: xuzefan
 * @date: 2023/2/3 11:21
 */
public class ExecutionContext {

    public DataFrame csv(String filename){
        return new DataFrameImpl(new Scan(filename,new CsvDataSource(filename),new ArrayList<>()));
    }

}
