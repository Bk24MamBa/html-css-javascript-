<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>8.12</title>
</head>
<body>
	<%
		request.setAttribute("name1", "MB1");
		request.setAttribute("name1", "MB2");
		request.removeAttribute("name1");
		session.setAttribute("name2", "MB3");
		session.setAttribute("name2", "MB4");
		session.removeAttribute("name2");
		application.setAttribute("name3", "MB3");
		application.setAttribute("name3", "MB4");
		application.removeAttribute("name3");
	%>
</body>
</html>