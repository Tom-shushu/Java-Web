<%@ page language="java" pageEncoding="UTF-8"%>
<html>
<head>
<title>选择头像,输入昵称</title>
</head>
<body>
	<form action="client" method="post">
		<% 
			for(int i=1;i<=9;i++){
				%>
					<input type="radio" value="<%=i %>.jpg" name="image" checked="checked"/><img src="image/<%=i %>.jpg" width="60" height="60"/>
	
				<%
			}
		%>
		<br/>
		<input type="text" name="nickname" required="required" placeholder="请输入昵称" /><br/>
	
		<input type="submit" value="进入空间" />
	
	</form>
</body>
</html>