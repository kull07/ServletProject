
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Successfully Registration</title>
</head>
<body>

<br>
<h1 action="RegistrationController" align="center">Successfully<br> registration userName ${userNewName1} </h1>

<table border="1" align="center">
    <caption>Data new userName</caption>
    <tr>
        <th>User Name</th>
        <th>Email</th>
        <th>Address</th>
        <th>Phone Number</th>
    </tr>
    <tr>
        <td>${userNewName1}</td>
        <td>${userNewEmail1}</td>
        <td>${userNewAddress1}</td>
        <td>${userNewPhone1}</td>
    </tr>
</table>

</body>
</html>