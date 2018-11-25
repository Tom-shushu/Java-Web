<%@ page language="java" pageEncoding="UTF-8"%>
<html>
<head>
<title>注册新员工</title>
<style type="text/css">
	table{
		margin: 0 auto;
		border: 1px gray solid;
		width: 70%;
	}
	td,th{
		border: 1px gray solid;
	}
</style>
</head>
<body>
	<form action="emp/add.mvc" method="post">
		<table>
			<tr>
				<th>姓名</th>
				<td>
					<input type="text" name="empName" />
				</td>
			</tr>
			<tr>
				<th>职位</th>
				<td>
					<input type="text" name="job" />
				</td>
			</tr>
			<tr>
				<th>上司</th>
				<td>
					<input type="text" name="mgr" />
				</td>
			</tr>
			<tr>
				<th>入职时间</th>
				<td>
					<input type="text" name="hireDate" />
				</td>
			</tr>
			<tr>
				<th>薪金</th>
				<td>
					<input type="text" name="sal" />
				</td>
			</tr>
			<tr>
				<th>奖金</th>
				<td>
					<input type="text" name="comm" />
				</td>
			</tr>
			<tr>
				<th>部门</th>
				<td>
					<input type="text" name="deptNo" />
				</td>
			</tr>
			<tr>
				<th colspan="2">
					<input type="submit" value="注册新员工" />
				</th>
			</tr>
		</table>
	</form>
</body>
</html>