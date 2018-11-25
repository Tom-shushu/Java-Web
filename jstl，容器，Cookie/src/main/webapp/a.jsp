<%@ page language="java" pageEncoding="UTF-8" isELIgnored="false"%>
<!-- 引入JSTL文件 引入的是JSTL的核心标签库 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<!-- 
		创建一个变量,并且将变量的值放入到容器 
		var:变量名,也可以是容器中的Key
		value:值
		scope:容器名
	-->
	<c:set var="A" value="张三" scope="request"/>
	
	${A }
	<!-- 
		将内容输出显示到页面中 
		value:输出的内容,可以是常量,也可以是变量
		default:当value的内容为null时,输出默认值
		escapeXml:是否规避HTML的特殊字符 < >
	-->
	<c:out value="${A }" default="默认值"/>
	<c:out value="<h1>你好</h1>" escapeXml="false"></c:out>
	
	<!-- 从指定容器中删除key -->
	<c:remove var="A" scope="request"/>
	${empty A }
</body>
</html>