<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/2/17
  Time: 11:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--分页开始--%>
<div id="page_nav">
    <c:if test="${ requestScope.page.pageNo > 1 }">
        <a href="${ requestScope.page.url }&pageNo=1">首页</a>
        <a href="${ requestScope.page.url }&pageNo=${ requestScope.page.pageNo - 1 }">上一页</a>
    </c:if>

    <c:choose>
        <%--情况1 总页码小于等于5--%>
        <c:when test="${ requestScope.page.pageTotal <= 5}">
            <c:set var="begin" value="1"/>
            <c:set var="end" value="${ requestScope.page.pageTotal }"/>

        </c:when>
        <%--情况2 总页码大于5--%>
        <c:when test="${ requestScope.page.pageTotal > 5 }">
            <c:choose>
                <%--情况2.1 当前页码为前3个，范围1-5--%>
                <c:when test="${ requestScope.page.pageNo <= 3 }">
                    <c:set var="begin" value="1"/>
                    <c:set var="end" value="5"/>
                </c:when>
                <%--情况2.2 当前页码为后3个，范围总页数减4-总页数--%>
                <c:when test="${ requestScope.page.pageNo > requestScope.page.pageTotal - 3 }">
                    <c:set var="begin" value="${ requestScope.page.pageTotal - 4 }"/>
                    <c:set var="end" value="${ requestScope.page.pageTotal }"/>
                </c:when>
                <%--情况2.3 当前页码为中间的，范围 当前页码-2 - 当前页码+2--%>
                <c:otherwise>
                    <c:set var="begin" value="${ requestScope.page.pageNo - 2 }"/>
                    <c:set var="end" value="${ requestScope.page.pageNo + 2 }"/>
                </c:otherwise>
            </c:choose>
        </c:when>
    </c:choose>

    <c:forEach begin="${ begin }" end="${ end }"
               var="i">
        <c:if test="${ requestScope.page.pageNo == i }">
            【${i}】
        </c:if>
        <c:if test="${ requestScope.page.pageNo != i }">
            <a href="${ requestScope.page.url }&pageNo=${ i }">${ i }</a>
        </c:if>
    </c:forEach>

    <c:if test="${ requestScope.page.pageNo < requestScope.page.pageTotal }">
        <a href="${ requestScope.page.url }&pageNo=${ requestScope.page.pageNo + 1 }">下一页</a>
        <a href="${ requestScope.page.url }&pageNo=${ requestScope.page.pageTotal }">末页</a>
    </c:if>

    共${ requestScope.page.pageTotal }页，${ requestScope.page.pageCountTotal }条记录
    到第<input value="${ empty param.pageNo ? 1: param.pageNo}" name="pn" id="pn_input"/>页
    <input type="button" value="确定" id="searchPageBtn">
    <script type="text/javascript">
        $(function () {
            $("#searchPageBtn").click(function () {
                var pageNo = $("#pn_input").val();
                location.href = "${ pageScope.basePath }${ requestScope.page.url }&pageNo=" + pageNo;
            })
        })
    </script>
</div>
<%--分页结束--%>
