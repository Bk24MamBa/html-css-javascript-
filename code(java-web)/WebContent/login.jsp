<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登录</title>
</head>
<body>
	<form action="loginServlet" method="post" style="align:center;">
		用户名：<input type="text" name="name"><br>
		密码：<input type="password" name="pwd"><br>
		<input type="submit" value="登录">
	</form>
</body>
</html>