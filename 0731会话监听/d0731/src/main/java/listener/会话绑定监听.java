package listener;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

//�ֶ��󶨼���
public class �Ự�󶨼��� implements HttpSessionBindingListener{

	//��ʱ����
	public void valueBound(HttpSessionBindingEvent e) {
		HttpSession session = e.getSession();
		String key = e.getName();
		Object value = e.getValue();
		System.out.println("aaaaaaaaaa");
	}
	
	//�����ʱ����
	public void valueUnbound(HttpSessionBindingEvent e) {
		HttpSession session = e.getSession();
		String key = e.getName();
		Object value = e.getValue();
		System.out.println("bbbbbbbbbb");
	}
}
