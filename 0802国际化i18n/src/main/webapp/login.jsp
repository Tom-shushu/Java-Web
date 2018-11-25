<%@ page language="java" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
	<!-- 设置当前语言环境,如果不设置以当前系统环境为主 -->
	<fmt:setLocale value="${param.locale }"/>
	<!-- 设置基础名字 -->
	<fmt:setBundle basename="demo"/>
	<!-- 获取内容 -->
<head>
<title><fmt:message key="title" /></title>
<style type="text/css">
	table {
		margin: 0 aotu;
		border: 1px gray solid;
		width: 80%;
	}
	td{
		text-align:center;
		border: 1px gray solid;
	}
</style>
</head>
<body>
	<a href="login.jsp?locale=zh_CN"><img src="image/1.jpg" width="80" height="30"/></a>
	<a href="login.jsp?locale=en_US"><img src="image/2.jpg" width="80" height="30"/></a>
	<a href="login.jsp?locale=zh_TW"><img src="image/3.jpg" width="80" height="30"/></a>
	<a href="login.jsp?locale=ar_SA"><img src="image/4.jpg" width="80" height="30"/></a>
	<br/>
	
	<table>
		<tr>
			<td><fmt:message key="user" /></td>
			<td><input type="text" name="user" /></td>
		</tr>
		<tr>
			<td><fmt:message key="pass" /></td>
			<td><input type="password" name="pass" /></td>
		</tr>
		<tr>
			<fmt:message key="login" var="login" />
			<td colspan="2"><input type="submit" value="${login }" /></td>
		</tr>
	</table>
</body>
</html>