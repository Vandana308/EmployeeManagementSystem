<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Form</title>
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
	padding: 0;
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
	background-image: url("AdminScreen.jpg");
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
	margin-left: 390px;
	height: 430px;
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
					<nav>
						<ul>
							<li><a href="#"></a></li>
							<li><a href="#"></a></li>
							<li><a href="#"></a></li>
						</ul>
					</nav>


				</section>
			</div>

			<article>
				<div class="form-box">
		
						<button class="show-btn" type="Show All">Show All
							Employee</button>
						<br>
			
					<form action="AddEmployee" method="post">
						<br> <a href="AddEmployeeScreen.jsp">
							<button class="add-btn" type="button">Add</button> <br> <br>
					</form>
					<br> <br>
					<form action="ModifyEmployee" method="post">
						</a> <input type="text" class="search-field employee ID"
							placeholder="Employee Name"><br>

						<button class="modify-btn" type="button">Modify</button>
					</form>


				</div>
			</article>

	</form>

</body>
</html>
