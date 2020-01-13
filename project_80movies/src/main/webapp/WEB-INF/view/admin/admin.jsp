<%--
  Created by IntelliJ IDEA.
  User: hasee
  Date: 2019/9/27
  Time: 21:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>王鑫系统 - 后台管理</title>
    <base href="http://47.94.151.149:8080/80movies/">
    <link rel="stylesheet" href="css/admin.css">
    <link rel="stylesheet" href="lib/font-awesome/css/font-awesome.css">

</head>
<body>
<div class="header">
    <h1><a href="#">80movie系统</a></h1>
    <div class="user">

    </div>
</div>
<div class="main">
    <ul class="left-side">
        <li class="menu-title active">
            <a href="jump/userShow.do" target="pageBox">
                <i class=" fa fa-users"></i>&nbsp;&nbsp;Hello
            </a>
        </li>
        <li class="sub-menu">
            <ul>
                <li class="active">
                    <a href="jump/userShow.do" target="pageBox">
                        <i class=" fa fa-circle-thin"></i>&nbsp;&nbsp;用户信息(user)
                    </a>
                </li>
                <li>
                    <a href="channelController/queryChannelAreaMold.do" target="pageBox">
                        <i class=" fa fa-circle-thin"></i>&nbsp;&nbsp;频道(channel)
                    </a>
                </li>
                <li>
                    <a href="moldController/findMoldChannel.do" target="pageBox">
                        <i class=" fa fa-circle-thin"></i>&nbsp;&nbsp;类型(mold)
                    </a>
                </li>
                <li>
                    <a href="areaController/queryAreaAndChannel.do" target="pageBox">
                        <i class=" fa fa-circle-thin"></i>&nbsp;&nbsp;地区(area)
                    </a>
                </li>
                <li>
                    <a href="actorController/queryAll.do" target="pageBox">
                        <i class=" fa fa-circle-thin"></i>&nbsp;&nbsp;演员(actor)
                    </a>
                </li>
                <li>
                    <a href="directorController/queryAll.do" target="pageBox">
                        <i class=" fa fa-circle-thin"></i>&nbsp;&nbsp;导演(director)
                    </a>
                </li>
                <li>
                    <a href="lineController/queryAll.do" target="pageBox">
                        <i class=" fa fa-circle-thin"></i>&nbsp;&nbsp;线路(line)
                    </a>
                </li>
                <li>
                    <a href="messageController/queryMessageAndUser.do" target="pageBox">
                        <i class=" fa fa-circle-thin"></i>&nbsp;&nbsp;留言(message)
                    </a>
                </li>
                <li>
                    <a href="videoController/queryAllAndOthers.do" target="pageBox">
                        <i class=" fa fa-circle-thin"></i>&nbsp;&nbsp;视频(video)
                    </a>
                </li>
                <li>
                    <a href="bannerController/queryBannerVideo.do" target="pageBox">
                        <i class=" fa fa-circle-thin"></i>&nbsp;&nbsp;轮播图(banner)
                    </a>
                </li>
                <li>
                    <a href="movieController/findQueryAll.do" target="pageBox">
                        <i class=" fa fa-circle-thin"></i>&nbsp;&nbsp;视频分集(movie)
                    </a>
                </li>
                <li>
                    <a href="speakerController/findQueryAll.do" target="pageBox">
                        <i class=" fa fa-circle-thin"></i>&nbsp;&nbsp;留言(speaker)
                    </a>
                </li>
                <li>
                    <a href="hotController/findQueryAll.do" target="pageBox">
                        <i class=" fa fa-circle-thin"></i>&nbsp;&nbsp;热门(hot)
                    </a>
                </li>
                <li>
                    <a href="themeController/findQueryAll.do" target="pageBox">
                        <i class=" fa fa-circle-thin"></i>&nbsp;&nbsp;专题(theme)
                    </a>
                </li>
            </ul>
        </li>
    </ul>
    <div class="right-side">
        <iframe name="pageBox" src="jump/userShow.do"></iframe>
        <div class="footer">
            数据纯属瞎填,如有雷同纯属巧合,图片可能太大,服务器网卡,加载慢
        </div>
    </div>
</div>
<script>
    $(function () {
        $(".user").append("<a ></a>").text("用户"+getQueryVariable("account"));
        $(".user").append("<a href=\"index.jsp\">退出</a>");
        //获取url上的参数,参数名为url地址上的变量名
        function getQueryVariable(variable) {
            var query = window.location.search.substring(1);
            var vars = query.split("&");
            for (var i = 0; i < vars.length; i++) {
                var pair = vars[i].split("=");
                if (pair[0] == variable) {
                    return pair[1];
                }
            }
            return (false);
        }
    })
</script>
<script src="lib/jquery/jquery.js"></script>
<script src="js/admin.js"></script>
</body>
</html>
