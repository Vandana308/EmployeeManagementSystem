<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>No Leaves</title>
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
body {
   	text-align:center;
	background-image: url("AdminScreen.jpg");
   	background-repeat:no-repeat;
    background-size:cover;
}
h1{color: #0067a4;l}

</style>
</head>
<body>
<br><br><br><br><br><br><br>
<h1>No Leaves to update</h1>
<form action="LogoutController" method="get">
<input type="submit" value="Logout">
</form>
</body>
</html>