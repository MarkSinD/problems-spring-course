<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 03.11.2020
  Time: 16:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form</title>
</head>
<body>

<form:form action="processBox"  modelAttribute="box">

    <h3>MAP</h3>
    <form:select path="pen1">
        <c:forEach var="temp" items="${pens}">
            <form:option item="${temp}" value="${temp.key}"/>
        </c:forEach>
    </form:select>

    <h3>LIST</h3>
    <form:select path="pen2">
        <c:forEach var="temp" items="${penList}">
            <form:option item="${temp}" value="${temp.name}"/>
        </c:forEach>
    </form:select>

    <h3>STRING</h3>
    <form:select path="string">
    <form:options items="${words}"/>
</form:select>

    <input type="submit" value="Submit" />
</form:form>

</body>
</html>


