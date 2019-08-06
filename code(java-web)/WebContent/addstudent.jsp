<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="AddstudentServlet">
		姓名：<input type="text" name="name"><br>
		密码：<input type="password" name="pwd"><br>
		年龄：<input type="text" name="age"><br>
		住址：<input type="text" name="address"><br>
		<input type="submit" value="添加">
	</form>
</body>
</html>