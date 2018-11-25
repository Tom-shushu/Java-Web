<%@ page language="java" pageEncoding="UTF-8" isELIgnored="false"%>
<!-- 引入JSTL文件 引入的是JSTL的核心标签库 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<!-- 重定向 -->
	<c:redirect url="a.jsp">
		<c:param name="page" value="1"></c:param>
		<c:param name="age" value="23"></c:param>
		<c:param name="name" value="${'admin' }"></c:param>
	</c:redirect>
	
</body>
</html>