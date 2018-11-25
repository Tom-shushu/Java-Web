<%@ page language="java" pageEncoding="UTF-8" isELIgnored="false"%>
<html>
<head>
<title>show</title>
</head>
<body>

	${param.name }:${param.msg }
	
	<hr/>
	
	<form action="show.jsp">
		<input type="hidden" name="name" value="${param.name }"/>
		<input type="text" name="msg" />
		<input type="submit" value="send" />
	</form>

</body>
</html>