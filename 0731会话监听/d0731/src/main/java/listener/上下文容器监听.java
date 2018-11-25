package listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

public class �������������� implements ServletContextAttributeListener{

	//����application�����������ʱִ��
	public void attributeAdded(ServletContextAttributeEvent e) {
		ServletContext application = e.getServletContext();
		String key = e.getName();//��ȡ��Key
		Object value = e.getValue();//��ȡ��Value
		
		System.out.println("��Ž�����:"+value+",key:"+key);
	}
	
	//����application������ɾ������ʱִ��
	public void attributeRemoved(ServletContextAttributeEvent e) {
		ServletContext application = e.getServletContext();
		String key = e.getName();//��ȡ��Key
		Object value = e.getValue();//��ȡ��Value
		
		System.out.println("��application������ɾ����key:"+key+",����ʱ:"+value);
	}
	
	//���޸�application�����е�����ʱִ��
	public void attributeReplaced(ServletContextAttributeEvent e) {
		ServletContext application = e.getServletContext();
		String key = e.getName();//��ȡ��Key
		Object value = e.getValue();//��ȡ�����޸�ǰ��Value
		Object newValue = application.getAttribute(key);//��ȡ�޸ĺ��Value
		System.out.println("�޸���application������key:"+key+",ֵΪ:"+value+",��ֵ:"+newValue);
		
	}
	
}
