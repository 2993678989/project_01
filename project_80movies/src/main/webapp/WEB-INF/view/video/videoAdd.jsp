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
<form method="post" action="videoController/add.do" enctype="multipart/form-data">
    <h3>视频名称</h3><br/>
    <input type="text" name="name" class="form-control"><br/>
    <h3>视频简介</h3><br/>
    <input type="text" name="desc" class="form-control"><br/>
    <h3>年份</h3><br/>
    <input type="text" name="year" class="form-control"><br/>
    <h3>播放次数</h3><br/>
    <input type="text" name="play" class="form-control"><br/>
    <h3>评分</h3><br/>
    <input type="text" name="score" class="form-control"><br/>
    <h3>封面</h3><br/>
    <input type="file" name="file"><br/>
    <select name="moldId">
        <c:forEach items="${molds}" var="mold">
            <option value="${mold.id}" >${mold.name}</option>
        </c:forEach>
    </select>
    <select name="areaId">
        <c:forEach items="${areas}" var="area">
            <option value="${area.id}" >${area.name}</option>
        </c:forEach>
    </select>
    <h3><button>提交</button></h3>
</form>
</body>

</html>
