package listener;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

//手动绑定监听
public class 会话绑定监听 implements HttpSessionBindingListener{

	//绑定时触发
	public void valueBound(HttpSessionBindingEvent e) {
		HttpSession session = e.getSession();
		String key = e.getName();
		Object value = e.getValue();
		System.out.println("aaaaaaaaaa");
	}
	
	//解除绑定时触发
	public void valueUnbound(HttpSessionBindingEvent e) {
		HttpSession session = e.getSession();
		String key = e.getName();
		Object value = e.getValue();
		System.out.println("bbbbbbbbbb");
	}
}
