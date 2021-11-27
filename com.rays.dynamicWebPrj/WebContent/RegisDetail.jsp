<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style=" background-color: pink">
<%
String fname = request.getParameter("fname");
String lname = request.getParameter("lname");
String dob = request.getParameter("dob");
String mobile = request.getParameter("mb");
String pAdd = request.getParameter("padd");
String email = request.getParameter("email");
%>

<h3>First name is:<%= fname  %><br>Last name is:<%= lname  %><br>DateOfBirth is:<%= dob  %><br>Mobile Number is:<%= mobile  %><br>Parmanent Address is:<%= pAdd  %><br>Email Address Is is:<%= email  %></h3>
</body>
</html>