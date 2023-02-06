package com.xiaofan0408.v2.physicalplan;

import com.xiaofan0408.v2.datatype.RecordBatch;
import com.xiaofan0408.v2.datatype.Schema;

import java.util.List;

public interface PhysicalPlan {

    Schema schema();

    List<RecordBatch> execute();

    List<PhysicalPlan> children();

}
