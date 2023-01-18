package com.xiaofan0408v2.datatype;

import java.util.List;

public class RecordBatch{

    private Schema schema;

    private List<ColumnVector> fields;

    public RecordBatch(Schema schema, List<ColumnVector> fields){
        this.schema = schema;
        this.fields = fields;
    }

    public int rowCount(){
        return fields.stream().findFirst().get().size();
    }

    public int columnCount(){
        return fields.size();
    }

    public ColumnVector field(int i){
        return fields.get(i);
    }
}