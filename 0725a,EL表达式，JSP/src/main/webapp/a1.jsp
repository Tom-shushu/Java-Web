<%@ page language="java" pageEncoding="UTF-8"%>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<form action="a2.jsp">
		账号:<input type="text" name="name" /><br/>
		密码:<input type="password" name="pass" /><br/>
		年龄:<input type="number" name="age" /><br/>
		爱好:
		<input type="checkbox" name="love" value="zq" />足球
		<input type="checkbox" name="love" value="lq" />篮球
		<input type="checkbox" name="love" value="pq" />排球
		<br/>
		<input type="submit" value="提交" />
	</form>
</body>
</html>