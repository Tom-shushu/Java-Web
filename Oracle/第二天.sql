--users表它现在被创建到zhangsan用户的默认表空间中
create table zhangsan.users
(
    userid int primary key,
    username varchar2(6 char) not null,
    usersex char(1 char) check(usersex='男'or usersex='女'),
    userage number(3) not null,
    userphone char(11 byte) unique,
    useraddress varchar2(50) default('陕西西安')
);

create table zhangsan.logs
(
    logid int,
    logcontent clob not null,
    logdata date,
    userid int,
    primary key(logid),
    foreign key(userid) references zhangsan.users(userid)
);

create table zhangsan.demo1
(
    da int
);

alter table zhangsan.demo1 rename column da to column1;
alter table zhangsan.demo1 modify(column1 varchar2(20));
alter table zhangsan.demo1 add(column2 int);
alter table zhangsan.demo1 rename to demo2;

alter table zhangsan.demo2 add constraint PK_AAA primary key(column1,column2);


drop table zhangsan.demo2;

select * from zhangsan.demo1;

insert into zhangsan.demo1 values(1);
--主要进行了commit,这个数据就永久的保存在磁盘中,提交
commit;

insert into zhangsan.demo1 values(2);
--回滚,不管是回滚也好,还是提交也好,都代表一个事务的结束
rollback;


--插入数据
insert into 用户名.表名[(列字段列表)] values(值列表);

select * from zhangsan.users;

insert into zhangsan.users(userid,username,usersex,userage,userphone,useraddress)
values(1,'张三','男',18,'13099998888',default);

--序列
create sequence 用户名.序列码 start with N increment by M;
create sequence zhangsan.seq1 start with 1 increment by 1;

--
select zhangsan.seq1.currval from dual;
select zhangsan.seq1.nextval from dual;

insert into zhangsan.users(userid,username,usersex,userage,userphone,useraddress)
values(zhangsan.seq1.nextval,'张三','男',18,'13099998883',default);

--多行数据插入 不能使用序列进行录入值
insert into zhangsan.users(userid,username,usersex,userage,userphone,useraddress)
select 7,'1','',11,'11','2' from dual union
select 8,'2','',11,'12','2' from dual union
select 9,'3','',11,'13','2' from dual ;

--表复制方式一
create table zhangsan.newTable 
as
select * from zhangsan.demo1;

create table 用户名.表名
as
select 列字段 from 用户名.表名 [where 条件];

select * from zhangsan.newTable;
--表复制方式二
insert into zhangsan.newTable 
select userage from zhangsan.users;

insert into 用户名.表名[(列字段列表)]
select 列字段 from 用户名.表名 [where 条件];

--修改语句
update 用户名.表名 set 列=值,... [where 条件];
update zhangsan.demo1 set da = 2;
--删除语句
delete from 用户名.表名 [where 条件];
delete from zhangsan.demo1;
truncate table 用户名.表名;
truncate table zhangsan.demo1;
drop delete truncate ?

select *from zhangsan.demo1;

-----------------------------------------------------------------------------
--权限管理系统(模块)
用户
权限
角色
用户角色表
角色权限表
用户权限表

create tablespace anli1 datafile 'D:/data/oracle/al1.dbf' size 10m;
create user anli1 identified by a123456 default tablespace anli1;
grant dba to anli1;
--构建一个权限表
create table anli1.powers
(
   powerid int primary key,
   powername varchar2(20) not null,
   powerpath varchar2(100) not null
);
--第一个要求:这里不需要创建序列,这里为了以后Java中使用方便,录入30条以上数据
insert into anli1.powers values(1,'登录','default');
insert into anli1.powers values(2,'添加学生','default');
insert into anli1.powers values(3,'删除学生','default');
insert into anli1.powers values(4,'修改学生','default');
insert into anli1.powers values(5,'查询一年一班','default');
create table anli1.users
(
   userid int primary key,
   username varchar2(20),
   --不在添加其他非主属性
   userstate int
);
create sequence anli1.seq1 start with 1;
insert into anli1.users values(anli1.seq1.nextval,'张三',1);
insert into anli1.users values(anli1.seq1.nextval,'李四',1);
insert into anli1.users values(anli1.seq1.nextval,'王五',1);
insert into anli1.users values(anli1.seq1.nextval,'马六',1);
commit;

create table anli1.roles
(
   roleId int primary key,
   roleName varchar2(20),
   roleLv int
);
create sequence anli1.seq2 start with 1;
insert into anli1.roles values(anli1.seq2.nextval,'管理员',2);
insert into anli1.roles values(anli1.seq2.nextval,'总经理',1);
insert into anli1.roles values(anli1.seq2.nextval,'部门经理',3);
insert into anli1.roles values(anli1.seq2.nextval,'职员',4);

--角色和权限关联表
create table anli1.role_power
(
   roleid int ,
   powerid int,
   foreign key(roleid) references anli1.roles(roleid),
   foreign key(powerid) references anli1.powers(powerid) 
); 
insert into anli1.role_power values(1,1);
insert into anli1.role_power values(1,2);
insert into anli1.role_power values(1,3);

--角色和用户关联表
create table anli1.user_role
(
   userid int ,
   roleid int,
   foreign key(userid) references anli1.users(userid) ,
   foreign key(roleid) references anli1.roles(roleid)
); 
insert into anli1.user_role values(1,1);
insert into anli1.user_role values(2,2);
insert into anli1.user_role values(3,3);

--用户和权限关联表 ,一般不会使用,在特殊情况下,用户和权限直联时
create table anli1.user_power
(
   userid int ,
   powerid int,
   foreign key(userid) references anli1.users(userid) ,
   foreign key(powerid) references anli1.powers(powerid)
); 
insert into anli1.user_power values(1,1);
insert into anli1.user_power values(2,2);
insert into anli1.user_power values(3,3);
