<%--
  Created by IntelliJ IDEA.
  User: hasee
  Date: 2019/10/12
  Time: 15:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Title</title>
    <base href="http://47.94.151.149:8080/80movies/">
    <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
    <script type="text/javascript" src="bootstrap/js/jquery.js"></script>
    <style type="text/css">
        li {
            margin: 10px;
            float: left;
            list-style: none;
            font-size: 20px;
        }
        #a13 {
            left: 450px;
            border: 1px solid black;
            width: 200px;
            height: 300px;
            float: left;
        }

    </style>
</head>
<body>
<h1><a href="onstageController/onstageShow.do?account=${sessionScope.account}">首页</a> </h1>
<h1>
    <span style="margin-right: 20px;">频道</span>
    <c:forEach var="c" items="${channels }">
        <c:if test="${c.id == id }">
            <font style="margin-right: 10px;">${c.name }</font>
        </c:if>
        <c:if test="${c.id != id }">
            <a href="onstageController/selectVideoByChannelId.do?id=${c.id }"
               style="margin-right: 10px;">${c.name }</a>

        </c:if>

    </c:forEach>
</h1>
<h1>
    分类
    <c:if test="${moldId == null }">
        <font style="margin: 10px;">全部</font>
    </c:if>
    <c:if test="${moldId != null }">
        <a href="onstageController/selectVideoByChannelId.do?id=${id }&areaId=${areaId}"
           style="margin-right: 10px;">全部</a>
    </c:if>


    <c:forEach var="m" items="${molds }">
        <c:if test="${m.id == moldId }">
            <font style="margin-left: 10px;">${m.name }</font>
        </c:if>
        <c:if test="${m.id != moldId }">
            <a href="onstageController/selectVideoByChannelId.do?id=${id}&moldId=${m.id }&areaId=${areaId}"
               style="margin-right: 10px;">${m.name }</a>

        </c:if>

    </c:forEach>
</h1>
<h1>
    区域
    <c:if test="${areaId == null }">
        <font style="margin: 10px;">全部</font>
    </c:if>
    <c:if test="${areaId != null }">
        <a href="onstageController/selectVideoByChannelId.do?id=${id }&moldId=${moldId}"
           style="margin-right: 10px;">全部</a>
    </c:if>


    <c:forEach var="a" items="${areas }">
        <c:if test="${a.id == areaId }">
            <font style="margin-left: 10px;">${a.name }</font>
        </c:if>
        <c:if test="${a.id != areaId }">
            <a href="onstageController/selectVideoByChannelId.do?id=${id}&areaId=${a.id }&moldId=${moldId}"
               style="margin-right: 10px;">${a.name }</a>

        </c:if>

    </c:forEach>
</h1>
<%--<h1>--%>
<%--    年代 全部--%>
<%--    <c:forEach var="i" begin="${channel.year }" end="2019">--%>
<%--        ${channel.year-i+2019 }--%>
<%--    </c:forEach>--%>
<%--</h1>--%>


<c:forEach items="${channelVideo.videos }" var="video">
    <div id="a13">
        <ul>
            <li><a href=""> 电影名:${video.name}<br>
                上映时间:${video.year}<br>
                评分:${video.score}<br>
                主演:
                <c:forEach items="${video.actors}" var="actor" begin="0" end="0">
                    ${actor.name}
                </c:forEach>
                <br>
                封面:
                <img style="width:100px;" src="image/video/${video.cover}">
            </a>
            </li>
        </ul>
    </div>
</c:forEach>
</body>
</html>
