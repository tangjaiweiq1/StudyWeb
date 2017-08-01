<%--
  Created by IntelliJ IDEA.
  User: 64457
  Date: 2017/7/31
  Time: 22:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>测试ModelAttribute的不同用法</h3>
    <a href="loginForm1">测试@ModelAttribute(value="")注释返回具体类的方法</a><br><br>
    <a href="loginForm2">测试@ModelAttribute注释void返回具体类的方法</a><br><br>
    <a href="loginForm3">测试@ModelAttribute注释返回具体类的方法</a><br><br>
    <a href="loginForm4">测试@ModelAttribute和@RequestMapping同事注释一个方法</a><br><br>
    <a href="loginForm5">测试@ModelAttribute注释一个方法的参数</a><br><br>
</body>
</html>
