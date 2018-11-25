<%@ page language="java" pageEncoding="UTF-8"%>
<html>
<body>

<% 
	//如果用户未登录,不让访问这个页面!
	Object name = session.getAttribute("NAME");
	if(name==null){
		session.setAttribute("ERROR", "你必须登录后访问!");
		response.sendRedirect("login.jsp");
	}
%>

<h2>欢迎,<%=name %></h2>
</body>
</html>
