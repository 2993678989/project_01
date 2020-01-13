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
<a href="channelController/add.do"><button class="btn btn-info">添加频道</button></a>
<table class="table table-bordered">
    <tr>
        <th>序号</th>
        <th>频道</th>
        <th>年份</th>
        <th>显示数量</th>
        <th>地区列表</th>
        <th>类型列表</th>
        <th>操作</th>
    </tr>
<c:forEach items="${channelAreaMolds}" var="channel">
        <tr>
            <td>${channel.id}</td>
            <td>${channel.name}</td>
            <td>${channel.year}</td>
            <td>${channel.showCount}</td>
            <td>
                <c:forEach items="${channel.areas}" var="areas">
                    ${areas.name} &nbsp;
                </c:forEach>
            </td>
            <td>
                <c:forEach items="${channel.molds}" var="molds">
                    ${molds.name} &nbsp;
                </c:forEach>
            </td>
            <th>
                <a href="channelController/goUpdate.do?id=${channel.id}">修改</a>
                <a href="channelController/delete.do?id=${channel.id}">删除</a>
                <a href="channelController/goUpdateArea.do?id=${channel.id}">bug1</a>
                <a href="channelController/goUpdateMold.do?id=${channel.id}">bug2</a>
            </th>
        </tr>
</c:forEach>
</table>
</body>

</html>
