<%@ page language="java" pageEncoding="UTF-8" isELIgnored="false"%>
<html>
<body>

	${param.a }
	${param.b }

	<% 
		String a = request.getParameter("a");
		out.print(a);
	%>
</body>
</html>
