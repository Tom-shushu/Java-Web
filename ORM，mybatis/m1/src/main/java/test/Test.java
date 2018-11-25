package test;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import bean.EmpBean;
import mapper.EmpMapper;

public class Test {

	public static void main(String[] args) {
		// 第一步:加载配置文件
		InputStream in = Test.class.getClassLoader().
					getResourceAsStream("config.xml");
		// 第二步:创建会话工厂
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(in);
		// 第三步:创建会话
		SqlSession session = ssf.openSession();
		// 第四步:执行操作
		EmpMapper em = session.getMapper(EmpMapper.class);
		// 这个是通过id获取到Emp信息
		/*EmpBean eb = em.findEmpByNo(7654);
		System.out.println(eb);*/
		// 这个是添加操作
		EmpBean eb = new EmpBean();
		eb.setEmpNo(7777);
		eb.seteName("张三");
		eb.setJob("SALESMAN");
		eb.setMgr(7521);
		eb.setHireDate("7-7月-1992");
		eb.setSal(999.9);
		eb.setComm(0.00);
		eb.setDeptNo(10);
		
		//em.addEmp(eb);
		
		// 这个是修改操作
		eb.setSal(1777.8);
		//em.updateEmp(eb);
		
		// 这个是删除操作
		//em.deleteEmp(7777);
		
		// 这个是全查询
		List<EmpBean> list = em.findAllEmp();
		System.out.println(list);
		// 第五步:提交事务
		session.commit();
		// 第六步:关闭会话
		session.close();
		
	}

}
