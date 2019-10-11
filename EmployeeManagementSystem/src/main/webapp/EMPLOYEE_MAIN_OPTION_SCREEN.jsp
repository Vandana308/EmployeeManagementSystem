<%@page import="com.cap.ems.model.*"%>
<%@page import="javax.websocket.SendResult"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<style>
	button{
margin-top: 150px;

;
	}
table, th, td {
  border: 1px solid black;
  padding: 5px ;
}
table
{
	border-spacing: 10px;
}
th
{
	text-align: left;
}
.search-box{
	
	position: fixed;
	top:70%;
	right: 0%;
	z-index:auto;
	transform: translate(-10%,-50%);

	height: 40px;
	border-radius: 40px;
	padding: 10px; 
	box-sizing: border-box;

}
.search-box
{
	width: 400px;
}

.search-txt
{
	width: 400px;
}
</style>
  
</head>
<body background="CAP3.jpg">
	<p style="text-align: center;"font-family:sans-serif;"><font size="6" color="black">
<b>WELCOME ${UserNameObj}</b>
<hr>
</font>
</p>
<br>
<br>
<br>
<br>
<br>
<%
response.setHeader("Pragma", "no-cache"); 
Employee empDetail =(Employee)session.getAttribute("EmployeeObj");

if (session.getAttribute("UserNameObj")==null)
{
	response.sendRedirect("login.jsp");

}
%>

<table style="width:10%  " align="left">
	<caption><b>USER DETAILS</b></caption>
	
<tr>
<th bgcolor="#00CCFF">EMPlOYEE NAME </th>
<td bgcolor="#0099FF"><%=empDetail.getEmp_First_Name() %></td><td bgcolor="#0099FF"><%=empDetail.getEmp_Last_Name() %></td>
</tr>
<tr>
<th bgcolor="#00CCFF">EMPLOYEE ID </th>
<td bgcolor="#0099FF
">  <%=empDetail.getEmp_ID() %> </td>
</tr>
<tr>
<th bgcolor="#00CCFF">JOINING DATE </th>
<td bgcolor="#0099FF
"><%=empDetail.getEmp_Date_of_Joining() %></td>
</tr>

<tr>
<th bgcolor="#00CCFF">EMPLOYEE DESIGNATION</th>
<td bgcolor="#0099FF
"><%=empDetail.getEmp_Designation() %></td>
</tr>
<tr>
<th bgcolor="#00CCFF">DEPARTMENT ID </th>
<td bgcolor="#0099FF
"><%=empDetail.getEmp_Dept_ID() %></td>
</tr>
<tr>
<th bgcolor="#00CCFF">EMPLOYEE GRADE</th>
<td bgcolor="#0099FF
"><%=empDetail.getEmp_Grade() %></td>
</tr>
<tr>
<th bgcolor="#00CCFF">MANAGER ID</th>
<td bgcolor="#0099FF
"><%=empDetail.getMgr_Id() %></td>
</tr>



</span>
<div class="search-box" >
<form action ="empdetails" method ="post">
Employee Details: <input type="text" name="Emp_ID" placeholder="Search an employee"><br>
<input type = "submit" value="submit">
	<!-- <input class ="search-txt" type="text" name="" placeholder="Search an employee" align="right">
	<a class="search-btn" href="#"> -->
		
	</a>
	<br>
	
</div>
<form action="/action_page.php" method="get">
	<span style="float: right " >
		<button type="submit" ><b>LEAVE MANAGEMENT SYSTEM 
		</b></button>
		

</body>
</html>