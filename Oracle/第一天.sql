--������ռ�
create tablespace ��ռ����� datafile '·��' size ��СM
[autoextend on next ��СM maxsize ��СM];

create tablespace p03 datafile 'd:/data/oracle/p03.dbf' size 10m
autoextend on next 5m maxsize 200m;

--������ʱ��ռ�
create temporary tablespace ��ռ����� tempfile '·��' size ��СM
[autoextend on next ��СM maxsize ��СM];

create temporary tablespace p03t tempfile 'd:/data/oracle/p03t.dbf' size 10m
autoextend on next 5m maxsize 200m;

--����ռ�����һ�������ļ�
alter tablespace p03 add datafile 'd:/data/oracle/p03-1.dbf' size 10m;

--�޸ı�ռ������
alter tablespace p03 rename to p3;

--���ñ�ռ�Ϊֻ��
alter tablespace p3 read only;

--ɾ����ռ�
drop tablespace p03t; 
--ɾ����ռ䲢�ҽ������ļ�һ��ɾ��
drop tablespace p3  INCLUDING CONTENTS AND DATAFILES;

--�����û�
create user zhangsan identified by a123456 
default tablespace p03 temporary tablespace p03t;

--��Ȩ
grant create session to zhangsan;
--����Ȩ��
revoke create session from zhangsan;

grant dba to zhangsan;

