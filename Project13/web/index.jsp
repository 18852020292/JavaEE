<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>index</title>
</head>
<body>
	<font color="red" size="5">Hello, Welcome to here!</font><br/>
	<span></span><br/>
	
	<a href="user_list.action">用户</a>
	
	<!-- 
	<input type="button" value="test" onclick="test()" />
	<script type="text/javascript">
		function test() {
			$.ajax({
				type:'post',
				//通配符方式
				url:'student_list.action',
				//指定method方式
				//url:'test.action',
				//DMI动态方法
				//url:'wolffy!list.action',
				success:function(data) {
					//console.log(data);
					alert("Hello,Welcome to here!");
				}
			});
		}
	</script> 
	-->
</body>
</html>