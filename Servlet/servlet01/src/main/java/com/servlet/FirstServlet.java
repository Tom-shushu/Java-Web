package com.servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

//第一种实现方式
public class FirstServlet implements Servlet {

	static{
		System.out.println("FirstServlet里边书写了一个静态块");
	}
	
	// 销毁方法,在Servlet销毁时自动执行,非常用方法
	public void destroy() {
		System.out.println("FirstServlet被销毁了!!!");
	}

	// 获取到ServletConfig对象,非常用方法,一般可忽略
	public ServletConfig getServletConfig() {
		return null;
	}

	// 获取到Servlet的信息,这个有程序员自己书写,非常用方法,一般可忽略
	public String getServletInfo() {
		return "第一个Servlet";
	}

	// 初始化方法,在Servlet被第一次调用时自动执行,非常用方法
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("FirstServlet被初始化了!!!");
	}

	// 服务方法,一般请求Servlet时,执行的方法,核心方法
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		System.out.println("请求了FirstServlet");
	}

	public FirstServlet() {
		System.out.println("FirstServlet的构造器");
	}
	
}
