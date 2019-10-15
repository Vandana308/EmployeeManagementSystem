<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Form</title>

</head>
<body>
	<style>
	input[value=Logout]{
position:fixed;
right:10px;
top:30px;
background-color: #0067a4;
color: white;
align: middle;
border: none;
padding: 16px 32px;
text-decoration: none;
margin: 4px 2px;
cursor: pointer;}
h1 {
	background-color: #666;
	padding: 30px;
	font-size: 35px;
	color: white;
	margin-bottom: 50px;
	margin-top: 10px;
	font-size: 45px;
	background: rgba(0, 0, 0, 0.5);
	font-family: "Courier New", Courier, Monospace;
	color:;
	letter-spacing: 1px;
	text-align: centre;
}

body {
	margin: 0;
	padding: 0;
}

.show-btn {
	margin-top: 20px;
	margin-bottom: 70px;
	font-size: 20px;
	height: 50px;
	width: 400px;
	background: #0067a4;
	border: none;
	color: #000;
	border-radius: 25px;
}

.show-btn:hover {
	background: #ffc107;
	cursor: pointer;
}

.style {gradient (rgba(0,0,0,0.5),rgba(0,0,0,0.5));
	
}

.header {
	height: 100vh;
	background-image: linear- gradient(rgba(0, 0, 0, 0.5),
		rgba(0, 0, 0, 0.5));
	background-image: url("dd.jpg");
	background-size: cover;
	background-position: Left;
	display: flex;
	justify-content: center;
	align-item: center;
	font-family: sans-serif;
}

.search-field {
	height: 30px;
	padding: 10px;
	margin-top: 25px;
	border: none;
	border-radius: 25px;
	outline: none;
}

.ID {
	width: 400px;
}

.add-btn {
	height: 50px;
	width: 400px;
	background: #0067a4;
	font-size: 20px;
	border: none;
	color: #000;
	border-radius: 25px;
}

.add-btn:hover {
	background: #ffc107;
	cursor: pointer;
}

.form-box {
	background: rgba(0, 0, 0, 0.5);
	padding: 30px;
	margin-left: 90px;
	height: 430px;
	widht: 200px;
}

.modify-btn {
	margin-left: 270px;
	margin-top: 20px;
	margin-bottom: 50px;
	font-size: 20px;
	height: 50px;
	height: 50px;
	width: 150px;
	background: #0067a4;
	border: none;
	color: #000;
	border-radius: 25px;
	align-item: center;
}

.modify-btn:hover {
	background: #ffc107;
	cursor: pointer;
}
</style>
	<div class="header">

		<form action="ShowAllEmpDetails" method="post">

			<div class="form">
				<h1>Admin Home Page</h1>
			</div>
			<div>
				<section>

				</section>
			</div>

			<article>
				<div class="form-box">
					
					<button class="show-btn" type="Show All">Show All Employee</button>
					<br>
					<br> </form> <a href="AddEmployeeScreen.jsp">
						<button class="add-btn" type="button">Add</button>
						<br>
					<br>
					<br>
					<br>
					</a> <form action="GetEmployeeDetailsServlet" method="post">
						 <input type="text" class="search-field employee ID" placeholder="Enter Employee ID" name="EmployeeID" required><br>
						<button class="modify-btn" type="submit">Modify</button>
					</form>


				</div>
			</article>


		
		<form action="LogoutController" method="get">
						<input type="submit" value="Logout">
					</form>
</body>
</html>
