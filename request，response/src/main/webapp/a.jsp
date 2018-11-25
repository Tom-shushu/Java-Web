<%@ page language="java" import="com.util.DemoAUtil" pageEncoding="UTF-8"%>
<html>
<head>
<title>九九乘法表</title>
</head>
<body>

	<h1>第一种方式1</h1>
	<% 
	System.out.println("进入了a.jsp页面");
		for(int i=1;i<10;i++){
			for(int j=1;j<=i;j++){
				%>
					<%=(i+"*"+j+"="+i*j)%>&nbsp;
					
				<%
				
			}
			%><br /><%
		}
	%>
	
	<hr/>
	<h1>第二种方式</h1>
	
	<%=new DemoAUtil().getJiuJiu() %>
	
</body>
</html>