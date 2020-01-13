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
<a href="themeController/goAdd.do"><button class="btn btn-info">添加专题</button></a>
<table class="table table-bordered">
    <tr>
        <th>专题序号</th>
        <th>专题名称</th>
        <th>专题图片</th>
        <th>专题个数</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${themes}" var="theme">
        <tr>
            <td>${theme.id}</td>
            <td>${theme.name}</td>
            <td><img style="width:100px;" src="image/theme/${theme.cover}"></td>
            <td>${theme.count}</td>
            <th>
                <a href="themeController/goUpdate.do?id=${theme.id}">修改</a>
                <a href="themeController/deleteTheme.do?id=${theme.id}">删除</a>
                <a href="themeController/themeVideoShow.do?id=${theme.id}">修改专题视频</a>
            </th>
        </tr>
    </c:forEach>
</table>
</body>

</html>
