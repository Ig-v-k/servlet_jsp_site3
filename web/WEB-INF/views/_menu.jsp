<%--
  Created by IntelliJ IDEA.
  User: wykladowca
  Date: 24.05.2019
  Time: 21:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <div style="padding: 5px;">
        <a href="${pageContext.request.contextPath}/homeServlet.a.b.c">Home</a>
        |
        <a href="${pageContext.request.contextPath}/courseListServlet.a.b.c">Courses</a>
        |
        <a href="${pageContext.request.contextPath}/professorListServlet.a.b.c">Professors</a>
        |
        <a href="${pageContext.request.contextPath}/studentListServlet.a.b.c">Students</a>
        |
        <a href="${pageContext.request.contextPath}/loginServlet.a.b.c">Login</a>
        |
        <a href="${pageContext.request.contextPath}/logoutServlet.a.b.c">Logout</a>
    </div>
</body>
</html>
