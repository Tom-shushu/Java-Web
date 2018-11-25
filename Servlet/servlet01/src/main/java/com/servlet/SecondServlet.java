package com.servlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

// 第二种方式
@SuppressWarnings("serial")
public class SecondServlet extends GenericServlet{


	// 只需要实现服务方法就行
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("SecondServlet接收了请求");
	}

}
