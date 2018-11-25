<%@ page language="java" pageEncoding="UTF-8" isELIgnored="false"%>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<% 
		//向四大容器中存放内容了
		pageContext.setAttribute("A","page",1);
		pageContext.setAttribute("A","request",2);
		pageContext.setAttribute("A","session",3);
		pageContext.setAttribute("A","application",4);
	%>
	
	EL表达式获取容器内容:<br/>
	${pageScope.A }  <br/>
	${requestScope.A } <br/>
	${sessionScope.A } <br/>
	${applicationScope.A }<br/>
	<!-- 从page容器中获取A,如果A在page中不存在,在request中寻找.... -->
	${A }
	
	
	<hr/>
	
	接受d.jsp送过来的参数
	${param.a }
	
</body>
</html>