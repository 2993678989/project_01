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
    <title>Title</title>

    <base href="http://47.94.151.149:8080/80movies/">
    <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
    <script type="text/javascript" src="bootstrap/js/jquery.js"></script>
</head>
<body>
<a href="videoController/goAdd.do"><button class="btn btn-info">添加视频</button></a>
<table class="table table-bordered">
    <tr>
        <th>序号</th>
        <th>视频名</th>
        <th>描述</th>
        <th>年份</th>
        <th>点击</th>
        <th>评分</th>
        <th>封面</th>
        <th>类型</th>
        <th>地区</th>
        <th>主演</th>
        <th>导演</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${videos}" var="video">
        <tr>
            <td>${video.id}</td>
            <td>${video.name}</td>
            <td>${video.desc}</td>
            <td>${video.year}</td>
            <td>${video.play}</td>
            <td>${video.score}</td>
            <td><img style="width:100px;" src="image/video/${video.cover}"></td>
            <td>
            <c:forEach items="${video.molds}" var="mold">
                ${mold.name} &nbsp;
            </c:forEach>
            </td>
            <td>
            <c:forEach items="${video.areas}" var="area">
                ${area.name}
            </c:forEach>
            </td>
            <td>
            <c:forEach items="${video.actors}" var="actor">
                ${actor.name}
            </c:forEach>
            </td>
            <td>
            <c:forEach items="${video.directors}" var="director">
                ${director.name}
            </c:forEach>
            </td>
            <th>
                <a href="videoController/goUpdate.do?id=${video.id}">修改</a>
                <a href="videoController/delete.do?id=${video.id}">删除</a>
                <a href="videoController/goUpdateActor.do?id=${video.id}">修改演员</a>
                <a href="videoController/goUpdateDirector.do?id=${video.id}">修改导演</a>
            </th>
        </tr>

    </c:forEach>
</table>
</body>

</html>
