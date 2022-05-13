<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/1/12
  Time: 16:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    页脚信息<br>
    改一<%= request.getParameter("username")
    %><br>

    改二<%
        String password = request.getParameter("password");
        out.print(password + "\r");
        out.write("12");
    %>

</body>
</html>
