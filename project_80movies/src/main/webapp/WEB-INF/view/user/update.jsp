<%--
  Created by IntelliJ IDEA.
  User: hasee
  Date: 2019/9/27
  Time: 22:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="Content-Type" content="text/html; charset=gb2312">
    <title>Title</title>
    <base href="http://47.94.151.149:8080/80movies/">
    <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
    <script type="text/javascript" src="bootstrap/js/jquery.js"></script>
</head>
<body>
<form id="form" enctype="multipart/form-data">
    头像<img style="width:100px;" class="i3"><br/>
    账号:<input type="text" name="account" class="i0 form-control"><br/>
    密码:<input type="text" name="password" class="i1 form-control"><br/>
    分数:<input type="text" name="score" class="i2 form-control"><br/>
    修改头像:<input type="file" name="file"><br/>
    qq:<input type="text" name="qq" class="i4 form-control"><br/>
    邮箱:<input type="text" name="email" class="i5 form-control"><br/>
    电话:<input type="text" name="phone" class="i6 form-control"><br/>
    ip:<input type="text" name="ip" class="i7 form-controlQ"><br/>
    <button class="btn btn-default">修改</button>
</form>
<script>
    $(function () {
        $(form).submit(function () {
            f();
            return false;
        });

        $.ajax({
            url:"userController/findById.do",
            type:"post",
            data:{
                id:getQueryVariable("id")
            },
            success:function (result) {
                if (result.code == 200) {
                    $(".i0").attr("value",result.data.account);
                    $(".i2").attr("value",result.data.score);
                    $(".i3").attr("src","image/"+result.data.header);
                    if (result.data.header != null) {
                        $(".i3").attr("src","image/"+result.data.header);
                    }else{
                        $(".i3").attr("src","image/1.jpg");
                    }
                    $(".i4").attr("value",result.data.qq);
                    $(".i5").attr("value",result.data.email);
                    $(".i6").attr("value",result.data.phone);
                    $(".i7").attr("value",result.data.ip);
                }
                else {
                    alert(result.msg)
                }
            },
            error:function () {
                alert("连接失败id")
            }
        });
        function f() {
            var formData = new FormData(form);
            formData.append("id",getQueryVariable("id"));
            $.ajax({
                url:"userController/update.do",
                type:"post",
                data:formData,
                processData: false,
                contentType: false,
                success:function (result) {
                    if (result.code==200) {
                        alert(result.msg);
                      window.location.href="jump/userShow.do";
                    }
                    else {
                        alert(result.msg);
                    }
                },
                error:function () {
                    alert("连接失败")
                }
            })
        }
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
</body>
</html>