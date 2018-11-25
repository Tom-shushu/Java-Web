<%@ page language="java" pageEncoding="UTF-8"%>
<html>
<head>
<title>Request对象</title>
</head>
<body>
	<% 
		//第一组方法
		String scheme = request.getScheme();
		String serverName = request.getServerName();
		int serverPort = request.getServerPort();
		String remoteAddr = request.getRemoteAddr();
		String remoteHost = request.getRemoteHost();
		int remotePort = request.getRemotePort();
		String url = request.getRequestURI();
		
		out.print(scheme+"<br/>");
		out.print(serverName+"<br/>");
		out.print(serverPort+"<br/>");
		out.print(remoteAddr+"<br/>");
		out.print(remoteHost+"<br/>");
		out.print(remotePort+"<br/>");
		out.print(url+"<br/>");
	%>
</body>
</html>