<%@page import="com.bean.UserInfo"%>
<%@page import="java.util.List"%>
<%@page import="com.biz.UserBiz"%>
<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=utf-8"%>
<html>
	<head>
	<title>Insert title here</title>
	<style type="text/css">
		table{
			margin: auto;
			border: 1px gray solid;
			width: 80%;
		}
		th,td{
			border: 1px gray solid;
		}
	</style>
	</head>
<body>
	<% 
		UserBiz ub = new UserBiz();
		List<UserInfo> list = ub.findAll();
	%>
	<table>
		<tr>
			<th>编号</th>
			<th>姓名</th>
			<th>年龄</th>
			<th>性别</th>
			<th>住址</th>
		</tr>
		<% 
			for(UserInfo ui:list){
				%>
				<tr>
					<td><%=ui.getUserId() %></td>
					<td><%=ui.getUserName() %></td>
					<td><%=ui.getUserAge() %></td>
					<td><%=ui.getUserSex() %></td>
					<td><%=ui.getUserAddress() %></td>
				</tr>
				<%
			}
		%>
		
		
	</table>
</body>
</html>