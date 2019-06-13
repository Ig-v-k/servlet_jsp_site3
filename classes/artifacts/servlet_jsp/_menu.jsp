<%--
  Created by IntelliJ IDEA.
  User: wykladowca
  Date: 24.05.2019
  Time: 21:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <div style="padding: 5px;">
<%--        <form action="${pageContext.request.contextPath}/context.do" method="get">--%>
            <a href="${pageContext.request.contextPath}/context.do?action=home">Home</a>
            |
            <a href="${pageContext.request.contextPath}/context.do?action=courses">Courses</a>
            |
            <a href="${pageContext.request.contextPath}/context.do?action=professors">Professors</a>
            |
            <a href="${pageContext.request.contextPath}/context.do?action=students">Students</a>
            |
            <a href="${pageContext.request.contextPath}/context.do?action=login">Login</a>
            |
            <a href="${pageContext.request.contextPath}/context.do?action=logout">Logout</a>
<%--        </form>--%>
    </div>
</body>
</html>
