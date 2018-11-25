<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" pageEncoding="UTF-8" isELIgnored="false"%>
<!-- 引入JSTL文件 引入的是JSTL的核心标签库 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<!-- 循环结构 -->
	<!-- 
		var:循环变量,类似于for循环中的i
		begin:从几开始
		end:到几结束
		step:自增量
		items:需要被遍历的集合
		varStatus:循环时的游标	
	-->
	<!-- for循环的写法 -->
	<c:forEach var="i" begin="1" end="10" step="1">
		${i }<br/>
	</c:forEach>

	<!-- 求出1-100之和 -->
	<c:set var="sum" value="0"></c:set>
	<c:forEach var="i" begin="1" end="100" step="1">
		<c:set var="sum" value="${sum+i }"></c:set>
	</c:forEach>
	${sum }
	<br/>
	<!-- 打印九九乘法表 -->
	<c:forEach var="i" begin="1" end="9" step="1">
		<c:forEach var="j" begin="1" end="${i }" step="1">
			${i } * ${j} = ${i*j }
		</c:forEach>
		<br/>
	</c:forEach>
	
	
	<!-- Foreach写法 -->
	<% 
		List<String> list = new ArrayList<String>();
		list.add("陕西省");
		list.add("山西省");
		list.add("湖北省");
		list.add("湖南省");
		
		session.setAttribute("LIST", list);
		
	%>
	
	<c:forEach var="i" items="${LIST }" varStatus="j">
		${i } &nbsp;&nbsp;${j.index }&nbsp;&nbsp;${j.count}<br/>
	</c:forEach>
	
	<hr/>
	<!--  
		var:名称
		begin:从几开始
		end:到几结束
		step:自增加
		varStatus:游标
		items:字符串
		delims:分隔符
	-->
	<c:forTokens items="shd%jksa%hfajk%lshfj%asdlhflasdhu%isdfdhs" delims="%" var="s" >
		${s }<br/>
	</c:forTokens>
	
	
	
</body>
</html>