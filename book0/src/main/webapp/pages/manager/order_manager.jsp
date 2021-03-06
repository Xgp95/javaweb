<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>订单管理</title>
    <!--静态包含base css jQuery-->
    <%@ include file="/pages/common/head.jsp" %>
</head>
<body>

<div id="header">
    <img class="logo_img" alt="" src="../../static/img/logo.gif">
    <span class="wel_word">订单管理系统</span>
    <%--静态包含manager_menu--%>
    <%@include file="/pages/common/manager_menu.jsp" %>
</div>

<div id="main">
    <table>
        <tr>
            <td>日期</td>
            <td>金额</td>
            <td>详情</td>
            <td>发货</td>

        </tr>

        <c:forEach items="${ sessionScope.myOrders }" var="myOrders">
            <tr>
                <td>${ myOrders.createTime }</td>
                <td>${ myOrders.price }</td>
                <td><a href="#">查看详情</a></td>
                <td>等待收货</td>
            </tr>
        </c:forEach>
        <tr>
            <td colspan="4" style="text-align: center"><a href="index.jsp">点击返回首页</a></td>
        </tr>
    </table>
</div>

<%--静态包含footer--%>
<%@include file="/pages/common/footer.jsp" %>
</body>
</html>