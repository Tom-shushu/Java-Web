package listener;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import bean.UserInfo;
import biz.UserBiz;

//������(Application)����:�������ټ���
public class �����Ĵ������ټ��� implements ServletContextListener{

	private UserBiz ub = new UserBiz();
	
	//�ڷ���������ʱ,tomcat(Servlet����)��ִ���������(application��������ڷ���������ʱ������)
	public void contextInitialized(ServletContextEvent e) {
		System.out.println("Application��������!");
		
		/*List<UserInfo> list = ub.findAll();
		//��ȡ��application����
		ServletContext application = e.getServletContext();
		application.setAttribute("USERLIST", list);*/

	}
	
	//�ڷ�����ֹͣʱ,tomcat(Servlet����)��ִ���������(application��������ڷ�����ֹͣʱ���ٵ�)
	public void contextDestroyed(ServletContextEvent e) {
		System.out.println("Application��������!");
	}
	
}
