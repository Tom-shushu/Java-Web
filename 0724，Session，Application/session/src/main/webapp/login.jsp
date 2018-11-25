<%@ page language="java" pageEncoding="UTF-8"%>
<html>
<head>
<title>登录页面</title>
</head>
<body>
	<% 
		Object obj = session.getAttribute("ERROR");
		out.print(obj);
	%>
	<form action="login" method="post">
		账号:<input type="text" name="name" /><br/>
		密码:<input type="password" name="pass" /><br/>
		<input type="submit" value="登录"/>
	</form>
</body>
</html>