<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>user_list</title>

</head>
<body>
	<div>
		<input type="button" id="addButton" value="新增" onclick="window.location.href= 'user_toAdd.action?type=add'" />
		<form method="post" action="user_list.action">
			<input type="text" id="searchText" name="searchText" value="查询:请输入名称..." />
			<input type="submit" id="searchButton" value="搜索" />
		</form>
	</div>
	<table border="1" cellspacing="0" style="border-color: window;" width="60%">
		<tr>
			<td align="center">ID</td>
			<td align="center">名称</td>
			<td align="center">密码</td>
		
		</tr>
		<!-- jstl标签、el表达式 -->
		<c:forEach items="${list}" var="user">
			<tr>
				<td align="center">${user.id}</td>
				<td align="center">${user.account}</td>
				<td align="center">${user.password}</td>
				<td align="center">
					<a href="user_toUpdate.action?type=update&id=${user.id}">修改</a>
					<a href="user_delete.action?id=${user.id}">删除</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	
	<script type="text/javascript">
		$(document).ready(function() {
			$("#addButton").click(function() {
				location.href="user_toAdd.action?type=add";				
			});
			
			$("#searchText").blur(function() {
				if ($("#searchText").val() == "") {
					$("#searchText").val("查询:请输入名称...");
				}
			});
			
			$("#searchText").focus(function() {
				$("#searchText").val("");
			});
		});
	</script>
</body>
</html>