<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/1/18
  Time: 17:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    pageContext.setAttribute("key1", "pagecontext1");
    pageContext.setAttribute("key2", "pagecontext2");
    request.setAttribute("key2", "request");
    session.setAttribute("key2", "session");
    application.setAttribute("key2", "application");
%>

${ key2 }<br>

${ sessionScope.key2 }<br>

${ pageContext.request.contextPath }<br>

<%
    pageContext.setAttribute("req", request);
%>

${ req.serverPort }<br>
<hr>
${ param.password }<br>
${ param.hobby }<br>
${ paramValues.hobby[2] }<br>
<hr>
${ headerValues["User-Agent"][0] }<br>

${ header.Connection }
</body>
</html>
