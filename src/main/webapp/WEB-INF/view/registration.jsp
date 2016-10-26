<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form registration</title>
</head>
<body>
<h1 align="center">Registration new user</h1>
<form action="AddUser" method="post" >
    <table align="center" >
        <tr><td>User: <input type="text" name="user" size="10"><br></td></tr>
        <tr><td>Password: <input type="password" name="password" size="10"><br></td></tr>
        <tr><td>E-mail: <input type="text" name="email"><br></td></tr>
        <tr><td>Address: <input type="text" name="address"><br></td></tr>
        <tr><td>Phone number: <input type="text" name="phone"><br></td></tr>

        <tr><td><input type="submit" name="save" value="Save"></td></tr>
        <tr><td><input type="submit" name="cancel" value="Exit"></td></tr>
    </table>
</form>
</body>
</html>
