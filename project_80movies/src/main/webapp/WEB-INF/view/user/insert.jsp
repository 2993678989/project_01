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
    账号:<input type="text" name="account" class="i0 form-control"><br/>
    密码:<input type="text" name="password" class="i1 form-control"><br/>
    分数:<input type="text" name="score" class="i2 form-control"><br/>
    头像:<input type="file" name="file" class="i3"><br/>
    qq:<input type="text" name="qq" class="i4 form-control"><br/>
    邮箱:<input type="text" name="email" class="i5 form-control"><br/>
    电话:<input type="text" name="phone" class="i6 form-control"><br/>
    ip:<input type="text" name="ip" class="i7 form-control"><br/>
    <button class="btn btn-default">添加</button>
</form>
<script>
    $(function () {
        $(form).submit(function () {
            add();
            return false;
        });
        function add() {
            var formData = new FormData(form);
            $.ajax({
                url:"userController/add.do",
                type:"post",
                data:formData,
                processData: false,
                contentType: false,
                success:function (result) {
                    if (result.code==200) {
                        alert(result.msg);
                        window.location.href = "jump/userShow.do";
                    }else {
                        alert(result.msg);
                    }
                },
                error:function () {
                    alert("连接失败");
                }
            })
        }
    })
</script>
</body>
</html>