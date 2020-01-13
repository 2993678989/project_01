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
<table class="table table-bordered">

    <tr>
        <th>序号</th>
        <th>用户</th>
        <th>留言</th>
        <th>视频</th>
        <th>留言状态</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${speakers}" var="speaker">
        <tr>
            <td>${speaker.id}</td>
            <td>${speaker.user.account}</td>
            <td>${speaker.context}</td>
            <td>${speaker.video.name}</td>
            <th>
                <c:if test="${speaker.status == 0 }">
                    未审核
                </c:if>
                <c:if test="${speaker.status == 1 }">
                    审核通过
                </c:if>
                <c:if test="${speaker.status != 1 && speaker.status != 0 }">
                    审核未通过
                </c:if>
            </th>
            <th>
                <c:if test="${speaker.status == 1 || speaker.status == 0}">
                    <a href="speakerController/update.do?id=${speaker.id}&state=n">
                        不通过审核
                    </a>
                </c:if>
                <c:if test="${speaker.status != 1 }">
                    <a href="speakerController/update.do?id=${speaker.id}&state=y">
                        通过审核
                    </a>
                </c:if>
                <a href="speakerController/delete.do?id=${speaker.id}">删除</a>
            </th>
        </tr>
    </c:forEach>
</table>

</body>
</html>
