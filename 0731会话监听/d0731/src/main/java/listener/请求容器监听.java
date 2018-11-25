package listener;

import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class 请求容器监听 implements ServletRequestAttributeListener{

	@Override
	public void attributeAdded(ServletRequestAttributeEvent e) {
		ServletRequest req = e.getServletRequest();//获取到的是ServletRequest
		String key = e.getName();
		Object value = e.getValue();
		System.out.println("add\tkey:"+key+",value:"+value);
	}
	
	@Override
	public void attributeRemoved(ServletRequestAttributeEvent e) {
		ServletRequest req = e.getServletRequest();//获取到的是ServletRequest
		String key = e.getName();
		Object value = e.getValue();
		System.out.println("remove\tkey:"+key+",value:"+value);
	}
	
	@Override
	public void attributeReplaced(ServletRequestAttributeEvent e) {
		ServletRequest req = e.getServletRequest();//获取到的是ServletRequest
		String key = e.getName();
		Object value = e.getValue();
		System.out.println("update\tkey:"+key+",value:"+value+"newValue:"+req.getAttribute(key));
	}
}
