<%@ page language="java" pageEncoding="UTF-8"%>
<html>
<head>
<title>b.jsp</title>
</head>
<body>

	<% 
		Object obj = request.getAttribute("A");
		out.print("Request容器的A:"+obj);
	%>
</body>
</html>