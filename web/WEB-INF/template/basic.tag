<%@ tag body-content="scriptless" trimDirectiveWhitespaces="true" %>
<%@ attribute name="htmlTitle" type="java.lang.String" rtexprvalue="true" required="true" %>
<%@ attribute name="bodyTitle" type="java.lang.String" rtexprvalue="true" required="true" %>
<%@ attribute name="extraHeadContent" fragment="true" required="false" %>
<%@ attribute name="extraNavigationContent" fragment="true" required="false" %>
<%@ include file="/WEB-INF/views/baseInclude.jspf" %>
<template:main htmlTitle="${htmlTitle}" bodyTitle="${bodyTitle}">
    <jsp:attribute name="headContent">
        <jsp:invoke fragment="extraHeadContent" />
        <link type="text/css" rel="stylesheet" href="<c:url value="/WEB-INF/stylesheet/style.css"/>">
	    <link type="text/css" rel="stylesheet" href="<c:url value="/WEB-INF/stylesheet/add_student_style.css"/>">
    </jsp:attribute>
    <jsp:attribute name="navigationContent">
        <a href="<c:url value="/students.do" />">List students</a><br />
        <a href="<c:url value="/students.do">
            <c:param name="action" value="create" />
        </c:url>">Add Student</a><br />
        <a href="<c:url value="/students.do" />">List Student</a><br />
        <a href="<c:url value="/login.do?logout" />">Log Out</a><br />
        <jsp:invoke fragment="extraNavigationContent" />
    </jsp:attribute>
    <jsp:body>
        <jsp:doBody />
    </jsp:body>
</template:main>