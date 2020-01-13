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
<a href="themeController/goThemeVideoAdd.do?themeId=${themeVideos.id}"><button class="btn btn-info">添加视频</button></a>
<table class="table table-bordered">
    <tr>
        <th>视频序号</th>
        <th>视频名称</th>
        <th>操作</th>
    </tr>

    <c:forEach items="${themeVideos.videos}" var="themeVideo">
        <c:if test="${!empty themeVideo.id}">
        <tr>
            <td>${themeVideo.id}</td>
            <td>${themeVideo.name}</td>
            <th>
                <a href="themeController/deleteThemeVideo.do?videoId=${themeVideo.id}&themeId=${themeVideos.id}">删除</a>
            </th>
        </tr>
        </c:if>
    </c:forEach>
 </table>
</body>

</html>
