<%@page import="listener.Listener2"%>
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
// 		request.setAttribute("name1", "MB1");
// 		request.setAttribute("name1", "MB2");
// 		request.removeAttribute("name1");
		Listener2 listener2=new Listener2();
		session.setAttribute("a", listener2);
// 		application.setAttribute("name3", "MB3");
// 		application.setAttribute("name3", "MB4");
// 		application.removeAttribute("name3");
	%>
</body>
</html>