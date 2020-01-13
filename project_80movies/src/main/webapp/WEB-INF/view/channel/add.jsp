<%--
  Created by IntelliJ IDEA.
  User: hasee
  Date: 2019/9/27
  Time: 10:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>channel.show</title>
    <base href="http://47.94.151.149:8080/80movies/">
    <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
    <script type="text/javascript" src="bootstrap/js/jquery.js"></script>
</head>
<body>
<form id="form" action="channelController/insert.do" method="post">
    频道名称:
    <input type="text" name="name" class="form-control"><br/>
    年份:
    <input type="text" name="year" class="form-control"><br/>
    展示数量
    <input type="text" name="showCount" class="form-control"><br/>
    <button>添加</button>
</form>
</body>

</html>
