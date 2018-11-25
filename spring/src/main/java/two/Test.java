package two;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		BeanFactory bean = new ClassPathXmlApplicationContext("applicationContext.xml");
		Printer print = bean.getBean("print", Printer.class);
		print.print("sdhfjklasfhjkladfhsdjafhjksdhfsdhfklasdhfhasdjfsd");
	}
}
