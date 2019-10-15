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

				out.print("<tr><td>" + emp.getEmpID() + "</td>");
				out.print("<td>" + emp.getEmpFirstName() + "</td>");
				out.print("<td>" + emp.getEmpLastName() + "</td>");
				out.print("<td>" + emp.getEmpDateofBirth() + "</td>");
				out.print("<td>" + emp.getEmpDateofJoining() + "</td>");
				out.print("<td>" + emp.getEmpDeptID() + "</td>");
				out.print("<td>" + emp.getEmpGrade() + "</td>");
				out.print("<td>" + emp.getEmpDesignation() + "</td>");
				out.print("<td>" + emp.getEmpBasic() + "</td>");
				out.print("<td>" + emp.getEmpGender() + "</td>");
				out.print("<td>" + emp.getEmpMaritalStatus() + "</td>");
				out.print("<td>" + emp.getEmpHomeAddress() + "</td>");
				out.print("<td>" + emp.getEmpContactNum() + "</td>");
				out.print("<td>" + emp.getMgrID() + "</td></tr>");

			}
		%>
	</table>
<form action="LogoutController" method="get">
<input type="submit" value="Logout">
</form>	
</body>
</html>