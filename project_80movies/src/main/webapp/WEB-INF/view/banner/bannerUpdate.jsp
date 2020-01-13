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
<form action="bannerController/selectVideoUpdate.do">
    <input type="hidden" name="id" value="${bannerId}">
    <input type="hidden" name="videoId" value="${videoId}">
    <h3>电影名</h3><br/>
    <input type="text" name="name" class="input-medium"><br/>
    <h3>频道</h3><br/>
    <select name="moldId">
        <option value="">不选</option>
        <c:forEach items="${molds}" var="mold">
            <option value="${mold.id}">${mold.name}</option>
        </c:forEach>
    </select>
    <h3>
        <button class="btn btn-primary">查询</button>
    </h3>
</form>
<form action="bannerController/updateBanner.do" enctype="multipart/form-data" method="post">
    <img style="width:100px;" src="image/banner/${banner.pic}">
    <input type="hidden" name="id" value="${bannerId}">
    <table class="table table-bordered">
        <tr>
            <th>轮播图序号</th>
            <th>视频名</th>
            <th>添加按钮</th>
        </tr>
        <tr>
            <td>${banner.id}</td>
            <td>${banner.video.name}</td>
            <td><input type="radio" name="videoId" checked="checked" value="${videoId}"></td>
        </tr>
    </table>
    <c:if test="${!empty videos}">
        <table class="table table-bordered">
            <tr>
                <th>视频序号</th>
                <th>视频名</th>
                <th>添加按钮</th>
            </tr>
            <c:forEach items="${videos}" var="video">
                <tr>
                    <td>${video.id}</td>
                    <td>${video.name}</td>
                    <td><input type="radio" name="videoId" value="${video.id}"></td>
                </tr>
            </c:forEach>
        </table>
    </c:if>
    <input type="file" name="file">
    <h3>
        <button class="btn btn-primary">提交</button>
    </h3>
</form>
</body>

</html>
