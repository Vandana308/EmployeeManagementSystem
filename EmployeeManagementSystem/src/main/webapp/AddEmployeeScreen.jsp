<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
form{
      color: #0067a4;
      align: center;
      font-weight: bold;
      margin-left: 50px;
      align-content: center;
     }
h1{
   
   color: #0067a4;
   text-align:center;
   font-size:40px;
  }
  body{
       background-image: url("AdminScreen.jpg");
       background-repeat:no-repeat;
       background-size:cover;
      }
 .container {
 width: 500px;
 clear: both;}
 
 .container input[type=text]{
 width:100%;
 clear:both;}
 .container input[type=date]{
 width:100%;
 clear:both;}
  .container input[type=submit]{
 background-color: #0067a4;
color: white;
align: middle;
border: none;
padding: 16px 32px;
text-decoration: none;
margin: 4px 2px;
cursor: pointer;}    
fieldset{
border:0;}
  </style>
  
<meta charset="ISO-8859-1">
<br>
<br>
<br>
<title>Add Employee Form:</title>
</head>
<body>
<div class="container">
<h1>
 <br>
   <br>
     <br>
       <br>
         <br>Add Employee Form</h1>
 <form action="AddEmployee" method="post">
 
  
       
Employee ID  <input type="text" name="Emp_ID"><br>
 <br>
First name   <input type="text" name="Emp_First_Name">  Last name<input type="text" name="Emp_Last_Name"><br>
<br>
DOB          <input type="date" name="Emp_Date_of_Birth" ><br>
<br>
Joining Date <input type="date" name="Emp_Date_of_Joining"><br>
<br>
Department ID<input type="text" name="Emp_Dept_ID"><br>
<br>
Grade 
<fieldset>

<p>
<label>Select Grade</label>
<select id="myList1" name="Emp_Grade">
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
<br>
Designation  <input type="text" name="Emp_Designation"><br>

Income       <input type="text" name="Emp_Basic"><br>
<br>
Gender
<fieldset>

<p>
<label>Select Gender</label>
<select id="myList2" name="Emp_Gender">
<option value="Male">Male</option>
<option value="Female">Female</option>
</select>
</p>
</fieldset>

<br>
Employee Marital Status
<fieldset>

<p>
<label>Select Marital Status</label>
<select id="myList3" name="Emp_Marital_Status">
<option value="Single">Single</option>
<option value="Married">Married</option>
<option value="Divorced">Divorced</option>
<option value="Unmarried">Unmarried</option>
<option value="Widowed">Widowed</option>
</select>
</p>
</fieldset>

Address       <input type="text" name="Emp_Home_Address"><br>
<br>
Contact Number<input type="text" name="Emp_Contact_Num"><br>
<br>
Manager key ID<input type="text" name="Mgr_Id"><br>


 <br>
 <br>
 <br>
 <input type="submit" value="Submit">
 <br>
 
 </form>
</div>
</body>
</html>