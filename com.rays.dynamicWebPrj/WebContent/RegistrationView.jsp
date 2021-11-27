<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head >
<meta charset="ISO-8859-1">
<title>Registration Form</title>
</head>
<body style=" background-color: pink">

<center>
<table  align="center">

<h1>Registration Form</h1>
<form action="RegistrationCTL" method="post" >
<tr>
<th align="center">Enter First Name</th>
<td><input type="text" name = "fname"><br></td>
</tr>
<tr>
<th align="center">Enter Last Name</th>
<td><input type="text" name = "lname"><br></td>
</tr>
<tr>
<th>Select Gender</th>
<td>Male<input type="radio" name="gender" value="male">Female<input type="radio" name="gender" value="female"><br></td>
</tr>


<tr>
<th>DOB</th>
<td><input type="date" name="dob" ></br></td>

<tr>
<th>Enter Parmanent Address</th>
<td><input type="text" name = "add"><br></td>

</tr>
<tr>
<th>Enter Email Address</th>
<td><input type="email" name = "email"><br></td>

</tr>

<tr>
<th>Password</th>
<td><input type="password" name = "pwd"><br></td>

</tr>

<tr>
<th><input type="submit" value="Register"><input type ="reset" value="cancel"></th>
<td></td>

</tr>

</form>
</table>
</center>
</body>
</html>



