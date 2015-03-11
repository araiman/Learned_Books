<%--
  Created by IntelliJ IDEA.
  User: RyomaArai
  Date: 15/03/11
  Time: 14:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="model.User" %>
<%@ page import="java.util.List" %>
<%@ page import="model.Mutter" %>
<%
    User user = (User) session.getAttribute("user");
    List<Mutter> mutterList = (List<Mutter>) application.getAttribute("mutterList");
    String errorMsg = (String) request.getAttribute("errorMsg");
%>
<html>
<head>
    <title>どこつぶ</title>
</head>
<body>
<h1>どこつぶメイン</h1>
<%= user.getName() %>さん、ログイン中
<a href="/Logout">ログアウト</a>
<br>
<a href="/Main">更新</a>
<form action="/Main" method="post">
    <input type="text" name="mutter">
    <input type="submit" value="つぶやく">
</form>
<% if (errorMsg != null) { %>
<p><%= errorMsg%></p>
<% } %>

<% for (Mutter mutter : mutterList) {%>
    <p> <%= mutter.getName() %> : <%= mutter.getContent() %> </p>
<% } %>

</body>
</html>
