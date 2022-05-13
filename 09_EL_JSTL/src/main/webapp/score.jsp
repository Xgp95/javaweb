<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="pojo.Person" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/1/20
  Time: 16:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        table {
            width: 200px;
            border: 1px black solid;
            border-collapse: collapse;
        }

        td, th {
            border: black 1px solid;
            width: max-content;
        }
    </style>
</head>
<body>
<c:set scope="page" var="abc" value="page"></c:set>
${ pageScope.abc }<br>

<c:if test="${ 1 == 1 }">
    <h2>true</h2><br>
</c:if>

<c:set scope="page" var="height" value="170"></c:set>

<c:choose>
    <c:when test="${ pageScope.height >= 180 }">
        <h3>超过180很高</h3>
    </c:when>

    <c:when test="${ pageScope.height >= 170 }">
        <h3>超过170普通人</h3>
    </c:when>

    <c:otherwise>
        <h3>低于170</h3>
    </c:otherwise>
</c:choose>
<hr>

<table>
    <c:forEach begin="1" end="15" var="i">
        <tr>
            <td>${ i }</td>
        </tr>
    </c:forEach>
</table>
<hr>
<%
    String[] arr = new String[]{"aa", "bb", "cc", "dd"};
    pageContext.setAttribute("arr", arr);
%>
<table>
    <th>项</th>
    <c:forEach items="${ pageScope.arr }" var="i">
        <tr>
            <td>${ i }</td>
        </tr>

    </c:forEach>
</table>
<hr>
<%
    HashMap<String, Object> map = new HashMap<>();
    map.put("key1", "value1");
    map.put("key2", "value2");
    map.put("key3", "value3");
    pageContext.setAttribute("map", map);
%>
<table>
    <tr>
        <th>key</th>
        <th>value</th>
    </tr>

    <c:forEach items="${ pageScope.map }" var="m">
        <tr>
            <td>${ m.key }</td>
            <td>${ m.value }</td>
        </tr>
    </c:forEach>
</table>
<hr>
<%
    ArrayList<Person> people = new ArrayList<>();
    for (int i = 1; i <= 10; i++) {
        Person p = new Person();
        p.setAge( 18 + i);
        p.setName("name" + i);
        people.add(p);
    }
%>

<%
    pageContext.setAttribute("people", people);
%>
<table>
    <tr>
        <th>姓名</th>
        <th>年龄</th>

    </tr>
<c:forEach items="${ pageScope.people }" var="p" varStatus="sta" begin="2" end="9" step="1">
    <tr>
        <td>${ p.name }</td>
        <td>${ p.age }</td>
        <td>${ sta.first }</td>
    </tr>


</c:forEach>
</table>
</body>
</html>
