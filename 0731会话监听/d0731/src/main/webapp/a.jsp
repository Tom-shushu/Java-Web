<%@ page language="java" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<c:set var="A" value="admin" scope="request"></c:set>
	<c:set var="B" value="马三立" scope="request"></c:set>
	<c:set var="A" value="china" scope="request"></c:set>
	
	<c:remove var="B" scope="request"/>
</body>
</html>