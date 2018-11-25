<%@page import="bean.UserInfo"%>
<%@page import="java.util.List"%>
<%@page import="biz.UserBiz"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<html>
<head>
	<style type="text/css">
		table{
			margin: auto;
			border:1px gray solid;
			width: 80%;
		}
	</style>
	
	<script type="text/javascript">
		function deleteUser(userId){
			
			if(confirm("你确定要删除么?")){
				location.href = "delete.jsp?id="+userId;
			}
		}
	</script>
</head>
<body>

	<div align="center">
		<form action="search.jsp" method="post">
			<input type="text" name="wd" value="<%=request.getParameter("wd")==null?"":request.getParameter("wd") %>" />
			<input type="submit" value="搜索" />
		</form>
	
		<a href="saveuser.jsp">注册新用户</a>
	</div>

	
	<% 
		int page1 = 1;//默认就是第一页
		String p = request.getParameter("page");
		if(p!=null){
			page1 = Integer.parseInt(p);
		}
		UserBiz ub = new UserBiz();
		List<UserInfo> list1 = ub.findAll();
		List<UserInfo> list;
		if(request.getAttribute("USERLIST")!=null){
			list = (List<UserInfo>)request.getAttribute("USERLIST");
		}else{
			list = ub.findPage(page1);
		}
		
		int allNum = list1.size();
		int allPage = (allNum%10==0)?(allNum/10):(allNum/10+1);
	%>
	<hr/>

	<table>
		<thead>
			<tr>
				<th>序号</th>
				<th>姓名</th>
				<th>年龄</th>
				<th>性别</th>
				<th>住址</th>
				<th>操作</th>
			</tr>
			<% 
				
				int i = 1;
				for(UserInfo ui:list){
					%>
						<tr>
							<td><%=i %></td>
							<td><%=ui.getUserName() %></td>
							<td><%=ui.getUserAge() %></td>
							<td><%=ui.getUserSex() %></td>
							<td><%=ui.getUserAddress() %></td>
							<td>
								<a href="updateuser.jsp?id=<%=ui.getUserId()%>">修改</a>
								<a href="javascript:deleteUser(<%=ui.getUserId()%>)">删除</a>
							</td>
						</tr>
					<%
					i++;
				}
			%>
			
			
			
			<tr>
				<td colspan="6" align="right">
					<% 
						for(int j=1;j<=allPage;j++){
							out.print("<a href='index.jsp?page="+j+"'>"+j+"</a>&nbsp;&nbsp;&nbsp;");
						}
					%>
				
				</td>
			</tr>
		</thead>
	</table>

</body>
</html>
