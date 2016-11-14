<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Select action</title>
    <link href="css/log_reg.css" rel="stylesheet" type="text/css" >
</head>
    <body>
    <div id="wrapper">
    <form action="SelectionController" method="post">
        <br>
        <h1>Welcome to system for polls</h1>
        <img src="images/YourChoice.png">
        <br>
        <input type="submit" name="oneEntrance" value="One-time entrance">
        <input type="submit" name="alreadyRegistered" value="Go to a Login">
        <input type="submit" name="readyToRegister" value="Go to registration">
    </form>
    </div>
    </body>
</html>