<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style=" background-color: pink">
<center>
<table>
<h1>Login</h1>
<form action="AuthCTL" method="post">
<tr>
<th>LoginId</th>
<td><input type="email" name="email"></td><br>
</tr>


<tr>
<th>Password</th>
<td><input type="password" name="pwd"></td><br>
</tr>

<tr>
<th></th>
<td><input type="submit" value="Login"></td>
</tr>
</form>
</table>
</center>
</body>
</html>