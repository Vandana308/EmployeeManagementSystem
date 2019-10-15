<%@page import="com.cap.ems.model.*"%>
<%@page import="javax.websocket.SendResult"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<style>
input[value=Logout] {
	position: fixed;
	right: 10px;
	top: 30px;
	background-color: #0067a4;
	color: white;
	align: middle;
	border: none;
	padding: 16px 32px;
	text-decoration: none;
	margin: 4px 2px;
	cursor: pointer;
}

input[value=ForManagers] {
	position: fixed;
	right: 10px;
	top: 175px;
	background-color: #0067a4;
	color: white;
	align: middle;
	border: none;
	padding: 16px 32px;
	text-decoration: none;
	margin: 4px 2px;
	cursor: pointer;
}

input[value=LeaveManagementSystem] {
	position: fixed;
	right: 10px;
	top: 100px;
	background-color: #0067a4;
	color: white;
	align: middle;
	border: none;
	padding: 16px 32px;
	text-decoration: none;
	margin: 4px 2px;
	cursor: pointer;
}

input[value=Submit] {
	position: fixed;
	right: 10px;
	top: 250px;
	background-color: #0067a4;
	color: white;
	align: middle;
	border: none;
	padding: 8px 16px;
	text-decoration: none;
	margin: 4px 2px;
	cursor: pointer;
}

button {
	margin-top: 150px;
	;
}

header {
	background-color: #333399;
	padding: 1px;
	text-align: center;
	font-size: 40px;
	color: white;
	text-align: center;
}

table, th, td {
	border: 1px solid black;
	padding: 5px;
}

table {
	border-spacing: 10px;
}

th {
	text-align: left;
}

.search-box {
	position: fixed;
	top: 250px;
	right: 10px;
	height: 40px;
	border-radius: 40px;
	padding: 10px;
	box-sizing: border-box;
}

.search-box {
	width: 400px;
}

.search-txt {
	width: 400px;
}
</style>

</head>
<body background="EMOS1.jpg">
	<p style="text-align: center; font-family: sans-serif;">
		<font size="6" color="black">


			<hr>
		</font>
	</p>

	<%
		response.setHeader("Pragma", "no-cache");
		Employee empDetail = (Employee) session.getAttribute("ManagerObj");

	%>
	<header>
		<strong> Welcome to Manager : <%=empDetail.getEmpFirstName()%>
		</strong>
	</header>
	<table style="width: 10%" align="left">
		<caption>
			<br>
			<br>
			<br>
			<br>
			<br> <b>USER DETAILS</b>
		</caption>

		<tr>
			<th bgcolor="#00CCFF">EMPlOYEE NAME</th>
			<td bgcolor="#0099FF"><%=empDetail.getEmpFirstName()%></td>
			<td bgcolor="#0099FF"><%=empDetail.getEmpLastName()%></td>
		</tr>
		<tr>
			<th bgcolor="#00CCFF">EMPLOYEE ID</th>
			<td bgcolor="#0099FF
"><%=empDetail.getEmpID()%></td>
		</tr>
		<tr>
			<th bgcolor="#00CCFF">JOINING DATE</th>
			<td bgcolor="#0099FF
"><%=empDetail.getEmpDateofJoining()%></td>
		</tr>

		<tr>
			<th bgcolor="#00CCFF">EMPLOYEE DESIGNATION</th>
			<td bgcolor="#0099FF
"><%=empDetail.getEmpDesignation()%></td>
		</tr>
		<tr>
			<th bgcolor="#00CCFF">DEPARTMENT ID</th>
			<td bgcolor="#0099FF
"><%=empDetail.getEmpDeptID()%></td>
		</tr>
		<tr>
			<th bgcolor="#00CCFF">EMPLOYEE GRADE</th>
			<td bgcolor="#0099FF
"><%=empDetail.getEmpGrade()%></td>
		</tr>
		<tr>
			<th bgcolor="#00CCFF">MANAGER ID</th>
			<td bgcolor="#0099FF
"><%=empDetail.getMgrID()%></td>
		</tr>



		</span>
		<div class="search-box">
			<form action="empdetails" method="post">
				Employee Details: <input type="text" name="Emp_ID"
					placeholder="Search an employee"><br> <input
					type="submit" value="Submit">
			</form>
			<!-- <input class ="search-txt" type="text" name="" placeholder="Search an employee" align="right">
	<a class="search-btn" href="#"> -->

			</a> <br>
		</div>
		<form action="LMS_Employee.jsp" method="get">
			<input type="submit" value="LeaveManagementSystem">
		</form>
		<form action="LeaveController" method="get">
			<input type="submit" value="ForManagers" placeholder="For Managers">
		</form>
		<form action="LogoutController" method="get">
			<input type="submit" value="Logout">
		</form>
</body>
</html>