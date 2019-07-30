<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String name = request.getParameter("name");
		String pwd = request.getParameter("pwd");
		if(name.equals("nba")){
			session.setAttribute("uname", name);
			session.setAttribute("upwd", pwd);
			session.setMaxInactiveInterval(5);
			response.sendRedirect("success.jsp");
		}else{
			response.sendRedirect("login.jsp");
		}
	%>
</body>
</html>