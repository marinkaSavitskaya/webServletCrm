<html>
<head>
    <title>Edit Client</title>
</head>
<body>
<h1>Edit Form</h1>
<form action="${pageContext.request.contextPath}/edit" method="post">
    <input type="hidden" name="id" value="${editClient.getId()}"/>
    <table>
        <tr>
            <td>First Name:</td>
            <td>
                <input type="text" name="firstName" value="${editClient.getFirstName()}"/>
            </td>
        </tr>
        <tr>
            <td>Last Name:</td>
            <td>
                <input type="text" name="lastName" value="${editClient.getLastName()}"/>
            </td>
        </tr>
        <tr>
            <td>Age:</td>
            <td>
                <input type="text" name="age" value="${editClient.getAge()}"/>
            </td>
        </tr>
        <tr>
            <td>Name company:</td>
            <td>
                <input type="text" name="nameCompany" value="${editClient.getNameCompany()}"/>
            </td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="Edit client"/></td>
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
