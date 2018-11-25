<%@ page language="java" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>add</title>
<c:if test="${empty USERLIAT }">
	<c:redirect url="find.mvc"></c:redirect>
</c:if>
</head>
<body>
	<c:forEach var="ui" items="${USERLIAT }">
		${ui.userName }  
		${ui.userSex }  
		${ui.userAge }  
		${ui.userAddress}
		<a href="delete.mvc?userId=${ui.userId }">删除</a>
		<a href="findbyid.mvc?userId=${ui.userId }">修改</a>
		<br />
	</c:forEach>
</body>
</body>
</html>
