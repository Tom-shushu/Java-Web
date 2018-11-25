<%@ page language="java" pageEncoding="UTF-8"%>
<html>
<head>
<title>会话对象</title>
</head>
<body>
	<% 
		//从session容器中将key为A的内容删除
		session.removeAttribute("A");
	%>
</body>
</html>