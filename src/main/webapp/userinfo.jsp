
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>用户列表</title>
  <script type="text/javascript" src="./js/jquery-3.4.1.min.js-"></script>
</head>
<body>
　 <center>
    <h1>用户列表</h1>
    用户名:<input type="text" name="username" placeholder="请输入用户名">
    <button>查询</button>
    <table border="1"style="text-align: center">
        <caption><button>新增</button></caption>
        <thead>
        <tr>
            <th>用户id</th>
            <th>用户名字</th>
            <th>用户昵称</th>
            <th>用户密码</th>
            <th>用户状态</th>
            <th>操作</th>
        </tr>
        </thead>
        <%--循环取结果集--%>
        <c:forEach var="userinfo" items="${userList}">

            <tr>
                <td>${userinfo.userid}</td>
                <td>${userinfo.username}</td>
                <td>${userinfo.userpass}</td>
                <td>${userinfo.compellation}</td>
                <td>${userinfo.state}</td>
                <td>
                    <button onclick="deleteByid(${userinfo.userid})">删除</button>
                    <button>修改</button>
                </td>
                <td></td>
            </tr>
        </c:forEach>
    </table>
</center>
<script type="text/javascript">
   /* $(function () {
      alert(id)
    })*/
    function  deleteByid(id) {
         alert(id);//得到id
        //调用ajax 调用后台删除的方法
    }
</script>


</body>
</html>