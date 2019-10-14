<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 
<!DOCTYPE html>
<html>
        
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
input[value=Logout]{
position:fixed;
right:10px;
top:35px;
background-color: #0067a4;
color: white;
align: middle;
border: none;
padding: 16px 32px;
text-decoration: none;
margin: 4px 2px;
cursor: pointer;}
table {
  font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

table td, table th {
  border: 1px solid #ddd;
  padding: 8px;
}

table tr:nth-child(even){background-color: #f2f2f2;}

table tr:hover {background-color: #ddd;}

table th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: #4CAF50;
  color: white;
}
</style><h1>Employee Details</h1>
</head>
<body><br>
<table>
<tr>
<th>Employee Id</th>
<th>First Name</th>
<th>Last Name</th>
<th>Department Id</th>
<th>Designation</th>
<th>Contact Number</th>
</tr>
<tr>
<td>${a}</td>
<td>${b}</td>
<td>${c}</td>
<td>${d}</td>
<td>${e}</td>
<td>${f}</td>

</tr>


</table>
<form action="LogoutController" method="get">
<input type="submit" value="Logout">
</form>
</body>
</html>