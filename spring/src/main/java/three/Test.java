package three;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		BeanFactory bean = new ClassPathXmlApplicationContext("applicationContext.xml");
		School s = bean.getBean("school", School.class);
		s.print(bean.getBean("teacher",Teacher.class));
	}

}
