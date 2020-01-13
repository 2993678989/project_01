<%--
  Created by IntelliJ IDEA.
  User: hasee
  Date: 2019/9/27
  Time: 10:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>channel.show</title>
    <base href="http://47.94.151.149:8080/80movies/">
    <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
    <script type="text/javascript" src="bootstrap/js/jquery.js"></script>
</head>
<body>
<h1>有BUG</h1>
<h3>删除地区</h3>
<table class="table table-bordered">
    <tr>
        <th>序号</th>
        <th>地区</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${channelAreas.areas}" var="channelArea">
        <tr>
            <td>${channelArea.id}</td>
            <td>${channelArea.name}</td>
            <th><a href="channelController/deleteArea.do?id=${channelArea.id}&channelId=${channelAreas.id}">删除</a></th>
        </tr>
    </c:forEach>
</table>
<h3>添加地区</h3>
<table class="table table-bordered">
    <tr>
        <th>序号</th>
        <th>地区</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${areas}" var="area">
        <tr>
            <td>${area.id}</td>
            <td>${area.name}</td>
            <th><a href="channelController/addArea.do?name=${area.name}&channelId=${channelAreas.id}">添加</a></th>
        </tr>
    </c:forEach>
</table>
</body>

</html>
