<%@page import="com.cap.ems.model.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Employee Details</title>

<style type="text/css">
header {
	background-color: #333399;
	padding: 1mm;
	text-align : center;
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
</head>
<body>
	<header>
		<h2>
			<strong>ALL EMPLOYEE DETAILS</strong>
		</h2>
	</header>
	<table>
		<br>
		<tr bgcolor="#3366ff">
			<th>Emp ID</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>DOB</th>
			<th>Joining Date</th>
			<th>Department</th>
			<th>Grade</th>
			<th>Designation</th>
			<th>Salary</th>
			<th>Gender</th>
			<th>Martial Status</th>
			<th>Address</th>
			<th>Contact</th>
			<th>Manager ID</th>
		</tr>
		<%
			List<Employee> empList = (List<Employee>) request.getAttribute("empDetailsList");

			for (Employee emp : empList) {

				out.print("<tr><td>" + emp.getEmp_ID() + "</td>");
				out.print("<td>" + emp.getEmp_First_Name() + "</td>");
				out.print("<td>" + emp.getEmp_Last_Name() + "</td>");
				out.print("<td>" + emp.getEmp_Date_of_Birth() + "</td>");
				out.print("<td>" + emp.getEmp_Date_of_Joining() + "</td>");
				out.print("<td>" + emp.getEmp_Dept_ID() + "</td>");
				out.print("<td>" + emp.getEmp_Grade() + "</td>");
				out.print("<td>" + emp.getEmp_Designation() + "</td>");
				out.print("<td>" + emp.getEmp_Basic() + "</td>");
				out.print("<td>" + emp.getEmp_Gender() + "</td>");
				out.print("<td>" + emp.getEmp_Marital_Status() + "</td>");
				out.print("<td>" + emp.getEmp_Home_Address() + "</td>");
				out.print("<td>" + emp.getEmp_Contact_Num() + "</td>");
				out.print("<td>" + emp.getMgr_Id() + "</td></tr>");

			}
		%>
	</table>
</body>
</html>