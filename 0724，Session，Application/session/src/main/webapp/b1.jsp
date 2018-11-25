<%@ page language="java" pageEncoding="UTF-8"%>
<html>
<head>
<title>会话对象</title>
</head>
<body>
	<% 
		//向session容器中存放内容 K-V
		session.setAttribute("A", 78);
		session.setAttribute("B", "Session");
		
		//区别
		request.setAttribute("A", 55);
		request.setAttribute("B", "Request");
		
		
	%>
</body>
</html>