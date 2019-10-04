<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Administrator Page</title>
<style>
body {
   	text-align:center;
	background-image: url("AdminScreen.jpg");
   	background-repeat:no-repeat;
    background-size:cover;
}
h1{color: #0067a4;l}
form{
align: middle;
}
input[type=submit]{
background-color: #0067a4;
color: white;
align: middle;
border: none;
padding: 16px 32px;
text-decoration: none;
margin: 4px 2px;
cursor: pointer;
}
</style>
</head>
<body>
<br>
<br>
<br>
<br><br><br><br><br>
<h1>Administrator Page</h1>
<form action="addEmployeeScreen" method="post">
<input type="submit"  value="Add Employee" >
</form>
<form action="DisplayEmployee" method="post">
<input type="submit" value="Display Employee" >
</form>
</body>
</html>