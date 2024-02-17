<%--
  Created by IntelliJ IDEA.
  User: 半夏
  Date: 2024/2/8
  Time: 22:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script src="js/jquery-3.6.0.min.js"></script>
    <title>Title</title>
</head>
<body>
用户名:<input type="text" name="phone" value="" id="pinp">
<span id="con"></span>
</body>
<script>
    //请求后台
    $.post("json",{},function(obj) {
        //获取混合模式
        console.log(obj.name);
    },"json")
</script>

</html>
