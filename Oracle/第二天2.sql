--普通查询
select 列字段 from 用户名.表名 [where 条件];

select userid from zhangsan.userinfo;
select username,userage from zhangsan.userinfo ;
select username ,useraddress from zhangsan.userinfo where userage>28;
select * from zhangsan.userinfo;
--筛选部分行通过条件进行(也就是说通过where字句),筛选部分列通过select...from 进行
--排序查询 order by   desc|asc
select * from zhangsan.userinfo order by userage desc,userid;
select * from zhangsan.userinfo where usersex='男' order by userage;

--模糊查询 like %
select * from zhangsan.userinfo where username like '%张%';
select * from zhangsan.userinfo where username not like '%张%';

--为空查询 is null   is not null
select * from zhangsan.userinfo where username is null;

--常量查询
select 7 from dual;
select 7 ,'张三' from dual;

--唯一查询 distinct
select distinct usersex from zhangsan.userinfo;

--拼接查询 union,union all,minus,intersect

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

--重命名查询 as
select * from zhangsan.userinfo;
select u.userid as 编号,username as 姓名 from zhangsan.userinfo u;

--伪列查询 rowid rownum
select u.*,rownum,rowid from zhangsan.userinfo u;

--分页查询
select * from (
select * from(
select *from 
(
select u.*,rownum as rn from zhangsan.userinfo u 
) where rn<21 order by rn desc
)where rownum<11
) order by userid;


select * from zhangsan.userinfo where rownum=2;

--子查询:将一个查询的结果当成另一个查询的条件,这个查询就是子查询,外边的查询就是父查询
--和王璐年龄一样的人
select * from zhangsan.userinfo where userage=
(select userage from zhangsan.userinfo where username='王璐');
--注意:
--1.如果子查询的结果有多行,那么父查询条件判断是不能使用关系运算符,要使用范围运算 in或者not in
--2.子查询查询的结果只能为一列
--3.结果和条件必须是同一类型的

