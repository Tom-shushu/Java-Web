<%@ page language="java" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>b1</title>
</head>
<body>
	<p>b1</p>
	<c:set var="A" value="admin" scope="request"></c:set>
	<jsp:forward page="b2.jsp"></jsp:forward>
	
</body>
</html>