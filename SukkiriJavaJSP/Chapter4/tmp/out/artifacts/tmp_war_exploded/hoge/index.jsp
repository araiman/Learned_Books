<%--
  Created by IntelliJ IDEA.
  User: RyomaArai
  Date: 15/03/09
  Time: 6:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*, model.Employee" %>
<% Employee emp = new Employee("0001", "湊 雄介"); %>

<html>
<head>
    <title>こんちゃす</title>
</head>
<body>
<%-- 見えてますかー？　from JSPコメント--%>
<!-- 見えてますかー？from HTMLコメント-->
<p>こんにちはーーーー！！</p>

<p>IDは<%= emp.getId() %>、名前は<%= emp.getName() %>です</p>
</body>
</html>
