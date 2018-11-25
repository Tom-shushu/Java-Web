<%@page import="bean.ClientInfo"%>
<%@page import="java.util.List"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<html>
<body>
<h1>用户访客记录!</h1>

<% 
	Object obj = application.getAttribute("LIST");
	if(obj==null){
		out.print("没有任何人访问!");
	}else{
		List<ClientInfo> list = (List<ClientInfo>)obj;
		for(ClientInfo ci:list){
			%>
				<hr/>
				<img src="image/<%=ci.getImage() %>" width="60" height="60"/><br/>
				<label><%=ci.getName() %></label><br/>
				<label><%=ci.getDate() %></label>
			<%
		}
		
	}
%>


</body>
</html>
