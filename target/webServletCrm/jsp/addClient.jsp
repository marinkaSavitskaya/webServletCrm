<html>
<head>
    <title>My first CRM system</title>
</head>
<body>
<h2>Add Client</h2>
<form action="${pageContext.request.contextPath}/add" method="post">
    <input type="hidden" name="id" value="${client.id}" />
    <input type="hidden" name="action" value="add" />
    <table>
        <tr>
            <td>First name:</td>
            <td>
                <input type="text" name="firstName"/>
            </td>
        </tr>
        <tr>
            <td>Last name:</td>
            <td>
                <input type="text" name="lastName"/>
            </td>
        </tr>
        <tr>
            <td>Age:</td>
            <td>
                <input type="text" name="age"/>
            </td>
        </tr>
        <tr>
            <td>Name compane:</td>
            <td>
                <input type="text" name="nameCompany"/>
            </td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="Add client"/></td>
        </tr>
    </table>
</form>
<br>
<form action="mainPage.jsp" method="post">
    <button type="submit">Back to admin panel</button>
</form>
</body>
</html>
