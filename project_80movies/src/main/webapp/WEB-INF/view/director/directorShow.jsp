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
    <title>Title</title>
    <base href="http://47.94.151.149:8080/80movies/">
    <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
    <script type="text/javascript" src="bootstrap/js/jquery.js"></script>
</head>
<body>
<a href="directorController/goAdd.do"><button class="btn btn-info">添加导演</button></a>
<table class="table table-bordered">

    <tr>
        <th>序号</th>
        <th>演员</th>
        <th>操作</th>
    </tr>
<c:forEach items="${directors}" var="director">
        <tr>
            <td>${director.id}</td>
            <td>${director.name}</td>
            <th>
                <a href="directorController/goUpdate.do?id=${director.id}">修改</a>
                <a href="directorController/delete.do?id=${director.id}">删除</a>
            </th>
        </tr>
</c:forEach>
</table>
</body>

</html>
