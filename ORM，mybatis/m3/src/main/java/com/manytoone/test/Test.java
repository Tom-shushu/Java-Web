package com.manytoone.test;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.manytoone.bean.EmpBean;
import com.manytoone.mapper.EmpMapper;


public class Test {

	public void a(){
		InputStream in = Test.class.getClassLoader().getResourceAsStream("config.xml");
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(in);
		SqlSession session = ssf.openSession();
		
		EmpMapper em = session.getMapper(EmpMapper.class);
		List<EmpBean> list = em.findAllEmp();
		for (EmpBean eb : list) {
			System.out.println(eb);
		}
	}
	
	public void b(){
		InputStream in = Test.class.getClassLoader().getResourceAsStream("config.xml");
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(in);
		SqlSession session = ssf.openSession();
		
		EmpMapper em = session.getMapper(EmpMapper.class);
		List<EmpBean> list = em.findEmp2();
		for (EmpBean eb : list) {
			System.out.println(eb.getEname()+"\t"+eb.getDays());
		}
	}
	
	public void c(){
		InputStream in = Test.class.getClassLoader().getResourceAsStream("config.xml");
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(in);
		SqlSession session = ssf.openSession();
		
		EmpMapper em = session.getMapper(EmpMapper.class);
		List<EmpBean> list = em.findEmp3();
		for (EmpBean eb : list) {
			System.out.println(eb.getEname()+"\t"+eb.getYears()+"\t"+eb.getMons());
		}
	}
	public static void main(String[] args) {
		new Test().c();
	}

}
