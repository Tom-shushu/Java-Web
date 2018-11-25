<%@ page language="java" pageEncoding="UTF-8" isELIgnored="false"%>
<!-- 引入JSTL文件 引入的是JSTL的核心标签库 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<!-- 分支结构 -->
	
	<!-- 单层if -->
	<c:if test="${false }">
		你好,中国!
	</c:if>
	
	<!-- 多层if -->
	<c:choose>
		<c:when test="${param.a==1 }">
			A
		</c:when>
		<c:when test="${param.a==2 }">
			B
		</c:when>
		<c:when test="${param.a==3 }">
			C
		</c:when>
		<c:otherwise>
			D
		</c:otherwise>
	</c:choose>
</body>
</html>