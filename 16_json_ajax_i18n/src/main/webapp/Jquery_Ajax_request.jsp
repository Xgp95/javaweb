<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/2/26
  Time: 15:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="script/jquery-1.7.2.js"></script>
    <script type="text/javascript">
        $(function () {
            $("#ajaxBtn").click(function () {
                $.ajax({
                    url: "http://localhost:8080/16_json_ajax_i18n/ajaxServlet",
                    data: {action: "jQueryAjax"},
                    type: "post",
                    success: function (data) {
                        // $("#msg").html("id = " + data.id + "name = " + data.name);
                        document.getElementById("msg").innerHTML = "id = " + data.id + "name = " + data.name;
                    },
                    dataType: "json"
                });
            });

            $("#getBtn").click(function () {
                $.get("http://localhost:8080/16_json_ajax_i18n/ajaxServlet", "action=jQueryGet", function (data) {
                    $("#msg").html("id = " + data.id + "name = " + data.name);
                }, "json");
            });

            $("#postBtn").click(function () {
                $.post("http://localhost:8080/16_json_ajax_i18n/ajaxServlet", "action=jQueryPost", function (data) {
                    document.getElementById("msg").innerHTML = "id = " + data.id + "name = " + data.name;
                }, "json")
            });

            $("#getJSONBtn").click(function () {
                $.getJSON("http://localhost:8080/16_json_ajax_i18n/ajaxServlet", "action=jQueryGetJson", function (data) {
                    $("#msg").html("id = " + data.id + "name = " + data.name);
                });
            });

            $("#submit").click(function () {
                alert( $("#form01").serialize() );
                $.getJSON("http://localhost:8080/16_json_ajax_i18n/ajaxServlet", "action=jQuerySerialize&" + $("#form01").serialize(),
                    function (d) {
                        $("#msg").html("?????????:" + d.username + "\t??????:" + d.password + "\tradio:" + d.radio);
                    });
            });

        });
    </script>
</head>
<body>
<div>
    <button id="ajaxBtn">$.ajax??????</button>
    <button id="getBtn">$.get??????</button>
    <button id="postBtn">$.post??????</button>
    <button id="getJSONBtn">$.getJSON??????</button>
</div>
<div id="msg">

</div>
<br/><br/>
<form id="form01" method="get">
    ????????????<input name="username" type="text"/><br/>
    ?????????<input name="password" type="password"/><br/>
    ???????????????<select name="single">
    <option value="Single">Single</option>
    <option value="Single2">Single2</option>
</select><br/>
    ???????????????
    <select name="multiple" multiple="multiple">
        <option selected="selected" value="Multiple">Multiple</option>
        <option value="Multiple2">Multiple2</option>
        <option selected="selected" value="Multiple3">Multiple3</option>
    </select><br/>
    ?????????
    <input type="checkbox" name="check" value="check1"/> check1
    <input type="checkbox" name="check" value="check2" checked="checked"/> check2<br/>
    ?????????
    <input type="radio" name="radio" value="radio1" checked="checked"/> radio1
    <input type="radio" name="radio" value="radio2"/> radio2<br/>
</form>
<button id="submit">??????--serialize()</button>
</body>
</html>
