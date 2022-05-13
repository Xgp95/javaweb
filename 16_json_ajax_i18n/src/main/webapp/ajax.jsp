<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/2/25
  Time: 17:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="pragma" content="no-cache"/>
    <meta http-equiv="cache-control" content="no-cache"/>
    <meta http-equiv="Expires" content="0"/>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Title</title>
    <script type="text/javascript">
        function ajaxRequest() {
            var xmlHttpRequest = new XMLHttpRequest();
            xmlHttpRequest.open("GET", "http://localhost:8080/16_json_ajax_i18n/ajaxServlet?action=javaScriptAjax", true);
            xmlHttpRequest.onreadystatechange = function () {
                if (xmlHttpRequest.readyState == 4 && xmlHttpRequest.status == 200) {
                    var jsonObj = JSON.parse(xmlHttpRequest.responseText);
                    document.getElementById("div01").innerHTML = jsonObj.id + "" + jsonObj.name;
                }
            }
            xmlHttpRequest.send();
        }
    </script>
</head>
<body>
<a href="http://localhost:8080/16_json_ajax_i18n/ajaxServlet?action=javaScriptAjax">非Ajax</a>
<button onclick="ajaxRequest()">ajax request</button>
<button onclick="ajaxRequest()">ajax request</button>
<button onclick="ajaxRequest()">ajax request</button>
<button onclick="ajaxRequest()">ajax request</button>
<button onclick="ajaxRequest()">ajax request</button>
<div id="div01">
</div>
<table border="1">
    <tr>
        <td>1.1</td>
        <td>1.2</td>
    </tr>
    <tr>
        <td>2.1</td>
        <td>2.2</td>
    </tr>
</table>
</body>
</html>
