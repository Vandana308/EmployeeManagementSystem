<%@page import="com.cap.ems.model.Leave"%>
<%@page import="java.util.List"%>
<%@page import="javax.websocket.SendResult"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
input[type=submit] {
	background-color: #0067a4;
	color: white;
	align: middle;
	border: none;
	padding: 16px 32px;
	text-decoration: none;
	margin: 4px 2px;
	cursor: pointer;
}

input[value=Logout] {
	position: fixed;
	right: 10px;
	top: 5px;
	background-color: #0067a4;
	color: white;
	align: middle;
	border: none;
	padding: 16px 32px;
	text-decoration: none;
	margin: 4px 2px;
	cursor: pointer;
}

header {
	background-color: #333399;
	padding: 1mm;
	text-align: center;
	font-size: 40px;
	color: white;
	text-align: center;
}

table {
	font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

td, th {
	border: 1px solid #dddddd;
	text-align: left;
	padding: 8px;
}

tr:nth-child(even) {
	background-color: #dddddd;
}
</style>
<meta charset="ISO-8859-1">
<title>Manage Leaves</title>
</head>
<body>
<header>
		<h2>
			<strong>MANAGE LEAVES</strong>
		</h2>
	</header>
	<table>
	<tr bgcolor="#3366ff">
			<th>Leave ID</th>
			<th>Employee ID</th>
			<th>Date From</th>
			<th>Date To</th>
			<th>Status</th>			
		</tr>
	<br>
	<%
	List<Leave> leaveList = (List<Leave>) request.getAttribute("leaveDetailsList");

			for (Leave lv : leaveList) {

				out.print("<tr><td>" + lv.getLeave_Id() + "</td>");
				out.print("<td>" + lv.getEmployeeId() + "</td>");
				out.print("<td>" + lv.getDate_from() + "</td>");
				out.print("<td>" + lv.getDate_to() + "</td>");
				out.print("<td>" + lv.getStatus() + "</td></tr>");

			}
		%>
	
	<form action="ApproveLeaveController" method="post">
		<input type="submit" value="Approve">
	</form>
		<br>
	<form action="RejectLeaveController" method="post">
		<input type="submit" value="Reject">
	</form>
	<br>

	</table>
</body>
</html>