package test;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import bean.DeptBean;
import bean.EmpBean;
import mapper.DeptMapper;
import mapper.EmpMapper;

public class Test {
	
	
	
	public void a(){
		InputStream in = Test.class.getClassLoader().getResourceAsStream("config.xml");
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(in);
		SqlSession session = ssf.openSession();
		
		EmpMapper em = session.getMapper(EmpMapper.class);
		EmpBean eb = new EmpBean();
		//eb.setEname("ALLEN");
		eb.setJob("ANALYST");
		eb.setSal(null);
		List<EmpBean> list = em.findEmp(eb);
		
		for (EmpBean e : list) {
			System.out.println(e);
		}
		
		
		
	}
	public void b(){
		InputStream in = Test.class.getClassLoader().getResourceAsStream("config.xml");
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(in);
		SqlSession session = ssf.openSession();
		
		EmpMapper em = session.getMapper(EmpMapper.class);
		EmpBean eb = new EmpBean();
		
		eb.setMgr(7499);
		eb.setEmpNo(7900);
		em.updateEmp(eb);
		session.commit();
		System.out.println("8888");
		
	}
	
	public void c(){
		InputStream in = Test.class.getClassLoader().getResourceAsStream("config.xml");
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(in);
		SqlSession session = ssf.openSession();
		
		EmpMapper em = session.getMapper(EmpMapper.class);
		EmpBean eb = new EmpBean();
		
		eb.setSal(1888.0);
		eb.setEmpNo(7839);
		
		em.deleteEmp(eb);
		
		session.commit();
		System.out.println("8888");
		
	}
	
	public void d1(){
		InputStream in = Test.class.getClassLoader().getResourceAsStream("config.xml");
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(in);
		SqlSession session = ssf.openSession();
		
		EmpMapper em = session.getMapper(EmpMapper.class);
		
		String[] arrs = {"SALESMAN","CLERK"};
		
		List<EmpBean>list = em.findEmpByJob1(arrs);
		for (EmpBean e : list) {
			System.out.println(e);
		}
	}
	
	public void d2(){
		InputStream in = Test.class.getClassLoader().getResourceAsStream("config.xml");
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(in);
		SqlSession session = ssf.openSession();
		
		EmpMapper em = session.getMapper(EmpMapper.class);
		
		String[] arrs = {"SALESMAN","CLERK"};
		
		List<String> li = new ArrayList<String>();
		li.add("SALESMAN");
		li.add("CLERK");
		List<EmpBean>list = em.findEmpByJob2(li);
		for (EmpBean e : list) {
			System.out.println(e);
		}
	}
	
	public void e(){
		InputStream in = Test.class.getClassLoader().getResourceAsStream("config.xml");
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(in);
		SqlSession session = ssf.openSession();
		
		EmpMapper em = session.getMapper(EmpMapper.class);
		EmpBean eb = new EmpBean();
		eb.setEname("WARD");
		eb.setSal(1240.00);
		List<EmpBean> list = em.param1(eb);
		
		for (EmpBean e : list) {
			System.out.println(e);
		}
	}
	
	public void f(){
		InputStream in = Test.class.getClassLoader().getResourceAsStream("config.xml");
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(in);
		SqlSession session = ssf.openSession();
		
		EmpMapper em = session.getMapper(EmpMapper.class);
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("a", "MARTIN");
		map.put("b", 1230.00);
		List<EmpBean> list = em.param2(map);
		
		for (EmpBean e : list) {
			System.out.println(e);
		}
	}
	
	public void g1(){
		InputStream in = Test.class.getClassLoader().getResourceAsStream("config.xml");
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(in);
		SqlSession session = ssf.openSession();
		
		DeptMapper dm = session.getMapper(DeptMapper.class);
		List<DeptBean> list = dm.findAllDept();
		for (DeptBean db : list) {
			System.out.println(db);
		}
		
	}
	
	public void g2(){
		InputStream in = Test.class.getClassLoader().getResourceAsStream("config.xml");
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(in);
		SqlSession session = ssf.openSession();
		
		DeptMapper dm = session.getMapper(DeptMapper.class);
		dm.deleteDept(20);

		session.commit();
		
	}
	
	
	public static void main(String[] args) {
		new Test().g2();
	}

}
