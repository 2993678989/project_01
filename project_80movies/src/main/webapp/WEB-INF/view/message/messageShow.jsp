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
${messageAndUsers}
<br>
<c:if test="${1 !=  messageAndUsers.getPageNum()}">
    <a href="messageController/queryMessageAndUser.do?page=${ messageAndUsers.getPageNum() -1 }">
        <button class="btn btn-info">上一页</button>
    </a>
</c:if>
<c:forEach begin="1" end="${messageAndUsers.getPages() }" var="i">
    <c:if test="${i != messageAndUsers.getPageNum()  }">
        <a href="messageController/queryMessageAndUser.do?page=${i }">
            <button class="btn btn-info">${i }</button>
        </a>

    </c:if>
    <c:if test="${i == messageAndUsers.getPageNum()  }">
        <button class="btn">${i }</button>

    </c:if>
</c:forEach>
<c:if test="${messageAndUsers.getPages() !=  messageAndUsers.getPageNum()}">
    <a href="messageController/queryMessageAndUser.do?page=${ messageAndUsers.getPageNum() +1 }">
        <button class="btn btn-info">下一页</button>
    </a>
</c:if>
<table class="table table-bordered">

    <tr>
        <th>序号</th>
        <th>用户</th>
        <th>留言</th>
        <th>留言状态</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${messageAndUsers}" var="messageAndUser">
        <tr>
            <td>${messageAndUser.id}</td>
            <td>${messageAndUser.user.account}</td>
            <td>${messageAndUser.content}</td>
            <th>
                <c:if test="${messageAndUser.status == 0 }">
                    未审核
                </c:if>
                <c:if test="${messageAndUser.status == 1 }">
                    审核通过
                </c:if>
                <c:if test="${messageAndUser.status != 1 && messageAndUser.status != 0 }">
                    审核未通过
                </c:if>
            </th>
            <th>
                <c:if test="${messageAndUser.status == 1 || messageAndUser.status == 0}">
                    <a href="messageController/update.do?id=${messageAndUser.id}&state=n">
                        不通过审核
                    </a>
                </c:if>
                <c:if test="${messageAndUser.status != 1 }">
                    <a href="messageController/update.do?id=${messageAndUser.id}&state=y">
                        通过审核
                    </a>
                </c:if>
                <a href="messageController/delete.do?id=${messageAndUser.id}">删除</a>
            </th>
        </tr>
    </c:forEach>
</table>

</body>
</html>
