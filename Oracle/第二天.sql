--users�������ڱ�������zhangsan�û���Ĭ�ϱ�ռ���
create table zhangsan.users
(
    userid int primary key,
    username varchar2(6 char) not null,
    usersex char(1 char) check(usersex='��'or usersex='Ů'),
    userage number(3) not null,
    userphone char(11 byte) unique,
    useraddress varchar2(50) default('��������')
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
--��Ҫ������commit,������ݾ����õı����ڴ�����,�ύ
commit;

insert into zhangsan.demo1 values(2);
--�ع�,�����ǻع�Ҳ��,�����ύҲ��,������һ������Ľ���
rollback;


--��������
insert into �û���.����[(���ֶ��б�)] values(ֵ�б�);

select * from zhangsan.users;

insert into zhangsan.users(userid,username,usersex,userage,userphone,useraddress)
values(1,'����','��',18,'13099998888',default);

--����
create sequence �û���.������ start with N increment by M;
create sequence zhangsan.seq1 start with 1 increment by 1;

--
select zhangsan.seq1.currval from dual;
select zhangsan.seq1.nextval from dual;

insert into zhangsan.users(userid,username,usersex,userage,userphone,useraddress)
values(zhangsan.seq1.nextval,'����','��',18,'13099998883',default);

--�������ݲ��� ����ʹ�����н���¼��ֵ
insert into zhangsan.users(userid,username,usersex,userage,userphone,useraddress)
select 7,'1','',11,'11','2' from dual union
select 8,'2','',11,'12','2' from dual union
select 9,'3','',11,'13','2' from dual ;

--���Ʒ�ʽһ
create table zhangsan.newTable 
as
select * from zhangsan.demo1;

create table �û���.����
as
select ���ֶ� from �û���.���� [where ����];

select * from zhangsan.newTable;
--���Ʒ�ʽ��
insert into zhangsan.newTable 
select userage from zhangsan.users;

insert into �û���.����[(���ֶ��б�)]
select ���ֶ� from �û���.���� [where ����];

--�޸����
update �û���.���� set ��=ֵ,... [where ����];
update zhangsan.demo1 set da = 2;
--ɾ�����
delete from �û���.���� [where ����];
delete from zhangsan.demo1;
truncate table �û���.����;
truncate table zhangsan.demo1;
drop delete truncate ?

select *from zhangsan.demo1;

-----------------------------------------------------------------------------
--Ȩ�޹���ϵͳ(ģ��)
�û�
Ȩ��
��ɫ
�û���ɫ��
��ɫȨ�ޱ�
�û�Ȩ�ޱ�

create tablespace anli1 datafile 'D:/data/oracle/al1.dbf' size 10m;
create user anli1 identified by a123456 default tablespace anli1;
grant dba to anli1;
--����һ��Ȩ�ޱ�
create table anli1.powers
(
   powerid int primary key,
   powername varchar2(20) not null,
   powerpath varchar2(100) not null
);
--��һ��Ҫ��:���ﲻ��Ҫ��������,����Ϊ���Ժ�Java��ʹ�÷���,¼��30����������
insert into anli1.powers values(1,'��¼','default');
insert into anli1.powers values(2,'���ѧ��','default');
insert into anli1.powers values(3,'ɾ��ѧ��','default');
insert into anli1.powers values(4,'�޸�ѧ��','default');
insert into anli1.powers values(5,'��ѯһ��һ��','default');
create table anli1.users
(
   userid int primary key,
   username varchar2(20),
   --�������������������
   userstate int
);
create sequence anli1.seq1 start with 1;
insert into anli1.users values(anli1.seq1.nextval,'����',1);
insert into anli1.users values(anli1.seq1.nextval,'����',1);
insert into anli1.users values(anli1.seq1.nextval,'����',1);
insert into anli1.users values(anli1.seq1.nextval,'����',1);
commit;

create table anli1.roles
(
   roleId int primary key,
   roleName varchar2(20),
   roleLv int
);
create sequence anli1.seq2 start with 1;
insert into anli1.roles values(anli1.seq2.nextval,'����Ա',2);
insert into anli1.roles values(anli1.seq2.nextval,'�ܾ���',1);
insert into anli1.roles values(anli1.seq2.nextval,'���ž���',3);
insert into anli1.roles values(anli1.seq2.nextval,'ְԱ',4);

--��ɫ��Ȩ�޹�����
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

--��ɫ���û�������
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

--�û���Ȩ�޹����� ,һ�㲻��ʹ��,�����������,�û���Ȩ��ֱ��ʱ
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
