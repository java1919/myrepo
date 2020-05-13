<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/5/12
  Time: 14:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="com.yq.User" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h1>这是我的JSP页面。。。</h1>
  <%
    User user=new User();
  %>
  <%=user.getName()%>
  <br>
  <a href="HelloServlet">Servlet</a>
  </body>
</html>
