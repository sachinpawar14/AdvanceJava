<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<h1 style="font: italic;"> Login Form</h1>
<hr>
<form action="login.jsp" method="post" name="loginForm">
<table border="1">
<tr>
<td>Enter FirstName: </td>
<td><input type="text" name="txtUsername"></td>
</tr>
<tr>
<td>Enter LastName: </td>
<td><input type="password" name="txtPassword"></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="LOGIN"></td>
</tr>
</table>
</form>
</body>
</html>