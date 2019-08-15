<%@ page import="javax.naming.Context" %>
<%@ page import="javax.naming.InitialContext" %><%--
  Created by IntelliJ IDEA.
  User: Bk MamBa
  Date: 2019/8/14
  Time: 15:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>8.14--IDEA</title>
  </head>
  <body>
        Hello IDEA!112
        <%
            Context c=new InitialContext();
            String s=(String) c.lookup("java:/comp/env/JdniName");
            out.print(s);
        %><br>
        <a href="DeletebynameServlet?name=24">DeletebynameServlet</a>
  </body>
</html>
