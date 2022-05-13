<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/1/25
  Time: 18:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div>
    <span>欢迎<span class="um_span">${ sessionScope.loginUser.username }</span>光临尚硅谷书城</span>
    <a href="orderServlet?action=showMyOrder">我的订单</a>
    <a href="userServlet?action=logout">注销</a>&nbsp;&nbsp;
    <a href="index.jsp">返回到首页</a>
</div>

