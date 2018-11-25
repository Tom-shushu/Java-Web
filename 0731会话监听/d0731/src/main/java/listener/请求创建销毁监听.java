package listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

import util.DateUtil;

@WebListener
public class ���󴴽����ټ��� implements ServletRequestListener{

	//����ʱִ��,���յ��û�����ʱ
	public void requestInitialized(ServletRequestEvent sre) {
		System.out.println(DateUtil.getNowDate()+",Request���󱻴�����");
	}
	
	//����ʱִ��,������������Ӧʱ
	public void requestDestroyed(ServletRequestEvent sre) {
		System.out.println(DateUtil.getNowDate()+",Request����������");
	}
}
