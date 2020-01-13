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
<form action="hotController/selectVideoUpdate.do">
    <input type="hidden" name="hotId" value="${hotId}">
    <h3>电影名</h3><br/>
    <input type="text" name="name" class="input-medium" placeholder="宁缺毋滥"><br/>
    <h3>频道</h3><br/>
    <select name="moldId">
        <option value="">不选</option>
        <c:forEach items="${molds}" var="mold">
            <option value="${mold.id}" >${mold.name}</option>
        </c:forEach>
    </select>
    <h3><button class="btn btn-primary">查询</button></h3>
</form>
<form action="hotController/updateHot.do" enctype="multipart/form-data" method="post">
    <input type="hidden" name="id" value="${hotId}">
    <table class="table table-bordered">
        <tr>
            <td>视频编号</td>
            <td>视频名字</td>
            <td>选择</td>
        </tr>
        <tr>
            <td>${hot.video.id}</td>
            <td>${hot.video.name}</td>
            <td><input type="radio" name="videoId" checked="checked" value="${hot.videoId}"></td>
        </tr>
    </table>
    <h3>原图片</h3>
    <img style="width:200px;" src="image/hot/${hot.cover}">
    <input type="hidden" name="id" value="${hotId}">
    <input type="file" name="file">
    <c:if test="${!empty videos}">
        <table class="table table-bordered">
            <tr>
                <td>视频编号</td>
                <td>视频名字</td>
                <td>选择</td>
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
    <h3><button class="btn btn-primary">提交</button></h3>
</form>
</body>

</html>
