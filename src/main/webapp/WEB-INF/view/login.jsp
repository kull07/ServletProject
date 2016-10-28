<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form entrance in system</title>
</head>
<body>
<h1 align="center">Entrance system</h1>
<form action="LoginController" method="post" align="center">
    <div>
    <img src="images/entranceimage.jpg">
    </div>
    User name:<input type="text" name="userName" placeholder="Enter you user name" size ="10"><br>
    Password:<input type="password" name="password" placeholder="Enter you password" size="10"><br>
    <table align="center">
        <tr><td><input type="submit" name="login" value = "Entrance" class="button"></td></tr>
        <tr><td><input type="submit" name="registration" value="Registration" class="button"></td></tr>
    </table>
</form>
</body>
</html>