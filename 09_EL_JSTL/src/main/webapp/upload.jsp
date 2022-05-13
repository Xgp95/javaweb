<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/1/24
  Time: 17:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="http://localhost:8080/09_EL_JSTL/uploadServlet" method="post" enctype="multipart/form-data">
    用户名：<input type="text" name="username" value="xugp"><br>
    密码：<input type="text" name="password" value="123456"><br>
    头像:<input type="file" name="photo"><br>
    <input type="submit" value="上传">
</form>
</body>
</html>
