<%--
  Created by IntelliJ IDEA.
  User: RyomaArai
  Date: 15/03/10
  Time: 21:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="model.User" %>
<% User loginUser = (User) session.getAttribute("user"); %>
<html>
<head>
    <title>どこつぶ</title>
</head>
<body>
<h1>どこつぶログイン</h1>
<% if (loginUser != null) { %>
    ログインに成功しました。
    <br>
    ようこそ <%= loginUser.getName() %>さん
    <br>
    <!--TODO つぶやきの投稿・閲覧のリンク先を作成-->
    <a href="/Main">つぶやきの投稿・閲覧へ</a>
<% } else { %>
    ログインに失敗しました
    <a href="/Login">トップヘ</a>
<% } %>
</body>
</html>
