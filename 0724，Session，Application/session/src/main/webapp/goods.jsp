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

<script type="text/javascript">


	function addGwc(gid){
		
		location.href = "goods?type=1&id="+gid;
		
	}

</script>
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>序号</th>
			<th>名称</th>
			<th>价格</th>
			<th>操作</th>
		</tr>
		<% 
			Object obj = session.getAttribute("GOODSLIST");
			if(obj==null){
				response.sendRedirect("goods?type=2");
			}else{
				List<GoodsInfo> list = (List<GoodsInfo>)obj;
				for(GoodsInfo gi:list){
					%>
					<tr>
						<td><%=gi.getGoodsId() %></td>
						<td><%=gi.getGoodsName() %></td>
						<td><%=gi.getGoodsPrice() %></td>
						<td><button onclick="addGwc(<%=gi.getGoodsId() %>)">加入购物车</button></td>
					</tr>
					<%
				}
			}
		%>
		
		<tfoot>
			<tr>
				<td colspan="4" align="right">
					<a href="gwc.jsp">查看购物车</a>
				</td>
			</tr>
		</tfoot>
	</table>
</body>
</html>