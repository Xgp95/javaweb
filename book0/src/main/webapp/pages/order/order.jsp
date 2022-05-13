<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>我的订单</title>
    <!--静态包含base css jQuery-->
    <%@ include file="/pages/common/head.jsp" %>
    <style type="text/css">
        h1 {
            text-align: center;
            margin-top: 200px;
        }
    </style>
</head>
<body>

<div id="header">
    <img class="logo_img" alt="" src="static/img/logo.gif">
    <span class="wel_word">我的订单</span>
    <%--静态包含登录成功后的菜单--%>
    <%@ include file="/pages/common/login_sucess_menu.jsp" %>
</div>

<div id="main">

    <table>
        <tr>
            <td>日期</td>
            <td>金额</td>
            <td>状态</td>
            <td>详情</td>
        </tr>
        <C:forEach items="${ sessionScope.myOrders }" var="order">
            <tr>
                <td>${ order.createTime }</td>
                <td>${ order.price }</td>
                <td>${ order.status }</td>
                <td><a href="orderServlet?action=showOrderDetail&orderId=${ order.orderId }&createTime=${ order.createTime }">查看详情</a></td>
            </tr>
        </C:forEach>
        <tr>
            <td colspan="4" style="align-content: center"><a href="index.jsp">点击返回主页</a></td>
        </tr>
    </table>


</div>

<%--静态包含footer--%>
<%@include file="/pages/common/footer.jsp" %>
</body>
</html>