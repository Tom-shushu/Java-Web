<%@ page language="java" pageEncoding="UTF-8"%>
<html>
<head>
<title>会话对象</title>
</head>
<body>
	<% 	
		//销毁session
		//session.invalidate();
		//是否是新会话
		boolean b = session.isNew();
		out.print(b+"<br/>");
		//获取到最大存活时间 单位:秒
		int maxTime = session.getMaxInactiveInterval();
		out.print(maxTime+"<br/>");
		//设置session的最大存活时间 如果-1则为永久存活 单位:秒
		session.setMaxInactiveInterval(6);
		
	%>
</body>
</html>