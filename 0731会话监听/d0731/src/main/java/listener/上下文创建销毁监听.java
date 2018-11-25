package listener;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import bean.UserInfo;
import biz.UserBiz;

//上下文(Application)监听:创建销毁监听
public class 上下文创建销毁监听 implements ServletContextListener{

	private UserBiz ub = new UserBiz();
	
	//在服务器启动时,tomcat(Servlet容器)会执行这个方法(application对象就是在服务器启动时创建的)
	public void contextInitialized(ServletContextEvent e) {
		System.out.println("Application被创建了!");
		
		/*List<UserInfo> list = ub.findAll();
		//获取到application对象
		ServletContext application = e.getServletContext();
		application.setAttribute("USERLIST", list);*/

	}
	
	//在服务器停止时,tomcat(Servlet容器)会执行这个方法(application对象就是在服务器停止时销毁的)
	public void contextDestroyed(ServletContextEvent e) {
		System.out.println("Application被销毁了!");
	}
	
}
