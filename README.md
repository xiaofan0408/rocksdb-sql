# RocksDB-sql

练习使用rocksdb, antlr4，以及sql解析

### 支持的语法

SHOW TABLES

CREATE TABLE T1(T1A INTEGER, T1B STRING, T1C FLOAT, T1D BOOLEAN);

SELECT A FROM B;

SELECT A FROM B, C WHERE E = F;

INSERT INTO T1 VALUES (1, 'aaa', 1.0), (2, 'bbb', 2.0), (3, 'ccc', 3.0);