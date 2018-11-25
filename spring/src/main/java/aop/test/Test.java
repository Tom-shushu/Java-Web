package aop.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import aop.target.Customer;
import aop.target.Target;
import aop.target.TargetB;

public class Test {

	public static void main(String[] args) {
		ApplicationContext bean = new FileSystemXmlApplicationContext("src/main/resources/applicationContext.xml");
		//Target target = bean.getBean("target", Target.class);
		//target.welcome();
		Customer customer = bean.getBean("customer", Customer.class);
		customer.buy("ÊÖ»ú",300);
	}
}
