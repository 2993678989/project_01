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
<form action="themeController/updateTheme.do" method="post" enctype="multipart/form-data">
    <h3>专题序号</h3>
    <h4>${theme.id}</h4>
    <input type="hidden" name="id" value="${theme.id}">
    <h3>专题名称</h3>
    <input type="text" name="name" value="${theme.name}">
    <h3>原专题图片</h3>
    <img style="width:200px;" src="image/theme/${theme.cover}">
    <input type="hidden" name="cover" value="${theme.cover}">
    <h3>上传专题图片</h3>
    <input type="file" name="file">
    <h3>专题视频个数</h3>
    <input type="text" name="count" value="${theme.count}">
    <button class="btn btn-primary">提交</button>
</form>
</body>

</html>
