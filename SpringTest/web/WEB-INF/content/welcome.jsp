<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding="utf-8" %>
<html>
<head>
    <title>welcome</title>
</head>
<body>
    欢迎${requestScope.user.username}登录<br>
    欢迎来自Session的${sessionScope.user.username}登录<br>
</body>
</html>
