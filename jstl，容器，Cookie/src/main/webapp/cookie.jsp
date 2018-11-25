<%@ page language="java" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>cookie登录页面</title>
</head>
<body>
	EL表达式获取cookie
	${cookie.KEY.value }

	<form action="cookie" method="post">
		账号:<input type="text" name="name" value="${cookie.NAME.value }" /><br/>
		密码:<input type="text" name="pass" value="${cookie.PASS.value }" /><br/>
		<input type="submit" value="登录"/>
	</form>
</body>
</html>