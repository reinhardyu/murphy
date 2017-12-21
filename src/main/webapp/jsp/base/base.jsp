<%--
  Created by IntelliJ IDEA.
  User: Murphy
  Date: 2017/12/17
  Time: 12:59
  To change this template use File | Settings | File Templates.
--%>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <base href="<%=basePath%>">
  <title></title>
</head>
<body>

</body>
</html>
