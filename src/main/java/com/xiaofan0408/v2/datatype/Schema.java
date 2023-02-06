package com.xiaofan0408.v2.datatype;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Schema{

    private List<Field> fields;

    public Schema(List<Field> fields){
        this.fields = fields;
    }


    public List<Field> getFields() {
        return fields;
    }

    public Schema select(List<String> projection) {
        List<Field> f = new ArrayList<>();
        projection.forEach(p -> {
            List<Field>  m = fields.stream().filter(it -> it.getName().equals(p)).collect(Collectors.toList());
            if (m.size() == 1) {
                f.add(m.get(0));
            } else {
                throw new IllegalArgumentException();
            }
        });
        return new Schema(f);
    }
}