<%@ page import="java.security.Key" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/1/10
  Time: 17:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <h1>scope.jsp页面</h1>

    <%
        application.setAttribute("key","application");
        session.setAttribute("key","session");
        request.setAttribute("key", "request");
        pageContext.setAttribute("key", "pageContext");
    %>
    <%= pageContext.getAttribute("key")%>
    <%
        request.getRequestDispatcher("scope1.jsp").forward(request, response);
    %>

</body>
</html>
