<%@ page language="java" pageEncoding="UTF-8"%>
<html>
<head>
<title>添加用户</title>
</head>
<body>
	<form action="saveuser" method="post">
		<table>
			<tr>
				<th>姓名</th>
				<td><input type="text" name="name" /></td>
			</tr>
			<tr>
				<th>性别</th>
				<td>
					<input type="radio" name="sex" value="男" checked="checked" />男
					<input type="radio" name="sex" value="女" />女
				</td>
			</tr>
			<tr>
				<th>年龄</th>
				<td><input type="number" name="age" /></td>
			</tr>
			<tr>
				<th>住址</th>
				<td><input type="text" name="address" /></td>
			</tr>
			<tr>
				<th colspan="2"><input type="submit" value="注册新用户" /></th>
			</tr>
		</table>
	</form>
</body>
</html>