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
<h1>有BUG</h1>
<h3>删除类型</h3>
<table class="table table-bordered">
    <tr>
        <th>序号</th>
        <th>类型</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${channelMolds.molds}" var="channelMold">
        <tr>
            <td>${channelMold.id}</td>
            <td>${channelMold.name}</td>
            <th><a href="channelController/deleteMold.do?id=${channelMold.id}&channelId=${channelMolds.id}">删除</a></th>
        </tr>
    </c:forEach>
</table>
<h3>添加类型</h3>
<table class="table table-bordered">
    <tr>
        <th>序号</th>
        <th>类型</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${molds}" var="mold">
        <tr>
            <td>${mold.id}</td>
            <td>${mold.name}</td>
            <th><a href="channelController/addMold.do?name=${mold.name}&channelId=${channelMolds.id}">添加</a></th>
        </tr>
    </c:forEach>
</table>
</body>

</html>
