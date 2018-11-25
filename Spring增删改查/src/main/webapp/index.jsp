<%@ page language="java" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
	<c:if test="${empty ALLEMP }">
		<c:redirect url="emp/find.mvc"/>
	</c:if>
	
	<c:forEach var="ei" items="${ALLEMP }">
		${ei.empNo }  ${ei.empName }
		
		<a href="emp/delete.mvc?empNo=${ei.empNo}">删除</a>
		<a href="emp/findbyid.mvc?empNo=${ei.empNo}">修改</a>
		
		<br/>
	</c:forEach>

</body>
</html>
