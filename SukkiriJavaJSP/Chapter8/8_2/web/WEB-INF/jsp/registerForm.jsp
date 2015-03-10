<%--
  Created by IntelliJ IDEA.
  User: RyomaArai
  Date: 15/03/10
  Time: 13:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ユーザー登録</title>
</head>
<body>
<form action="/RegisterUser" method="post">
    ログインID : <input type="text" name="id">
    <br>
    パスワード : <input type="password" name="password">
    <br>
    名前 : <input type="text" name="name">
    <br>
    <input type="submit" value="確認">
</form>
</body>
</html>
