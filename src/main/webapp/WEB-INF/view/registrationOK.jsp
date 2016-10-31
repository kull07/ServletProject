
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Successfully Registration</title>
</head>
<body>

<br>
<h1 action="RegistrationController" align="center">Successfully<br> registration new user!</h1>

<table border="1" align="center">
    <caption>Wellcome, ${userNewName1}. Your data in system:</caption>
    <tr>
        <th>User Name</th>
        <th>E-mail</th>
        <th>Password</th>
    </tr>
    <tr>
        <td>${userNewName1}</td>
        <td>${userNewEmail1}</td>
        <td>${userNewPass1}</td>


    </tr>
</table>

</body>
</html>