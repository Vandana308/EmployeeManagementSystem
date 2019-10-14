<%@page import="com.cap.ems.model.Employee"%>
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
form {
	color: #0067a4;
	align: center;
	font-weight: bold;
	margin-left: 50px;
	align-content: center;
}

h1 {
	color: #0067a4;
	text-align: center;
	font-size: 40px;
}

body {
	background-image: url("AdminScreen.jpg");
	background-repeat: no-repeat;
	background-size: cover;
}

.container {
	width: 500px;
	clear: both;
}

.container input[type=text] {
	width: 100%;
	clear: both;
}

.container input[type=date] {
	width: 100%;
	clear: both;
}

.container input[type=submit] {
	background-color: #0067a4;
	color: white;
	align: middle;
	border: none;
	padding: 16px 32px;
	text-decoration: none;
	margin: 4px 2px;
	cursor: pointer;
}

fieldset {
	border: 0;
}
</style>

<meta charset="ISO-8859-1">

<br>
<title align="center">Modify Details:</title>
</head>
<body>
	<div class="container">
		<h1>
			<br> <br> <br> <br> <br>Modify Employee
			Details
		</h1>
		<%
			Employee e = (Employee) request.getAttribute("emp");
		%>

		<form action="modifyEmployee" method="post">

			<br>Employee ID <input type="text" name="Emp_ID"
				value="<%=e.getEmp_ID()%>"><br> <br>Department ID<input
				type="text" name="Emp_Dept_ID" value="<%=e.getEmp_Dept_ID()%>"><br>
			<br>Grade
			<fieldset>
				<p>
					<label>Select Grade</label> <select id="myList1" name="Emp_Grade" value="<%=e.getEmp_Grade()%>">
						<option value="M1">M1</option>
						<option value="M2">M2</option>
						<option value="M3">M3</option>
						<option value="M4">M4</option>
						<option value="M5">M5</option>
						<option value="M6">M6</option>
						<option value="M7">M7</option>
					</select>
				</p>
			</fieldset>
			<br>Designation <input type="text" name="Emp_Designation"
				value="<%=e.getEmp_Designation()%>"><br> <br>Income
			<input type="text" name="Emp_Basic" value="<%=e.getEmp_Basic()%>"><br>
			<br>Marital Status: <br>
			<br> <select id="myList3" name="Emp_Marital_Status" value="<%=e.getEmp_Marital_Status()%>">
				<option value="Single">Single</option>
				<option value="Married">Married</option>
				<option value="Divorced">Divorced</option>
				<option value="Unmarried">Unmarried</option>
				<option value="Widowed">Widowed</option>
			</select>
			<br> <br> Address <input type="text" name="Emp_Home_Address" value="<%=e.getEmp_Home_Address()%>"><br>
			<br> Contact Number<input type="text" name="Emp_Contact_Num" value="<%=e.getEmp_Contact_Num()%>"><br> 
			<br> Manager key ID<input type="text" name="Mgr_Id" value="<%=e.getMgrId()%>"><br> <br> <br> <br>
			<input type="submit" value="Modify"> <br>

		</form>
	</div>
	<form action="LogoutController" method="get">
<input type="submit" value="Logout">
</form>
</body>
</html>
