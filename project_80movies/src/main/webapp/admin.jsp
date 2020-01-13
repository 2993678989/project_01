<%--
  Created by IntelliJ IDEA.
  User: hasee
  Date: 2019/9/27
  Time: 20:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
    <base href="http://47.94.151.149:8080/80movies/">
    <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
    <script type="text/javascript" src="bootstrap/js/jquery.js"></script>
</head>
<body>
<form id="form">
    账号:<input type="text" name="account" >
    密码:<input type="password" name="password">
    <button>登陆</button>
</form>

<script>
    $(function () {
        $(form).submit(function () {
            login();
            return false;
        });
        function login() {
            var formData = new FormData(form);
            if (formData.get("account")==null||formData.get("account").length<5) {
                alert("账号长度不能小于5");
                return;
            }
            if (formData.get("password")==null||formData.get("password").length<5) {
                alert("密码长度不能小于5");
                return;
            }
            $.ajax({
                url:"loginController/login.do",
                type:"post",
                processData: false,
                contentType: false,
                data:formData,
                success:function (result) {
                    if (result.code==200){
                        alert(result.msg);
                        window.location.href="adminController/login.do?account="+formData.get("account");
                    }
                    else {
                        alert(result.msg)
                    }
                },
                error:function() {
                    alert("连接错误")
                }
            })
        }
    })
</script>

</body>
</html>
