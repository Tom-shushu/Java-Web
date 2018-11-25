<%@ page language="java" pageEncoding="UTF-8"%>
<html>
<head>
<title>Request对象</title>
</head>
<body>
	<% 
		//第二组方法
		//request容器的生命周期:请求开始,响应结束
		//向request容器中添加一个内容,给它起了一个名字
		request.setAttribute("A", "你好");//String,Object
		//从request容器中按照Key取出value
		Object value = request.getAttribute("A");
		
		out.print(value);
		
		//从request容器中将key的内容删除
		request.removeAttribute("A");
	%>
</body>
</html>