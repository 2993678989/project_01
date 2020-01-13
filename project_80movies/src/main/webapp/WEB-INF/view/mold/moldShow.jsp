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
<a href="moldController/goAdd.do"><button class="btn btn-info">添加分类</button></a>
<table class="table table-bordered">
    <tr>
        <th>序号</th>
        <th>分类名称</th>
        <th>频道名称</th>
        <th>操作</th>
    </tr>
<c:forEach items="${moldChannels}" var="mold">
        <tr>
            <td>${mold.id}</td>
            <td>${mold.name}</td>
            <td>${mold.channels.name}</td>
            <th>
                <a href="moldController/goUpdate.do?id=${mold.id}">修改</a>
                <a href="moldController/delete.do?id=${mold.id}">删除</a>
            </th>
        </tr>
</c:forEach>
</table>
</body>

</html>
