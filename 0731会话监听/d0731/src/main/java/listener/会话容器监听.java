package listener;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class 会话容器监听 implements HttpSessionAttributeListener {

	//向session容器存放内容
	public void attributeAdded(HttpSessionBindingEvent e) {
		HttpSession session = e.getSession();
		String key = e.getName();
		Object value = e.getValue();
		System.out.println("存放key:"+key+",Value:"+value);
	}

	//从session容器删除内容
	public void attributeRemoved(HttpSessionBindingEvent e) {
		HttpSession session = e.getSession();
		String key = e.getName();
		Object value = e.getValue();
		System.out.println("删除key:"+key+",Value:"+value);
	}

	//从session容器修改内容
	public void attributeReplaced(HttpSessionBindingEvent e) {
		HttpSession session = e.getSession();
		String key = e.getName();
		Object value = e.getValue();

		System.out.println("修改key:"+key+",Value:"+value+",新的Value:"+session.getAttribute(key));
	}

}
