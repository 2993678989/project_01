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
<h3>删除演员</h3>
<table class="table table-bordered">
    <tr>
        <th>序号</th>
        <th>演员</th>
        <th>操作</th>
    </tr>
    <input name="videoId" type="hidden" value="${videoActors.id}">

        <c:forEach items="${videoActors.actors}" var="actor">
            <c:if test="${!empty actor.id}">
            <tr>
                <td>${actor.id}</td>
                <td>${actor.name}</td>
                <th>
                    <a href="videoController/deleteVideoActor.do?videoId=${videoActors.id}&actorId=${actor.id}"> 删除</a>
                </th>
            </tr>
            </c:if>
        </c:forEach>

</table>
<h3>添加演员</h3>
<table class="table table-bordered">
    <tr>
        <th>序号</th>
        <th>演员</th>
        <th>操作</th>
    </tr>
    <input name="videoId" type="hidden" value="${videoActors.id}">

    <c:forEach items="${actors}" var="actor">
        <tr>
            <td>${actor.id}</td>
            <td>${actor.name}</td>
            <th>
                <a href="videoController/addVideoActor.do?videoId=${videoActors.id}&actorId=${actor.id}"> 添加</a>
            </th>
        </tr>
    </c:forEach>

</table>
</body>

</html>
