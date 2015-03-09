<%--
  Created by IntelliJ IDEA.
  User: RyomaArai
  Date: 15/03/09
  Time: 17:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    request.setCharacterEncoding("UTF-8");
    String name = request.getParameter("name");
%>
<html>
<head>
    <title></title>
</head>
<body>
    <% if (request.getParameter("name") == "") { %>
<p>名前が入力されていません</p>
    <% } else { %>
    <%= name %>
    <% } %>

</body>
</html>
