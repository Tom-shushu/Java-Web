<%@ page language="java" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>

	<c:if test="${empty NAME }">
		<c:redirect url="login.jsp">
			<c:param name="error" value="2"/>
		</c:redirect>
	</c:if>

	欢迎,${NAME }!
	<a href="login">注销</a>

</body>
</html>
