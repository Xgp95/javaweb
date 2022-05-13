<%@ page import="java.util.List" %>
<%@ page import="pojo.Student" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/1/13
  Time: 17:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        table {
            width: 300px;
            border: 1px black solid;
            border-collapse: collapse;
        }

        tr, td {
            border: black 1px solid;
        }
    </style>
</head>
<body>
<%--<%--%>
<%--    List<Student> stulist = new ArrayList<>();--%>
<%--    for (int i = 0; i < 10; i++) {--%>
<%--        stulist.add(new Student(i + 1, "name" + (i + 1), 18 + i, "phone" + i));--%>
<%--    }--%>
<%--%>--%>
<%
    List<Student> stulist = (List<Student>) request.getAttribute("studentlist");
%>

<table>
    <tr>
        <td>id</td>
        <td>姓名</td>
        <td>年龄</td>
        <td>电话</td>
        <td>操作</td>
    </tr>
    <% for (Student stu : stulist) { %>
    <tr>
        <td><%= stu.getId()%>
        </td>
        <td><%= stu.getName()%>
        </td>
        <td><%= stu.getAge()%>
        </td>
        <td><%= stu.getPhone()%>
        </td>
        <td>
            删除
        </td>
    </tr>
    <% } %>
</table>
</body>
</html>
