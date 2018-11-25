<%@ page language="java" pageEncoding="UTF-8"%>
<html>
<head>
<title>add</title>
</head>
<body>
	<form action="add.mvc" method="post">
		姓名:<input type="text" name="userName" /><br/>
		性别:
			<input type="radio" name="userSex" value="男" checked/>男
			<input type="radio" name="userSex" value="女"/>女
		<br/>
		年龄:<input type="number" name="userAge" /><br/>
		住址:<input type="text" name="userAddress" /><br/>
		<input type="submit" value="注册" />
	</form>
</body>
</html>