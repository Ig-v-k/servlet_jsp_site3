<%--
  Created by IntelliJ IDEA.
  User: wykladowca
  Date: 24.05.2019
  Time: 17:21
  To change this template use File | Settings | File Templates.
--%>

<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored = "false" language="java" %>--%>

<%@include file="baseInclude.jspf"%>
<template:loggedOut htmlTitle="Log In" bodyTitle="Log In">

    You must log in to access the customer support site.<br /><br />
    <c:if test="${loginFailed}">
        <b style="color: darkred;">The username and password you entered are not correct. Please try again.</b><br /><br />
    </c:if>

    <form method="post" action="${pageContext.request.contextPath}/login.do" >
        <%@include file="_menu.jsp"%>
        Username<br />
        <input type="text" name="username" /><br /><br />
        Password<br />
        <input type="password" name="password" /><br /><br />
        <input type="submit" value="Log In" />
    </form>
</template:loggedOut>