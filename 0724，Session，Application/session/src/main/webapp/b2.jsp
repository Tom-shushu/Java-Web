<%@ page language="java" pageEncoding="UTF-8"%>
<html>
<head>
<title>会话对象</title>
</head>
<body>
	<% 
		//通过key从session容器中获取内容
		Object value1 = session.getAttribute("A");
		Object value2 = session.getAttribute("B");
		

		Object value3 = request.getAttribute("A");
		Object value4 = request.getAttribute("B");
		
		
		out.print(value1+"<br/>");
		out.print(value2+"<br/>");
		out.print(value3+"<br/>");
		out.print(value4+"<br/>");
	%>
</body>
</html>