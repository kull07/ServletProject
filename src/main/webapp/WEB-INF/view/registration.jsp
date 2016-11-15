<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form registration</title>
    <link rel="stylesheet" type="text/css" href="css/log_reg.css">
</head>
<body>
<div id="wrapper">
<h1>Registration new User in system:</h1>
<form action="RegistrationController" method="post" >
    <table>

        <tr><td>User:</td><td><input type="text" name="userName" class="inputTextForm" placeholder="Your login for entrance"><br></td></tr>
        <tr><td>Password:</td><td> <input type="password" name="password" class="inputTextForm" placeholder="Minimal six quantity symbol"><br></td></tr>
        <tr><td>E-mail:</td><td> <input type="text" name="email" class="inputTextForm" placeholder="Example: administration@gmail.com"><br></td></tr>

        <tr><td><input type="submit" name="save" value="Save"></td>
            <td><input type="submit" name="cancel" value="Exit to Login"></td></tr>
        <th><input type="submit" name="startPage" value="Back to Start Page"></th>

    </table>
</form>
    </div>
</body>
</html>
