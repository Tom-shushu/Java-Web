<%@ page language="java" pageEncoding="UTF-8"%>
<html>
<head>
<title>Request对象</title>
</head>
<body>
	<% 
		System.out.println("进入了Request3.jsp页面");
		//第三组方法
		//获取到指定文件夹的完整路径
		String path = request.getSession().getServletContext().getRealPath("img");
		out.print(path);
		//转发 跳转到指定页面
		request.getRequestDispatcher("a.jsp").forward(request, response);
	%>
</body>
</html>