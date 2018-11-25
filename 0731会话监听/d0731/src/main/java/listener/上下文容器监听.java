package listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

public class 上下文容器监听 implements ServletContextAttributeListener{

	//当向application容器存放内容时执行
	public void attributeAdded(ServletContextAttributeEvent e) {
		ServletContext application = e.getServletContext();
		String key = e.getName();//获取到Key
		Object value = e.getValue();//获取到Value
		
		System.out.println("存放进入了:"+value+",key:"+key);
	}
	
	//当从application容器中删除内容时执行
	public void attributeRemoved(ServletContextAttributeEvent e) {
		ServletContext application = e.getServletContext();
		String key = e.getName();//获取到Key
		Object value = e.getValue();//获取到Value
		
		System.out.println("从application容器中删除了key:"+key+",内容时:"+value);
	}
	
	//当修改application容器中的内容时执行
	public void attributeReplaced(ServletContextAttributeEvent e) {
		ServletContext application = e.getServletContext();
		String key = e.getName();//获取到Key
		Object value = e.getValue();//获取的是修改前的Value
		Object newValue = application.getAttribute(key);//获取修改后的Value
		System.out.println("修改了application容器中key:"+key+",值为:"+value+",新值:"+newValue);
		
	}
	
}
