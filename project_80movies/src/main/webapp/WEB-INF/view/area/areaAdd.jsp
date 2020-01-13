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
<form method="post" action="areaController/add.do">
    <h3>地区</h3><br/>
    <input type="text" name="name" class="form-control"><br/>
    <h3>频道</h3><br/>
    <select name="channelId">
        <c:forEach items="${channels}" var="channel">
            <option value="${channel.id}" >${channel.name}</option>
        </c:forEach>
    </select>
    <h3><button>提交</button></h3>
</form>
</body>

</html>
