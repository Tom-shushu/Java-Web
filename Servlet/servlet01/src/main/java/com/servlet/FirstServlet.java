package com.servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

//��һ��ʵ�ַ�ʽ
public class FirstServlet implements Servlet {

	static{
		System.out.println("FirstServlet�����д��һ����̬��");
	}
	
	// ���ٷ���,��Servlet����ʱ�Զ�ִ��,�ǳ��÷���
	public void destroy() {
		System.out.println("FirstServlet��������!!!");
	}

	// ��ȡ��ServletConfig����,�ǳ��÷���,һ��ɺ���
	public ServletConfig getServletConfig() {
		return null;
	}

	// ��ȡ��Servlet����Ϣ,����г���Ա�Լ���д,�ǳ��÷���,һ��ɺ���
	public String getServletInfo() {
		return "��һ��Servlet";
	}

	// ��ʼ������,��Servlet����һ�ε���ʱ�Զ�ִ��,�ǳ��÷���
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("FirstServlet����ʼ����!!!");
	}

	// ���񷽷�,һ������Servletʱ,ִ�еķ���,���ķ���
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		System.out.println("������FirstServlet");
	}

	public FirstServlet() {
		System.out.println("FirstServlet�Ĺ�����");
	}
	
}
