<%@page import="bean.UserInfo"%>
<%@page import="java.util.List"%>
<%@page import="biz.UserBiz"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	String wd = request.getParameter("wd");
	
	UserBiz ub = new UserBiz();
	List<UserInfo> list = ub.find(wd.trim());
	
	request.setAttribute("USERLIST", list);
	request.getRequestDispatcher("index.jsp").forward(request, response);
	
%>