<%@ page language="java" pageEncoding="UTF-8"%>
<html>
<head>
<title>a.jsp</title>
</head>
<body>

	<% 
		System.out.print("a.jsp");
		
		request.setAttribute("A", 87);
	
		//转发
		//request.getRequestDispatcher("b.jsp").forward(request, response);
		//重定向
		response.sendRedirect("b.jsp");
	%>
	
</body>
</html>