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
    <title>Title</title>
    <base href="http://47.94.151.149:8080/80movies/">
    <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
    <script type="text/javascript" src="bootstrap/js/jquery.js"></script>
</head>
<body>
<a href="jump/userInsert.do"><button class="btn btn-info">添加用户</button></a>
<table class="table table-bordered" >
    <tr>
        <th>id</th>
        <th>account</th>
        <th>password</th>
        <th>score</th>
        <th>header</th>
        <th>qq</th>
        <th>email</th>
        <th>phone</th>
        <th>loginTime</th>
        <th>ip</th>
        <th>操作</th>
    </tr>
</table>
<script>
    $(function () {
        $.ajax({
            url:"userController/queryAll.do",
            type:"get",
            processData: false,
            contentType: false,
            success:function (result) {
                for (var a = 0 ; a < result.data.length ; a++) {
                    var $tr = $("<tr></tr>");
                    var $th1 = $("<th></th>");
                    var $th2 = $("<th></th>");
                    var $th3 = $("<th></th>");
                    var $th4 = $("<th></th>");
                    var $th5 = $("<img style=\"width:100px;\">");
                    var $th6 = $("<th></th>");
                    var $th7 = $("<th></th>");
                    var $th8 = $("<th></th>");
                    var $th9 = $("<th></th>");
                    var $th10 = $("<th></th>");
                    var $th11 = $("<th></th>");
                    var $a1 = $("<a></a>").addClass("glyphicon glyphicon-trash");
                    var $a2 = $("<a></a>").addClass("glyphicon glyphicon-pencil");
                    $th1.text(result.data[a].id);
                    $th2.text(result.data[a].account);
                    $th3.text(result.data[a].password);
                    $th4.text(result.data[a].score);
                    if (result.data[a].header != null) {
                        $th5.attr("src","image/"+result.data[a].header);
                    }else{
                        $th5.attr("src","image/1.jpg");
                    }
                    $th6.text(result.data[a].qq);
                    $th7.text(result.data[a].email);
                    $th8.text(result.data[a].phone);
                    $th9.text(result.data[a].loginTime);
                    $th10.text(result.data[a].ip);
                    $a1.attr("value",result.data[a].id);
                    $a2.attr("href","jump/userUpdate.do?id="+result.data[a].id);
                    $th11.append($a1);
                    $th11.append($a2);
                    $tr.append($th1);
                    $tr.append($th2);
                    $tr.append($th3);
                    $tr.append($th4);
                    $tr.append($th5);
                    $tr.append($th6);
                    $tr.append($th7);
                    $tr.append($th8);
                    $tr.append($th9);
                    $tr.append($th10);
                    $tr.append($th11);
                    $("table").append($tr);
                }
            }
        });
    $("table").on("click","a.glyphicon-trash",function (result) {
        alert("正在删除id为"+$(this).attr("value")+"的数据");
        var aThis = this;
        $.ajax({
            url:"userController/deleteById.do",
            type:"post",
            data:{
                id:$(aThis).attr("value")
            },
            success:function (result) {
                if (result.code==200) {
                    alert(result.msg);
                    $(aThis).parent().parent().remove();
                }else {
                    alert(result.msg)
                }
            },
            error:function () {
                alert("连接失败")
            }
        })
    })  
    })
</script>
</body>
</html>
