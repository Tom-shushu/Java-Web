package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.DemoA;
import bean.DemoC;
import bean.DemoD;
import bean.DemoE;
import bean.DemoF;
import bean.Order;
import bean.Student;
import bean.UserInfo;

public class Test {

	public static void main(String[] args) {
		// ����applicationContext.xml��������
		BeanFactory bean = new ClassPathXmlApplicationContext("applicationContext.xml");

		/*// Object obj = bean.getBean("������", ��������);
		UserInfo a1 = bean.getBean("ui", UserInfo.class);
		System.out.println(a1);
		
		Student stu = bean.getBean("stu", Student.class);
		System.out.println(stu);
		
		Order order = bean.getBean("order",Order.class);
		System.out.println(order);*/
		
		//DemoD dc = bean.getBean("dd",DemoD.class);
		//System.out.println(dc);
		DemoF e = bean.getBean("df", DemoF.class);
		System.out.println(e);
	}

}
/*
��д2����:Student,Class,Student��id,name,sex,����,address,�Ƿ�����,�����༶��7������,
Class��id��name����������
��ͨ��spring�ķ�ʽnew��������ʾ


*/