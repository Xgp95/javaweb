<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/2/18
  Time: 14:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<base href="http://localhost:8080/13_cookie_session/">
<html>
<head>
    <meta http-equiv="pragma" content="no-cache" />
    <meta http-equiv="cache-control" content="no-cache" />
    <meta http-equiv="Expires" content="0" />
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Session</title>
    <style type="text/css">

        ul li {
            list-style: none;
        }

    </style>
</head>
<body>
<iframe name="target" width="500" height="500" style="float: left;"></iframe>
<div style="float: left;">
    <ul>
        <li><a href="sessionServlet?action=createSession" target="target">Session的创建和获取（id号、是否为新创建）</a></li>
        <li><a href="sessionServlet?action=setAttribute" target="target">Session域数据的存储</a></li>
        <li><a href="sessionServlet?action=getAttribute" target="target">Session域数据的获取</a></li>
        <li>Session的存活</li>
        <li>
            <ul>
                <li><a href="sessionServlet?action=defaultLife" target="target">Session的默认超时及配置</a></li>
                <li><a href="sessionServlet?action=life3" target="target">Session3秒超时销毁</a></li>
                <li><a href="sessionServlet?action=deleteNow" target="target">Session马上销毁</a></li>
            </ul>
        </li>
        <li><a href="" target="target">浏览器和Session绑定的原理</a></li>
    </ul>
</div>
</body>
</html>
