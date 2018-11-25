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
		// ��һ��:���������ļ�
		InputStream in = Test.class.getClassLoader().
					getResourceAsStream("config.xml");
		// �ڶ���:�����Ự����
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(in);
		// ������:�����Ự
		SqlSession session = ssf.openSession();
		// ���Ĳ�:ִ�в���
		EmpMapper em = session.getMapper(EmpMapper.class);
		// �����ͨ��id��ȡ��Emp��Ϣ
		/*EmpBean eb = em.findEmpByNo(7654);
		System.out.println(eb);*/
		// �������Ӳ���
		EmpBean eb = new EmpBean();
		eb.setEmpNo(7777);
		eb.seteName("����");
		eb.setJob("SALESMAN");
		eb.setMgr(7521);
		eb.setHireDate("7-7��-1992");
		eb.setSal(999.9);
		eb.setComm(0.00);
		eb.setDeptNo(10);
		
		//em.addEmp(eb);
		
		// ������޸Ĳ���
		eb.setSal(1777.8);
		//em.updateEmp(eb);
		
		// �����ɾ������
		//em.deleteEmp(7777);
		
		// �����ȫ��ѯ
		List<EmpBean> list = em.findAllEmp();
		System.out.println(list);
		// ���岽:�ύ����
		session.commit();
		// ������:�رջỰ
		session.close();
		
	}

}
