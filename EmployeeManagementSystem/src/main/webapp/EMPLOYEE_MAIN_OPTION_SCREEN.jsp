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
<b>WELCOME USER</b>
<hr>
</font>
</p>
<br>
<br>
<br>
<br>
<br>

<table style="width:10%  " align="left">
	<caption><b>USER DETAILS</b></caption>
	
<tr>
<th bgcolor="#00CCFF">EMP ID </th>
<td bgcolor="#0099FF">             </td>
</tr>
<tr>
<th bgcolor="#00CCFF">USER ID </th>
<td bgcolor="#0099FF
">             </td>
</tr>
<tr>
<th bgcolor="#00CCFF">HIRE DATE </th>
<td bgcolor="#0099FF
"></td>
</tr>

<tr>
<th bgcolor="#00CCFF">DESIGNATION</th>
<td bgcolor="#0099FF
"></td>
</tr>
<tr>
<th bgcolor="#00CCFF">SUPERVISOR </th>
<td bgcolor="#0099FF
"></td>
</tr>
<tr>
<th bgcolor="#00CCFF">LOCATION</th>
<td bgcolor="#0099FF
"></td>
</tr>
<tr>
<th bgcolor="#00CCFF">EMAIL ID</th>
<td bgcolor="#0099FF
"></td>
</tr>

</span>
<div class="search-box" >
	<input class ="search-txt" type="text" name="" placeholder="Search an employee" align="right">
	<a class="search-btn" href="#">
		
	</a>
	<br>
	
</div>
<form action="/action_page.php" method="get">
	<span style="float: right " >
		<button type="submit" ><b>LEAVE MANAGEMENT SYSTEM 
		</b></button>
		

</body>
</html>