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
<a href="bannerController/goAdd.do"><button class="btn btn-info">添加轮播图</button></a>
<table class="table table-bordered">
    <tr>
        <th>轮播图序号</th>
        <th>图片</th>
        <th>电影名</th>
        <th>操作</th>
    </tr>
<c:forEach items="${bannerVideos}" var="bannerVideo">
        <tr>
            <td>${bannerVideo.id}</td>
            <td><img style="width:100px;" src="image/banner/${bannerVideo.pic}"></td>
            <td>${bannerVideo.video.name}</td>
            <th>
                <a href="bannerController/goUpdate.do?id=${bannerVideo.id}&videoId=${bannerVideo.videoId}">修改</a>
                <a href="bannerController/deleteBanner.do?id=${bannerVideo.id}">删除</a>
            </th>
        </tr>
</c:forEach>
</table>
</body>

</html>
