<%@page import="biz.UserBiz"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<%
	int id = Integer.parseInt(request.getParameter("id"));
	UserBiz ub = new UserBiz();
	ub.deleteUser(id);
	
	response.sendRedirect("index.jsp");
%>