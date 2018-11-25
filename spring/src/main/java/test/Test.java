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
		// 根据applicationContext.xml产生对象
		BeanFactory bean = new ClassPathXmlApplicationContext("applicationContext.xml");

		/*// Object obj = bean.getBean("对象名", 对象类型);
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
书写2个类:Student,Class,Student有id,name,sex,体重,address,是否新生,所属班级这7个属性,
Class有id和name这两个属性
来通过spring的方式new出来并显示


*/