package listener;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class �Ự�������� implements HttpSessionAttributeListener {

	//��session�����������
	public void attributeAdded(HttpSessionBindingEvent e) {
		HttpSession session = e.getSession();
		String key = e.getName();
		Object value = e.getValue();
		System.out.println("���key:"+key+",Value:"+value);
	}

	//��session����ɾ������
	public void attributeRemoved(HttpSessionBindingEvent e) {
		HttpSession session = e.getSession();
		String key = e.getName();
		Object value = e.getValue();
		System.out.println("ɾ��key:"+key+",Value:"+value);
	}

	//��session�����޸�����
	public void attributeReplaced(HttpSessionBindingEvent e) {
		HttpSession session = e.getSession();
		String key = e.getName();
		Object value = e.getValue();

		System.out.println("�޸�key:"+key+",Value:"+value+",�µ�Value:"+session.getAttribute(key));
	}

}
