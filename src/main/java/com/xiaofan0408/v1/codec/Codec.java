package com.xiaofan0408.v1.codec;

public class Codec {
    public static String TABLE_PREFIX = "/table/";

    // /test/primary/10	Ø
// /test/primary/10/floatVal	4.5
// /test/primary/10/stringVal	"hello”

 public static String encodeTableKey(String database,String table){
     return Codec.TABLE_PREFIX + database + "/" + table;
 }


  public static String encodeRecordKey(String database,String table,String id){
      return  "/" + database + "/" + table + "/primary" + "/" + id;
  }

  public static String encodeRecordFieldKey(String database,String table,String id,String field){
    return  "/" + database + "/" + table + "/primary" + "/" + id + "/" + field;  
  }

}
