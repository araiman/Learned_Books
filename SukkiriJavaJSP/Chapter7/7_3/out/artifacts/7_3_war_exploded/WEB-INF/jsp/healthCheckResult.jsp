<%--
  Created by IntelliJ IDEA.
  User: RyomaArai
  Date: 15/03/10
  Time: 6:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="model.Health" %>
<% Health health = (Health) request.getAttribute("health"); %>
<html>
<head>
    <title>スッキリ健康診断</title>
</head>
<body>
<h1>スッキリ健康診断の結果</h1>
<!-- TODO 身長・体重・BMI・体型のスクリプト式を書くべし -->
身長 : <%= health.getHeight() %>
<br>
体重 : <%= health.getWeight() %>
<br>
BMI : <%= health.getBmi() %>
<br>
体型 : <%= health.getBodyType() %>
<br><br>
<a href="/WEB-INF/jsp/healthCheck.jsp">戻る</a>
</body>
</html>
