<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>购物车</title>
    <!--静态包含base css jQuery-->
    <%@ include file="/pages/common/head.jsp" %>
    <script type="text/javascript">
        $(function () {
            $("a.deleteItems").click(function () {
                confirm("确定要删除【" + $(this).parent().parent().find("td:first").text() + "】么")
            })

            $("#clearItems").click(function () {
                confirm("确定清空购物车么？")
            })

            $(".updateCount").change(function () {
                var name = $(this).parent().parent().find("td:first").text();
                var count = this.value;
                var id = $(this).attr("bookId");
                if (confirm("确定要把" + name + "修改为" + count + "个么？")) {
                    location.href = "${ basePath }cartServlet?action=updateCount&id=" + id + "&count=" + count;
                } else {
                    this.value = this.defaultValue;
                }
            })
        })
    </script>
</head>
<body>

<div id="header">
    <img class="logo_img" alt="" src="static/img/logo.gif">
    <span class="wel_word">购物车</span>
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
            <td>操作</td>
        </tr>
        <c:if test="${ not empty sessionScope.cart.items }">
            <c:forEach items="${ sessionScope.cart.items }" var="entry">
                <tr>
                    <td>${ entry.value.name }</td>
                    <td>
                        <input class="updateCount" bookId="${ entry.value.id }" style="width: 60px" type="text"
                               value="${ entry.value.count }">
                    </td>
                    <td>${ entry.value.price }</td>
                    <td>${ entry.value.priceTotal }</td>
                    <td><a class="deleteItems" href="cartServlet?action=deleteItems&id=${ entry.value.id }">删除</a></td>
                </tr>
            </c:forEach>
        </c:if>

        <c:if test="${ empty sessionScope.cart.items }">

            <tr>
                <td colspan="5"><a href="index.jsp">购物车空，点击返回主页</a></td>
            </tr>
        </c:if>


    </table>
    <c:if test="${ not empty sessionScope.cart.items }">
        <div class="cart_info">
            <span class="cart_span">购物车中共有<span class="b_count">${ sessionScope.cart.totalCount }</span>件商品</span>
            <span class="cart_span">总金额<span class="b_price">${ sessionScope.cart.totalPrice }</span>元</span>
            <span id="clearItems" class="cart_span"><a href="cartServlet?action=clearItems">清空购物车</a></span>
            <span class="cart_span"><a href="orderServlet?action=createOrder">去结账</a></span>
        </div>
    </c:if>

</div>
<%--静态包含footer--%>
<%@include file="/pages/common/footer.jsp" %>
</body>
</html>