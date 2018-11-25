<%@ page language="java" pageEncoding="utf-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>

	<c:forEach var="ui" items="${USERLIST }">
		${ui.userName }<br/>
	</c:forEach>

</body>
</html>
