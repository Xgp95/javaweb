<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/2/25
  Time: 16:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript">
        var jsonOBJ = {
            "key1": 123,
            "key2": ["abc", 456, true],
            "key3" : { "key3.1" : "value3.1" ,"key3.2" : "value3.2"},
        };

        // alert(jsonOBJ.key1);
        // for (var i = 0; i < jsonOBJ.key2.length; i++) {
        //     alert(jsonOBJ.key2[i])
        // };
        // alert(jsonOBJ.key3["key3.2"])
        var jsonString = JSON.stringify(jsonOBJ);
        // alert(jsonString);
        var parseJson = JSON.parse(jsonString);
        alert(parseJson.key2);
    </script>
</head>
<body>

</body>
</html>
