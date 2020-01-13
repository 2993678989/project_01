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
<a href="movieController/goAdd.do"><button class="btn btn-info">添加集数</button></a>
<table class="table table-bordered">
    <tr>
        <th>序号</th>
        <th>集数</th>
        <th>视频名称</th>
        <th>线路</th>
        <th>地址</th>
        <th>操作</th>
    </tr>

    <c:forEach items="${movies}" var="movie">
        <tr>
            <td>${movie.id}</td>
            <td>${movie.name}</td>
            <td>${movie.video.name}</td>
            <td>
                <c:forEach items="${movie.lines}" var="line">
                    ${line.name}&nbsp;
                </c:forEach>
            </td>
            <td>${movie.url}</td>
            <th>
                <a href="movieController/goUpdate.do?id=${movie.id}">修改</a>
                <a href="movieController/deleteMovie.do?id=${movie.id}">删除</a>
            </th>
        </tr>
    </c:forEach>
</table>
</body>

</html>
