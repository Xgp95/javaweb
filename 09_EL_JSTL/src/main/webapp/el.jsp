<%@ page import="java.security.Key" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/1/15
  Time: 16:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        pageContext.setAttribute("key", "pagecontextvalue");
    %>

    ${ key };

</body>
</html>
