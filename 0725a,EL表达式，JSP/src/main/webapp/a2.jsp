<%@ page language="java" pageEncoding="UTF-8" isELIgnored="false"%>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	过去的写法:<br/>
	<% 
		String name = request.getParameter("name");
		out.print(name);
	%>
	<hr/>
	EL的写法:<br/>
	<!-- param :获取单个内容 -->
	${param.name} <br/>
	${param.pass }<br/>
	${param.age }<br/>
	<!-- paramValues :获取数组形式,多个 -->
	${paramValues.love }<br/>
</body>
</html>