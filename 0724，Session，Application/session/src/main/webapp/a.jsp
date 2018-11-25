<%@ page language="java" pageEncoding="UTF-8"%>
<html>
<head>
<title>会话对象</title>
</head>
<body>
	<%
		//获取到session的id,这个id是唯一的id
		String sessionId = session.getId();
		//获取到Session的创建时间(第一次请求时间)
		long create = session.getCreationTime();
		//获取到Session最后一次请求时间
		long last = session.getLastAccessedTime();

		out.println(sessionId + "<br/>");
		out.println(create + "<br/>");
		out.println(last + "<br/>");
	%>
</body>
</html>