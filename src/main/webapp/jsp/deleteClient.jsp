<html>
<head>
    <title>Delete Client</title>
</head>
<body>
<h1>Delete Form</h1>
<form action="${pageContext.request.contextPath}/delete" method="post">
    <input type="hidden" name="id" value="${deleteClient.getId()}"/>
    <table>
        <tr>
            <td>First Name:</td>
            <td>
                <input type="text" name="firstName" value="${deleteClient.getFirstName()}" disabled="disabled"/>
            </td>
        </tr>
        <tr>
            <td>Last Name:</td>
            <td>
                <input type="text" name="lastName" value="${deleteClient.getLastName()}" disabled="disabled"/>
            </td>
        </tr>
        <tr>
            <td>Age:</td>
            <td>
                <input type="text" name="age" value="${deleteClient.getAge()}" disabled="disabled"/>
            </td>
        </tr>
        <tr>
            <td>Name company:</td>
            <td>
                <input type="text" name="nameCompany" value="${deleteClient.getNameCompany()}" disabled="disabled"/>
            </td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="Delete client"/></td>
        </tr>
    </table>
</form>
<br>
<form action="${pageContext.request.contextPath}/">
    <button type="submit">Back to main panel</button>
</form>
</body>
</html>
</body>
</html>
