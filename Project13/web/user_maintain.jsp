<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${type}</title>
</head>
<body>
	<form method="post" action="user_${type}.action">
		<input type="hidden" id="id" name="user.id" value="${user.id}" />
		<table border="1" cellspacing="0" style="border-color: window;" width="20%">
			<tr>
				<td align="center" style="width: auto;">名称：</td>
				<td align="center"><input type="text" id="account" name="user.account" value="${user.account}" /></td>
			</tr>
			<tr>
				<td align="center" style="width: auto;">密码：</td>
				<td align="center"><input type="text" id="password" name="user.password" value="${user.password}" /></td>
			</tr>
		</table>
		<input type="submit" value="提交" />
	</form>
</body>
</html>