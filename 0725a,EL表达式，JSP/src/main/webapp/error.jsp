<%@ page language="java" pageEncoding="UTF-8" isErrorPage="true"%>
<html>
<head>
<title>错误处理页面!</title>
</head>
<body>
	<% 
		
		out.print(exception.getMessage());
	%>
</body>
</html>