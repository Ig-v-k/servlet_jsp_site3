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
        <form action="${pageContext.request.contextPath}/context" method="get">
            <a href="${pageContext.request.contextPath}/home">Home</a>
            |
            <a href="${pageContext.request.contextPath}/courses">Courses</a>
            |
            <a href="${pageContext.request.contextPath}/professors">Professors</a>
            |
            <a href="${pageContext.request.contextPath}/students">Students</a>
            |
            <a href="${pageContext.request.contextPath}/login">Login</a>
            |
            <a href="${pageContext.request.contextPath}/logout">Logout</a>
        </form>
    </div>
</body>
</html>
