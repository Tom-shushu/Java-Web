--创建表空间
create tablespace 表空间名字 datafile '路径' size 大小M
[autoextend on next 大小M maxsize 大小M];

create tablespace p03 datafile 'd:/data/oracle/p03.dbf' size 10m
autoextend on next 5m maxsize 200m;

--创建临时表空间
create temporary tablespace 表空间名字 tempfile '路径' size 大小M
[autoextend on next 大小M maxsize 大小M];

create temporary tablespace p03t tempfile 'd:/data/oracle/p03t.dbf' size 10m
autoextend on next 5m maxsize 200m;

--给表空间增加一个数据文件
alter tablespace p03 add datafile 'd:/data/oracle/p03-1.dbf' size 10m;

--修改表空间的名字
alter tablespace p03 rename to p3;

--设置表空间为只读
alter tablespace p3 read only;

--删除表空间
drop tablespace p03t; 
--删除表空间并且将物理文件一并删除
drop tablespace p3  INCLUDING CONTENTS AND DATAFILES;

--创建用户
create user zhangsan identified by a123456 
default tablespace p03 temporary tablespace p03t;

--授权
grant create session to zhangsan;
--撤销权限
revoke create session from zhangsan;

grant dba to zhangsan;

