<%--
  Created by IntelliJ IDEA.
  User: wykladowca
  Date: 24.05.2019
  Time: 17:21
  To change this template use File | Settings | File Templates.
--%>

<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored = "false" language="java" %>--%>

<%@include file="base.jspf"%>
<template:loggedOut htmlTitle="Log In" bodyTitle="Log In">
    You must log in to access the customer support site.<br /><br />
    <c:if test="${loginFailed}">
        <b>The username and password you entered are not correct. Please try
            again.</b><br /><br />
    </c:if>
<%--    <h1>Login</h1>
    You must log in to access the customer support site.<br /><br />
    <%
        if(((Boolean)request.getAttribute("loginFailed")))
        {
    %>
    <b>The username or password you entered are not correct. Please try
        again.</b><br /><br />
    <%
        }
    %>--%>
    <form method="post" action="${pageContext.request.contextPath}/loginServlet.a.b.c" >
        <%@include file="_menu.jsp"%>
        <table align="center" border="1" style="position: relative;top: 100px;">
            <tr>
                <td colspan="2" align="center"><h1>Registration Form</h1></td>
            </tr>
            <tr>
                <td>Name : </td>
                <td><input type="text" name="username" /></td>
            </tr>
            <tr>
                <td>Password : </td>
                <td><input type="password" name="password" /></td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit"  value="submit"/></td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit"  value="Sign In"/></td>
            </tr>
        </table>
    </form>
</template:loggedOut>
