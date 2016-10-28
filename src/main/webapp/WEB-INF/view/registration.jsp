<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form registration</title>
</head>
<body>
<h1 align="center">Registration new User in system:</h1>
<form action="RegistrationController" method="post" >
    <table align="center" >
        <tr><td>User: <input type="text" name="userName" placeholder="Your login for entrance"><br></td></tr>
        <tr><td>Password: <input type="password" name="password" placeholder="Minimal six quantity symbol"><br></td></tr>
        <tr><td>E-mail: <input type="text" name="email" placeholder="Example: administration@gmail.com"><br></td></tr>

        <tr><td><input type="submit" name="save" value="Save"></td></tr>
        <tr><td><input type="submit" name="cancel" value="Exit"></td></tr>
    </table>
</form>
</body>
</html>
