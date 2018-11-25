<%@ page import="biz.UserBiz"%>
<%@ page import="bean.UserInfo"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<%
	//处理中文问题post
	request.setCharacterEncoding("utf-8");

	String name = request.getParameter("name");
	String sex = request.getParameter("sex");
	int age = Integer.parseInt(request.getParameter("age"));
	String address = request.getParameter("address");
	
	UserInfo ui = new UserInfo();
	ui.setUserAddress(address);
	ui.setUserAge(age);
	ui.setUserName(name);
	ui.setUserSex(sex);

	UserBiz ub = new UserBiz();
	ub.saveUser(ui);
	
	response.sendRedirect("index.jsp");
	
%>