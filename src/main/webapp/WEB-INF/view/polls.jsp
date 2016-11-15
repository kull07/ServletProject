<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Page of polls</title>
    <link href="css\log_reg.css" rel="stylesheet" type="text/css" >
</head>
<body>
<div id="wrapper">
<form action="PollsController" method="post">

    <h1>Please entrance your value</h1>
    <input type="number" min="1" max="100" name="choose" class="inputTextForm" placeholder="Value 1-100">
    <input type="submit" name="enterValue" value="OK!">
    <br>
    <h1>or</h1>
    <input type="submit" name="result" value="Show results">
    <input type="submit" name="returnStart" value="Back to Start Page">

</form>
</div>
</body>
</html>