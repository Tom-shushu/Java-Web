<%@ page import="biz.UserBiz"%>
<%@ page import="bean.UserInfo"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<%
	//处理中文问题post
	request.setCharacterEncoding("utf-8");

	int id = Integer.parseInt(request.getParameter("id"));
	String name = request.getParameter("name");
	String sex = request.getParameter("sex");
	int age = Integer.parseInt(request.getParameter("age"));
	String address = request.getParameter("address");
	
	UserInfo ui = new UserInfo();
	ui.setUserAddress(address);
	ui.setUserAge(age);
	ui.setUserName(name);
	ui.setUserSex(sex);
	ui.setUserId(id);

	UserBiz ub = new UserBiz();
	ub.updateUser(ui);
	
	response.sendRedirect("index.jsp");
	
%>