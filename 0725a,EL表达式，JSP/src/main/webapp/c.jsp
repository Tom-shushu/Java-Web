<%@ page language="java" pageEncoding="UTF-8" isELIgnored="false"%>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	EL表达式的常量方式:<br/>
	${8 }  8<br/>
	${"你好" }  你好<br/>
	${'你' }  你<br/>
	${true }  true <br/>
	
	<hr/>
	EL表达式的运算符方式:<br/>
	<!-- +只做求和,不做拼接 -->
	${8+9}  ${"8"+"9" }  
	${"a" } ${"b" }
	
	${true and false }
	${true or false }
	${not true }
	<br/>
	${8>7 }  ${7==8 }
	
	<br/>
	<!-- 为空判断 -->
	${empty A }
	<% 
		request.setAttribute("B", "ww");
	%>
	${empty B }
	
</body>
</html>