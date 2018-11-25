<%@ page language="java" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>update</title>
</head>
<body>
	<form action="update.mvc" method="post">
	<input type="hidden" name="userId" value="${USERINFO.userId }" />
		姓名:<input type="text" name="userName" value="${USERINFO.userName }" /><br/>
		性别:
			<c:choose>
				<c:when test="${USERINFO.userSex=='男' }">
					<input type="radio" name="userSex" value="男" checked/>男
					<input type="radio" name="userSex" value="女"/>女
				</c:when>
				<c:otherwise>
					<input type="radio" name="userSex" value="男" />男
					<input type="radio" name="userSex" value="女" checked/>女
				</c:otherwise>
			</c:choose>
		<br/>
		年龄:<input type="number" name="userAge" value="${USERINFO.userAge }" /><br/>
		住址:<input type="text" name="userAddress" value="${USERINFO.userAddress }" /><br/>
		<input type="submit" value="修改" />
	</form>
</body>
</html>