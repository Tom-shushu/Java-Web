<%@ page language="java" pageEncoding="UTF-8" isELIgnored="false"%>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	
	<!-- JSP的标准动作 -->
	<%-- 
		产生了一个UserInfo的对象,对象名:ui,将这个对象放入到page容器中
	--%>
	<jsp:useBean id="ui" class="bean.UserInfo" scope="page"/>

	<jsp:useBean id="ui2" class="bean.UserInfo" scope="request">
		<jsp:setProperty property="userName" name="ui2" value="admin"/>
		<jsp:setProperty property="userAge" name="ui2" value="19"/>
	</jsp:useBean>
	
	<jsp:setProperty property="userId" name="ui" value="1"/>
	<jsp:setProperty property="userAge" name="ui" param="abc"/>
	
	${pageScope.ui }
	<br/>
	${requestScope.ui2}

	<hr/>
	
	<jsp:getProperty property="userId" name="ui"/>
	<jsp:getProperty property="userName" name="ui2"/>
	
	<!-- 转发 -->
	<jsp:forward page="b.jsp">
		<!-- 在转发过程中,传递参数 -->
		<jsp:param value="123" name="a"/>
	</jsp:forward>
	
</body>
</html>