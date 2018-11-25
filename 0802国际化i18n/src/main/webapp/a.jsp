<%@page import="java.util.Date"%>
<%@ page language="java" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<!-- 设置当前语言环境 -->
	<fmt:setLocale value="${param.locale }"/>
	
	<!-- 负责处理POST请求的编码集 -->
	<fmt:requestEncoding value="utf-8"/>
	<% 
		request.setCharacterEncoding("utf-8");
	%>
	
	<fmt:formatNumber var="num" value="133.999999" pattern="#.##" />
	
	
	${num }
	
	<hr/>
	
	<!-- 格式化的日期 有国际化操作 -->
	<fmt:formatDate value="<%=new Date() %>" var="date" type="date" dateStyle="full"/>
	
	${date }
	
</body>
</html>