<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form entrance in system</title>
    <link href="css/log_reg.css" rel="stylesheet" type="text/css" >
</head>

<body>
<div id="wrapper">
<h1>Entrance system</h1>
<form action="LoginController" method="post">

    <img src="images/entranceimage.jpg" alt="Login in system">

    <table>

     <tr><td>User name:</td><td><input type="text" name="userName" placeholder="Enter you user name"><br></td></tr>
     <tr><td>Password:</td><td><input type="password" name="password" placeholder="Enter you password"><br></td></tr>

      <tr><td><input type="submit" name="login" class="buttonForm" value = "Entrance" ></td>
            <td><input type="submit" name="registration" class="buttonForm" value="Registration" ></td></tr>

    </table>

</form>
</div>
</body>
</html>