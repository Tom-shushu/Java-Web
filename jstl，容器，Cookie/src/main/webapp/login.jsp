<%@ page language="java" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>登录页面</title>
</head>
<body>

	<c:choose>
		<c:when test="${param.error==1 }">
			<label style="color:red">你的账号或者密码错误!</label>
		</c:when>
		<c:when test="${param.error==2 }">
			<label style="color:red">你必须登录后才能访问!</label>
		</c:when>
	</c:choose>


	<form action="login" method="post">
		账号:<input type="text" name="name" /><br/>
		密码:<input type="password" name="pass" /><br/>
		<input type="submit" value="登录"/>
	</form>
</body>
</html>