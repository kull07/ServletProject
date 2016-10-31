<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form entrance in system</title>
    <style>
        #user,#password {
            width: 130px;
        }
    </style>
</head>
<body>
<h1 align="center">Entrance system</h1>
<form action="LoginController" method="post" align="center">
    <div>
    <img src="images/entranceimage.jpg">
    </div>
    User name:<input type="text" name="userName" id="user" placeholder="Enter you user name"><br>
    Password:<input type="password" name="password" id="password" placeholder="Enter you password"><br>
    <table align="center">
        <tr><td><input type="submit" name="login" value = "Entrance" class="button"></td></tr>
        <tr><td><input type="submit" name="registration" value="Registration" class="button"></td></tr>
    </table>
</form>
</body>
</html>