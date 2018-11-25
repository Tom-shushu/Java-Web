<%@page import="listener.会话绑定监听"%>
<%@ page language="java" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<% 
		session.setAttribute("A", new 会话绑定监听());
	
		session.removeAttribute("A");
	%>
</body>
</html>