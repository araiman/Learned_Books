<%--
  Created by IntelliJ IDEA.
  User: RyomaArai
  Date: 15/03/10
  Time: 6:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>スッキリ健康診断</title>
</head>
<body>
<h1>スッキリ健康診断</h1>

<form action="/HealthCheck" method="post">
    身長: <input type="number" name="height"> (cm)
    <br>
    体重: <input type="number" name="weight"> (kg)
    <br>
    <input type="submit" value="診断">
</form>
</body>
</html>
