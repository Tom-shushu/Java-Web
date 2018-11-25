select * from zhangsan.emp;

select * from zhangsan.dept;

--1：选择部门编号为30的雇员
select * from zhangsan.emp where deptno = 30;
--2：列出所有办事员的姓名、编号和部门
select empno,ename,dname from zhangsan.emp e ,zhangsan.dept d   where job = 'CLERK' and e.deptno=d.deptno;
--3：找出佣金高于薪金的雇员
select * from zhangsan.emp where comm>sal;
--4：找出佣金高于薪金60%的雇员
select * from zhangsan.emp where comm>sal*0.6;
--5：找出部门10中所有经理和部门20中所有办事员的详细资料
select * from zhangsan.emp where deptno=10 and job='MANAGER'
union
select * from zhangsan.emp where deptno=20 and job='CLERK'
;
--6：找出部门10中所有经理和部门20中所有办事员以及既不是经理又不是办事员但其薪金大于或等于2000的所有雇员的详细资料
select * from zhangsan.emp where deptno=10 and job='MANAGER'
union
select * from zhangsan.emp where deptno=20 and job='CLERK'
union
select * from zhangsan.emp where job not in('MANAGER','CLERK') and sal>=2000;
--7：找出收取佣金的雇员的不同工作
select distinct job from zhangsan.emp where comm is not null;
--8：找出不收取佣金或收取佣金低于100的雇员
select * from zhangsan.emp where comm is null or comm<100;
--9：找出各月最后一天受雇的所有雇员
select * from zhangsan.emp where last_day(hiredate)=hiredate; 
--10：找出早于12年之前受雇的雇员
select * from zhangsan.emp where hiredate<add_months(sysdate,-444);
--11：显示只有首字母大写的所有雇员的姓名
select ename from zhangsan.emp where ename=initcap(ename);
--12：显示正好为15个字符的雇员姓名
select ename from zhangsan.emp where length(ename)=4;
--13：显示不带有‘R’的雇员姓名
select ename from zhangsan.emp where instr(ename,'R')=0;
--14：显示所有雇员的姓名的前3个字符
select substr(ename,1,3) from zhangsan.emp;
--15：显示所有雇员的姓名，用‘r’替换所有的‘R’
select replace(ename,'a','A') from zhangsan.emp;
--16：显示所有雇员的姓名以及满10年服务年限的日期
select ename,hiredate from zhangsan.emp where add_months(sysdate,-120)>hiredate;
--17：显示雇员的详细资料，按姓名排序
select *from zhangsan.emp order by ename;
--18：显示雇员姓名，根据其服务年限，将最老的雇员排在最前面
select *from zhangsan.emp order by hiredate asc;
--19：显示所有雇员的姓名、工作和薪金，按工作内的工作的降序顺序排序，而工作按薪金排序
select * from zhangsan.emp order by job desc ,sal;
--20：显示所有雇员的姓名和加入公司的年份和月份，按雇员受雇日所在月排序，并将最早年份的项目排在最前面
select ename,to_char(hiredate,'yyyy') as 年,to_char(hiredate,'mm') as 月  from zhangsan.emp
order by to_number(to_char(hiredate,'yyyy')),to_number(to_char(hiredate,'mm')),to_number(to_char(hiredate,'dd'));
--21：显示在一个月为30天的情况下所有雇员的日薪金，忽略小数
select floor(sal/30) from zhangsan.emp;
--22：找出在（任何年份的）2月份受雇的所有雇员
select * from zhangsan.emp where to_number(to_char(hiredate,'mm'))=2;
--23：对于每个雇员，显示其加入公司的天数
select sysdate-hiredate from zhangsan.emp;
--24：显示姓名字段的任何位置，包含‘A’的所有雇员的姓名
select * from zhangsan.emp where ename like '%A%';
--25：以年、月和日显示所有雇员的服务年限
select  
(to_number(to_char(sysdate,'yyyy'))-to_number(to_char(hiredate,'yyyy')))||'年',
(to_number(to_char(sysdate,'mm'))-to_number(to_char(hiredate,'mm')))||'月',
(to_number(to_char(sysdate,'dd'))-to_number(to_char(hiredate,'dd')))||'日'
  from zhangsan.emp;




			<!-- 查询所有员工的信息，并且显示员工所属部门信息和他上司信息 -->
select 
e1.*,d.*,
e2.empno as mgrempno,
e2.ename as mgrename,
e2.job as mgrjob,
e2.sal as mgrsal,
e2.hiredate as mgr hiredate,
e2.comm as mgrcomm
from
lisi.emp e1,lisi.dept d,lisi.emp e2
where
e1.deptno = d.deptno and e1.mgr = e2.empno; 


--对于每个雇员，显示其加入公司的天数
select empNo, ename,(sysdate-hiredate)as sDay from lisi.emp;
--显示所有雇员的姓名和加入公司的年份和月份，按雇员受雇日所在月排序，并将最早年份的项目排在最前面





