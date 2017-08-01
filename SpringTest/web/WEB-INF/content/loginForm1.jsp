<%--
  Created by IntelliJ IDEA.
  User: 64457
  Date: 2017/7/31
  Time: 22:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>测试@ModelAttribute(value="")注释返回具体类的方法</h3>
    <form action="modelLogin1" method="post">
        <table>
            <tr>
                <td><label>登录名：</label></td>
                <td><input type="text" id="loginname" name="loginname"></td>
            </tr>
            <tr><input type="submit" id="submit" value="登录"></tr>
        </table>
    </form>
</body>
</html>
