--��ͨ��ѯ
select ���ֶ� from �û���.���� [where ����];

select userid from zhangsan.userinfo;
select username,userage from zhangsan.userinfo ;
select username ,useraddress from zhangsan.userinfo where userage>28;
select * from zhangsan.userinfo;
--ɸѡ������ͨ����������(Ҳ����˵ͨ��where�־�),ɸѡ������ͨ��select...from ����
--�����ѯ order by   desc|asc
select * from zhangsan.userinfo order by userage desc,userid;
select * from zhangsan.userinfo where usersex='��' order by userage;

--ģ����ѯ like %
select * from zhangsan.userinfo where username like '%��%';
select * from zhangsan.userinfo where username not like '%��%';

--Ϊ�ղ�ѯ is null   is not null
select * from zhangsan.userinfo where username is null;

--������ѯ
select 7 from dual;
select 7 ,'����' from dual;

--Ψһ��ѯ distinct
select distinct usersex from zhangsan.userinfo;

--ƴ�Ӳ�ѯ union,union all,minus,intersect

select distinct useraddress from zhangsan.userinfo
union all
select useraddress from zhangsan.userinfo where userid=1;

select * from zhangsan.m
union all
select * from zhangsan.m where a>40;

select * from zhangsan.m;

select floor(dbms_random.value(100,400)) from dual;

select * from zhangsan.m
minus
select floor(dbms_random.value(100,400))-a from zhangsan.m;

select * from zhangsan.m
intersect
select * from zhangsan.m where a<30;

select * from zhangsan.m
minus
select * from zhangsan.m where a<30;

drop table zhangsan.m;

--��������ѯ as
select * from zhangsan.userinfo;
select u.userid as ���,username as ���� from zhangsan.userinfo u;

--α�в�ѯ rowid rownum
select u.*,rownum,rowid from zhangsan.userinfo u;

--��ҳ��ѯ
select * from (
select * from(
select *from 
(
select u.*,rownum as rn from zhangsan.userinfo u 
) where rn<21 order by rn desc
)where rownum<11
) order by userid;


select * from zhangsan.userinfo where rownum=2;

--�Ӳ�ѯ:��һ����ѯ�Ľ��������һ����ѯ������,�����ѯ�����Ӳ�ѯ,��ߵĲ�ѯ���Ǹ���ѯ
--���������һ������
select * from zhangsan.userinfo where userage=
(select userage from zhangsan.userinfo where username='���');
--ע��:
--1.����Ӳ�ѯ�Ľ���ж���,��ô����ѯ�����ж��ǲ���ʹ�ù�ϵ�����,Ҫʹ�÷�Χ���� in����not in
--2.�Ӳ�ѯ��ѯ�Ľ��ֻ��Ϊһ��
--3.���������������ͬһ���͵�

