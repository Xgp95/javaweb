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
    头部信息<br>
    页面信息<br>
<%--    <%@include file="footer.jsp"%>--%>
    <jsp:include page="footer.jsp">
        <jsp:param name="username" value="xgp"/>
        <jsp:param name="password" value="123456"/>
    </jsp:include>
</body>
</html>
