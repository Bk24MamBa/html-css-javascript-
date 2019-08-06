<%@page import="Model.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>学生信息详情</title>
</head>
<body>
	<%
		Student student=(Student)request.getAttribute("student");
	%>
	<form method="post" action="UpdatebynameServlet">
		姓名：<input type="text" name="name" value="<%=student.getName() %>" readonly="readonly"><br>
		密码：<input type="text" name="pwd" value="<%=student.getPwd() %>"><br>
		年龄：<input type="text" name="age" value="<%=student.getAge() %>"><br>
		住址：<input type="text" name="address" value="<%=student.getAddress() %>"><br>
		<input type="submit" value="提交修改">
	</form>
</body>
</html>