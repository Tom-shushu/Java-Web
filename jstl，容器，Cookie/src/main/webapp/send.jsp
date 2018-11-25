<%@ page language="java" pageEncoding="UTF-8" isELIgnored="false"%>
<html>
<head>
	<script type="text/javascript">
		function abc(){
			var str = "你好";
			str = encodeURI(str);
			str = encodeURI(str);
			//alert(str);
			location.href = "send?a="+str;
		}
		
	
	</script>
</head>
<body>


	<a href="recive.jsp?a=1">a</a>

	<a href="recive.jsp?a=1&b=2">b</a>
	
	
	<a href="javascript:abc()">c</a>
</body>
</html>
