<%@ page language="java" pageEncoding="UTF-8"%>
<html>
<head>
<title>Response对象</title>
</head>
<body>

	<%
		System.out.println("进入了Response.jsp页面");
		//重定向 
		response.sendRedirect("a.jsp");
	%>
</body>
</html>