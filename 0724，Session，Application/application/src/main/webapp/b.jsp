<%@ page language="java" pageEncoding="UTF-8"%>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<% 
		Object obj = application.getAttribute("A");
		out.print(session.getId()+"取出:"+obj);
	%>
</body>
</html>