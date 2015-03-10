<%--
  Created by IntelliJ IDEA.
  User: RyomaArai
  Date: 15/03/10
  Time: 13:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="model.User" %>
<% User registerUser = (User) session.getAttribute("registerUser"); %>
<html>
<head>
    <title>ユーザー登録</title>
</head>
<body>

ログインID : <%= registerUser.getId() %>
<br>
パスワード : <%= registerUser.getPassword() %>
<br>
名前 : <%= registerUser.getName() %>
<br>
<a href="registerForm.jsp">戻る</a>
<a href="/RegisterUser?action=done">登録</a>
</form>
</body>
</html>
