<%@ page import="pojo.Person" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/1/15
  Time: 17:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Person P = new Person();
    List<String> citys = new ArrayList<>();
    citys.add("郑州");
    citys.add("北京");
    citys.add("上海");
    P.setCitys(citys);
    Map<String, Object> map = new HashMap<>();
    map.put("key1", "value1");
    map.put("key2", "value2");
    map.put("key3", "value3");
    map.put("key4", "value4");
    map.put("key5", "value5");
    P.setMap(map);
    String[] phones = {"18612345678", "18712346578", "17712345678", "13212345678"};
    P.setPhone(phones);
    P.setName("张三");
    P.setAge(25);
    pageContext.setAttribute("person",P);
%>
${ person }<br>
${ person.name }<br>
${ person.citys[1] }<br>
${ person.phone[0] }<br>
${ person.map.key4 }<br>

${ 100 % 9 }<br>
${ 100 / 9 }
</body>
</html>
