<%--
  Created by IntelliJ IDEA.
  User: 64457
  Date: 2017/7/5
  Time: 23:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<from action="register" method="post">
    <table>
        <tr>
            <td><label>登录名：</label></td>
            <td><input tupe="text" id="loginname" name="loginname"></td>
        </tr>
        <tr>
            <td><label>密码：</label></td>
            <td><input tupe="text" id="password" name="password"></td>
        </tr>
        <tr>
            <td><input tupe="submit" id="submit">登录</td>
        </tr>
    </table>

</from>
</body>
</html>
