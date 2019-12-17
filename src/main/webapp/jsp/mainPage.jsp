<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>My first CRM system</title>
</head>
<body>
<h2>Work with CRM system</h2>

<table border="1">
    <tr>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Age</th>
        <th>Name Company</th>
    </tr>
    <c:forEach items="${listClient}" var="client">
        <tr>
            <td>${client.value.firstName}</td>
            <td>${client.value.lastName}</td>
            <td>${client.value.age}</td>
            <td>${client.value.nameCompany}</td>
            <td><a href="${pageContext.request.contextPath}/edit?id=${client.value.id}">Edit</a></td>
            <td><a href="${pageContext.request.contextPath}/delete?id=${client.value.id}">Delete</a></td>
        </tr>
    </c:forEach>

</table>
<form action="${pageContext.request.contextPath}/add" method="get">
    <button type="submit" name="add">Add Client</button>
</form>
</body>
</html>
