<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>              
input[value=Logout]{
position:fixed;
right:10px;
top:5px;
background-color: #0067a4;
color: white;
align: middle;
border: none;
padding: 16px 32px;
text-decoration: none;
margin: 4px 2px;
cursor: pointer;}
</style>
<meta charset="ISO-8859-1">
<title>LogOut</title>
</head>
<body>
<form action="LogoutController" method="get">
<input type="submit" value="Logout">
</form>
</body>
</html>