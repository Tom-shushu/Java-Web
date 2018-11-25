<%@ page language="java" pageEncoding="UTF-8"%>
<html>
<head>
<title>PageContext页面</title>
</head>
<body>
	<% 
		//通过pageContext获取到其他对象
		//pageContext.getRequest();//获取到Request对象
		//pageContext.getResponse();//获取到Response对象
		//pageContext.getApplication();//获取到Application对象
		//....
		
		//通过pageContext操纵其他容器
		pageContext.setAttribute("A","page",1);
		pageContext.setAttribute("A","request",2);
		//request.setAttribute("A", "request");
		pageContext.setAttribute("A","session",3);
		//session.setAttribute("A", "session");
		pageContext.setAttribute("A","application",4);
		
	%>
	<hr />
	通过pageContext获取内容:<br/>
	<% 
		Object obj1 = pageContext.getAttribute("A",1);
		Object obj2 = pageContext.getAttribute("A",2);
		Object obj3 = pageContext.getAttribute("A",3);
		Object obj4 = pageContext.getAttribute("A",4);
		out.print(obj1+"<br/>");
		out.print(obj2+"<br/>");
		out.print(obj3+"<br/>");
		out.print(obj4+"<br/>");
		pageContext.removeAttribute("A",3);
	%>
	<hr />
	通过各自容器获取内容:<br/>
	<% 
		Object obj5 = request.getAttribute("A");
		Object obj6 = session.getAttribute("A");
		Object obj7 = application.getAttribute("A");
		out.print(obj5+"<br/>");
		out.print(obj6+"<br/>");
		out.print(obj7+"<br/>");
	%>
</body>
</html>