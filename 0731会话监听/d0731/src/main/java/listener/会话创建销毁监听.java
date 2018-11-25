package listener;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import util.DateUtil;

public class 会话创建销毁监听 implements HttpSessionListener{

	//当浏览器第一次请求时创建会话
	public void sessionCreated(HttpSessionEvent se) {
		HttpSession session = se.getSession();
		session.setMaxInactiveInterval(1);
		System.out.println(DateUtil.getNowDate()+"创建了会话!");
	}
	
	//当浏览器关闭时销毁会话(有延迟性)
	public void sessionDestroyed(HttpSessionEvent se) {
		System.out.println(DateUtil.getNowDate()+"会话被销毁了!");
	}
}
