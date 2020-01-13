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
    <input name="videoId" type="hidden" value="${videoDirectors.id}">

        <c:forEach items="${videoDirectors.directors}" var="director">
            <c:if test="${!empty director.id}">
            <tr>
                <td>${director.id}</td>
                <td>${director.name}</td>
                <th>
                    <a href="videoController/deleteVideoDirector.do?videoId=${videoDirectors.id}&directorId=${director.id}">
                        删除</a>
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
    <input name="videoId" type="hidden" value="${videoDirectors.id}">

    <c:forEach items="${directors}" var="director">
        <tr>
            <td>${director.id}</td>
            <td>${director.name}</td>
            <th>
                <a href="videoController/addVideoDirector.do?videoId=${videoDirectors.id}&directorId=${director.id}">
                    添加</a>
            </th>
        </tr>
    </c:forEach>

</table>
</body>

</html>
