<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/1/10
  Time: 17:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"
         errorPage="error500.html" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    //    int j = 12 / 0;
%>

<%!
    private HashMap map;

    {
        map = new HashMap<>();
        map.put("key1", "v1");
        map.put("key2", "v2");
        map.put("key3", "v3");
        map.put("key4", "v4");
        map.put("key5", "v5");
    }
%>
<%=15 %><br>
<%=15.5 %><br>
<%="55555555" %><br>
<%=map%><br>
<%=request.getParameter("username")%><br>
<table border="1" cellspacing="0">
    <% for (int i = 0; i < 5; i++) {
    %>
    <tr>
        <td>第<%= i + 1  %>行</td>
        <td>第<%= i + 1  %>行</td>
    </tr>
    <%
        }%>

    <%
        System.out.println(request.getParameter("username"));
    %>


</table>
</body>
</html>
