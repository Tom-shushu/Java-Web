package listener;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import util.DateUtil;

public class �Ự�������ټ��� implements HttpSessionListener{

	//���������һ������ʱ�����Ự
	public void sessionCreated(HttpSessionEvent se) {
		HttpSession session = se.getSession();
		session.setMaxInactiveInterval(1);
		System.out.println(DateUtil.getNowDate()+"�����˻Ự!");
	}
	
	//��������ر�ʱ���ٻỰ(���ӳ���)
	public void sessionDestroyed(HttpSessionEvent se) {
		System.out.println(DateUtil.getNowDate()+"�Ự��������!");
	}
}
