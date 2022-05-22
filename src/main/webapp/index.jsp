<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "LOGIN!" %>
</h1>
<br/>
<form action="/TTH" method="post">
<input type="text" name="user" placeholder="Enter in user"> <br>
<br>
<input type="text" name="pass" placeholder="Enter in pass"> <br>
<br>
<button>Login</button>
</form>
</body>
</html>