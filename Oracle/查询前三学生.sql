查询各科成绩前三名的记录
select * from list.score order by c_id,s_score desc;



select * from 
(
select s2.c_id,s2.s_id,s2.s_score,count(s2.s_id)from
(select * from list.score)s1,
(select * from list.score)s2
where s1.c_id = s2.c_id and s2.s_score<=s1.s_score
group by s2.c_id,s2.s_id,s2.s_score having count(*)<4
)
order by c_id,s_score desc;





