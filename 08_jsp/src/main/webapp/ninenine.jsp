<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/1/13
  Time: 17:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        table{
            width: 650px;
        }
    </style>
</head>
<body>
    <h1 align="center">九九乘法表</h1>
    <table border="1" align="center">
    <%for (int i = 1;i <= 9;i++){ %>
        <tr>
    <%for (int j = 1;j <= i;j++){%>
        <td><%= i + "x" + j + "=" + (i * j)%></td>
    <%}%>
        </tr><%}%>
    </table>
    <a href="#">123</a>
</body>
</html>
