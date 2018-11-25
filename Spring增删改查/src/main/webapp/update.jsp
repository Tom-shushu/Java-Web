<%@ page language="java" pageEncoding="UTF-8" isELIgnored="false"%>
<html>
<head>
<title>修改员工</title>
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
	<form action="emp/update.mvc" method="post">
		<input type="hidden" name="empNo" value="${EMPBEAN.empNo }" />
		<table>
			<tr>
				<th>姓名</th>
				<td>
					<input type="text" name="empName" value="${EMPBEAN.empName }" />
				</td>
			</tr>
			<tr>
				<th>职位</th>
				<td>
					<input type="text" name="job" value="${EMPBEAN.job }" />
				</td>
			</tr>
			<tr>
				<th>上司</th>
				<td>
					<input type="text" name="mgr" value="${EMPBEAN.mgr }" />
				</td>
			</tr>
			<tr>
				<th>入职时间</th>
				<td>
					<input type="text" name="hireDate" value="${EMPBEAN.hireDate }" />
				</td>
			</tr>
			<tr>
				<th>薪金</th>
				<td>
					<input type="text" name="sal" value="${EMPBEAN.sal }" />
				</td>
			</tr>
			<tr>
				<th>奖金</th>
				<td>
					<input type="text" name="comm" value="${EMPBEAN.comm }" />
				</td>
			</tr>
			<tr>
				<th>部门</th>
				<td>
					<input type="text" name="deptNo" value="${EMPBEAN.deptNo }" />
				</td>
			</tr>
			<tr>
				<th colspan="2">
					<input type="submit" value="修改员工" />
				</th>
			</tr>
		</table>
	</form>
</body>
</html>