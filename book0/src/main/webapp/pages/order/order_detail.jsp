<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>购物车</title>
    <!--静态包含base css jQuery-->
    <%@ include file="/pages/common/head.jsp" %>
</head>
<body>

<div id="header">
    <img class="logo_img" alt="" src="static/img/logo.gif">
    <span class="wel_word">订单详情</span>
    <%--静态包含登录成功后的菜单--%>
    <%@ include file="/pages/common/login_sucess_menu.jsp" %>
</div>

<div id="main">
    <table>
        <tr>
            <td>商品名称</td>
            <td>数量</td>
            <td>单价</td>
            <td>金额</td>
            <td></td>
        </tr>

        <c:if test="${ not empty sessionScope.orderItemList }">
            <c:forEach items="${ sessionScope.orderItemList }" var="orderItem">
                <tr>
                    <td>${ orderItem.name }</td>
                    <td>${ orderItem.count }</td>
                    <td>${ orderItem.price }</td>
                    <td>${ orderItem.totalPrice }</td>
                    <td></td>
                </tr>
            </c:forEach>
        </c:if>
        <c:if test="${ empty sessionScope.orderItemList}">

            <tr>
                <td colspan="5"><a href="index.jsp">订单空，点击返回主页</a></td>
            </tr>
        </c:if>
        <tr>
            <td></td>
            <td></td>
            <td></td>
            <td colspan="2">创建时间:${ sessionScope.createTime }</td>
            <td></td>
        </tr>

    </table>

</div>
<%--静态包含footer--%>
<%@include file="/pages/common/footer.jsp" %>
</body>
</html>