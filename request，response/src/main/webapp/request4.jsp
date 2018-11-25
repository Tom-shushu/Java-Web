<%@page import="java.util.Collection"%>
<%@page import="java.util.Set"%>
<%@page import="java.util.Map"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<html>
<head>
<title>Request对象</title>
</head>
<body>
	<% 
		//接收浏览器发送的内容
		//获取到浏览器发送的内容,获取到的结果为:String的单个内容
		String value1 = request.getParameter("name");
		String value2 = request.getParameter("pass");
		String value3 = request.getParameter("age");
		//获取到浏览器发送的内容,获取到的结果为:String[]的多个内容
		String values[] = request.getParameterValues("love");
		//获取到所有请求信息,返回的是一个map集合
		Map<String,String[]> map = request.getParameterMap();
		out.print(value1+"<br/>");
		out.print(value2+"<br/>");
		out.print(value3+"<br/>");	
		out.print("<hr/>");
		for(int i=0;i<values.length;i++){
			out.print(values[i]+"<br/>");
		}
		out.print("<hr/>");
		Set<String> set = map.keySet();
		Collection<String[]> coll = map.values();
		for(String[] s:coll){
			for(int i=0;i<s.length;i++){
				out.print(s[i]+"&nbsp;&nbsp;");
			}
			out.print("<br/>");
		}
	%>
</body>
</html>