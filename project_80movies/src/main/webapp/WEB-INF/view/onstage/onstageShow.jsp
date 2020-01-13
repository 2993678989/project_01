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
    <style>
        #a1 {
            position: relative;
            border: 2px solid black;
            width: 1200px;
            height: 600px;
            margin: 0px auto;
            /*     background-color: ;*/
        }

        #a11 {
            border: 2px solid green;
            width: 1200px;
            height: 50px;
            margin: 0px auto;
        }

        #ul1 {
            margin-top: -60px;
            margin-left: 600px;
            display: inline-block;
        }

        li {
            margin: 10px;
            float: left;
            list-style: none;
            font-size: 20px;
        }

        #a12 {
            position: absolute;
            border: 2px solid green;
            width: 450px;
            height: 230px;
        }

        #a13 {
            left: 450px;
            position: absolute;
            border: 2px solid red;
            width: 750px;
            height: 510px;
        }

        #a14 {
            position: absolute;
            border: 2px solid violet;
            width: 450px;
            height: 260px;
            margin-top: 250px;
        }

        /*#a15 {*/
        /*    position: absolute;*/
        /*    border: 2px solid red;*/
        /*    width: 200px;*/
        /*    height: 100px;*/
        /*    margin-top: 250px;*/
        /*}*/
        /*#a16 {*/
        /*    position: absolute;*/
        /*    border: 2px solid red;*/
        /*    width: 200px;*/
        /*    height: 100px;*/
        /*    margin-top: 250px;*/
        /*}*/

        #gd {
            display: inline-block;
            margin-left: 300px;
        }
    </style>
</head>
<body>

<ul>
    <li style="font-size: 40px" class="account">用户${account}</li>
<c:forEach items="${channels}" var="channel">
    <li style="font-size: 30px"><a href="onstageController/selectVideoByChannelId.do?id=${channel.id}" >${channel.name}</a></li>
</c:forEach>
</ul>
<br>
<br>
<br>
<br>
<c:forEach items="${banners}" var="banner" begin="0" end="3">
    <img style="width:350px;" src="image/banner/${banner.pic}">
</c:forEach>
<c:forEach items="${channels}" var="channel" varStatus="i" begin="0" end="${channels.size()-1}">
    <h1>${i.index}</h1>
    <div id="a1">
        <div id="a11">
            <h3>${channel.name}</h3>
            <ul id="ul1">
                <c:forEach items="${channel.molds}" var="mold" begin="1" end="${channel.showCount}">
                    <li><a href="">${mold.name}</a>/</li>
                </c:forEach>
                <li><a href="">其他</a></li>
            </ul>
        </div>
        <div id="a12">
            <c:forEach items="${channelHots[i.index].hots}" var="hot" begin="0" end="3">
                <a href="" ><img style="width:200px;" src="image/hot/${hot.cover}"></a>
            </c:forEach>
        </div>
        <div id="a14">
            <h3>本周热门<a id="gd" src="" alter="123"> 更多</a></h3>
            <div id="a15">
                <a href=""><img style="width:200px;" src="image/video/${channelHots[i.index].videos[0].cover}"></a>
            </div>
            <c:forEach items="${channelHots[i.index].videos}" var="video" begin="0" end="3" varStatus="cH">
                <div id="a16">
                    <a href="">
                            ${cH.index+1}
                            ${video.name}
                            ${video.play}
                    </a>
                    <br>
                </div>
            </c:forEach>
        </div>
        <div id="a13">
            <ul>
                <c:forEach items="${channel.videos}" var="video" begin="0" end="5">
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
                </c:forEach>
            </ul>
        </div>

    </div>
</c:forEach>
</body>
</html>
