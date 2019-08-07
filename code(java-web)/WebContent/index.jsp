<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="Model.Student"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>学生列表</title>
<style type="text/css">
	table{
		text-align:center;
		margin:auto;
		margin-top:300px;
	}
	#xin{
		position:absolute;
		top:490px;
		left:1205px;
	}
</style>
</head>
<body>
	<table border="2px">
		<tr>
			<th>姓名</th>
			<th>密码</th>
			<th>年龄</th>
			<th>住址</th>
			<th>操作</th>
		</tr>
		<%
			List<Student> students=(List<Student>)request.getAttribute("students");
			for(Student student:students){
		%>
				<tr>
				<td><a href="QuerybynameServlet?name=<%=student.getName() %>"><%=student.getName() %></a></td>
				<td><%=student.getPwd() %></td>
				<td><%=student.getAge() %></td>
				<td><%=student.getAddress() %></td>
				<td><a href="DeletebynameServlet?name=<%=student.getName() %>">删除</a></td>
				</tr>
		<%	
			}
		%>
		<a href="addstudent.jsp" id="xin">新增</a>
	</table>
</body>
</html>