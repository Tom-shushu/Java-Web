<%@page import="bean.GoodsInfo"%>
<%@page import="java.util.List"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<html>
<head>
<style type="text/css">
	table{
		margin: 0 auto;
		border: 1px gray solid;
		width: 80%;
	}
</style>
<title>Insert title here</title>
</head>
<body>
	购物车显示页面
	<table>
		<tr>
			<th>序号</th>
			<th>名称</th>
			<th>价格</th>
			<th>数量</th>
		</tr>
		
		<% 
			double money = 0;
			Object obj = session.getAttribute("GWCLIST");
			if(obj==null){
				%>
					<tr>
						<td colspan="4">购物车空的,请购物吧</td>
					</tr>
				<%
			}else{
				List<GoodsInfo> list = (List<GoodsInfo>)obj;
				for(GoodsInfo gi:list){
					money+=gi.getGoodsNum()*gi.getGoodsPrice();
					%>
						<tr>
							<td><%=gi.getGoodsId() %></td>
							<td><%=gi.getGoodsName() %></td>
							<td><%=gi.getGoodsPrice() %></td>
							<td><%=gi.getGoodsNum() %></td>
						</tr>
					<%
				}
			}
			
		%>
		
		<tr>
			<td colspan="4">
				总价为:$<label style="color:red;font-size: 1em;"><%=money %></label>元
			</td>
		</tr>
		
	</table>
</body>
</html>