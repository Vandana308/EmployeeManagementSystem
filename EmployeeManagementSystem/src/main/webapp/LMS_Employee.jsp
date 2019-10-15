<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Leave Management System</title>
<link rel="stylesheet" href="bb.css">
</head>
<body>

	<style>
h1 {
	background-color: #666;
	padding: 30px;
	background: rgba(0, 0, 0, 0.5);
	text-align: center;
	font-size: 35px;
	color: white;
}
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

nav {
	float: left;
	background: rgba(0, 0, 0, 0.5);
	width: 30%;
	height: 450px; /* only for demonstration, should be removed */
	padding: 20px;
}


/* Style the list inside the menu */
nav ul {
	list-style-type: none;
	font-size: 20px;

	
	padding: 0;
}

body {
	margin: 0;
	font-size: 20px;
	padding: 0;
	color: white;
}

input[type=text] {
	width: 100%;
	padding: 12px 20px;
	margin: 10px 0;
	box-sizing: border-box;
	border: 2px solid blue;
	border-radius: 4px;
}

input[type=date] {
	width: 40%;
	padding: 12px 20px;
	margin: 10px 0;
	box-sizing: border-box;
	border: 2px solid blue;
	border-radius: 4px;
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

h1 {
	margin-bottom: 50px;
	margin-top: 10px;
	font-size: 45px;
	background: rgba(0, 0, 0, 0.5);
	font-family: "Courier New", Courier, Monospace;
	color:;
	letter-spacing: 1px;
	text-align: centre;
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

.form-box {
	background: rgba(0, 0, 0, 0.5);
	padding: 30px;
	margin-left: 390px;
	height: 430px;
	text-align: inline;
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

		<form action="ApplyLeaveController" method="post">

			<div class="form">
				<h1>Leave Management System</h1>
			</div>
			<div>
				<section>
					<nav>
						<ul>
							<br> 
							<%String userid = session.getAttribute("userId").toString(); %>
							Employee Id:
							<input  name="emp_Id" value="<%=userid%>" readonly><br>
					
							<br>
							<br> 
							<br>
							<br> 
						</ul>
					</nav>


				</section>
			</div>

			<article>
				<div class="form-box">
					<br> From: <input type="date" name="date_from" required><br>
					To: <input type="date" name="date_to" required><br> <br> <br>
			
					<button class="modify-btn" type="submit">Apply Leave</button>

					<script> 
        function submission_alert() {
        
        		alert("Leave has been successfully applied");
        }
        </script> 

				</div>
			</article>


		</form>
		<form action="LogoutController" method="get">
<input type="submit" value="Logout">
</form>
	</div>	
</body>
</html>