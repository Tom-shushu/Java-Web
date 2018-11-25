package listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

import util.DateUtil;

@WebListener
public class 请求创建销毁监听 implements ServletRequestListener{

	//创建时执行,接收到用户请求时
	public void requestInitialized(ServletRequestEvent sre) {
		System.out.println(DateUtil.getNowDate()+",Request对象被创建了");
	}
	
	//销毁时执行,对请求做出响应时
	public void requestDestroyed(ServletRequestEvent sre) {
		System.out.println(DateUtil.getNowDate()+",Request对象被销毁了");
	}
}
