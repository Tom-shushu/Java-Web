package com.servlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

// �ڶ��ַ�ʽ
@SuppressWarnings("serial")
public class SecondServlet extends GenericServlet{


	// ֻ��Ҫʵ�ַ��񷽷�����
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("SecondServlet����������");
	}

}
