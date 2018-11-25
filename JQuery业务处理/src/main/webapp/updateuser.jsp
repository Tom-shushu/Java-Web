<%@page import="bean.UserInfo"%>
<%@page import="biz.UserBiz"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<html>
<head>
<title>修改用户</title>
</head>
<body>
	<% 
		int id = Integer.parseInt(request.getParameter("id"));
		UserBiz ub = new UserBiz();
		UserInfo ui = ub.findById(id);
	%>

	<form action="update.jsp" method="post">
		<input type="hidden" name="id" value="<%=ui.getUserId()  %>" />
		<table>
			<tr>
				<th>账号</th>
				<td><input type="text" name="name" value="<%=ui.getUserName()%>"/></td>
			</tr>
			<tr>
				<th>性别</th>
				<td>
					<input type="radio" name="sex" value="男" checked="checked" />男
					<input type="radio" name="sex" value="女" <%=ui.getUserSex().equals("男")?"":"checked='checked'" %>/>女
				</td>
			</tr>
			<tr>
				<th>年龄</th>
				<td><input type="number" name="age" value="<%=ui.getUserAge()%>"/></td>
			</tr>
			<tr>
				<th>住址</th>
				<td><input type="text" name="address" value="<%=ui.getUserAddress()%>"/></td>
			</tr>
			<tr>
				<th colspan="2"><input type="submit" value="确认修改" /></th>
			</tr>
		</table>
	</form>
</body>
</html>