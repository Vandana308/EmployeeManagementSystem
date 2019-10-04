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
      
     
  </style>
  
<meta charset="ISO-8859-1">
<title>Add Employee Form:</title>
</head>
<body>
<h1>
 <br>
   <br>
     <br>
       <br>
         <br>Add Employee Form</h1>
 <form action=>
 <br>
  <br>
   <br>
    <br>
     <br>
      <br>
       <br>    
  Employee_ID <input type="text" name="Emp_ID"><br>
 <br>
First name <input type="text" name="Emp_First_Name">  Last name<input type="text" name="Emp_Last_Name"><br>
<br>
DOB  <input type="date" name="Emp_Date_of_Birth" ><br>
<br>
Joining Date<input type="date" name="Emp_Date_of_Joining"><br>
<br>
Department_ID<input type="text" name="Emp_Dept_ID"><br>
<br>
Grade<input type="text" name="Emp_Grade"><br>
<br>
Designation<input type="text" name="Emp_Designation"><br>
<br>
Income<input type="text" name="Emp_Basic"><br>
<br>
Gender:
Male<input type="radio" name="Emp_Gender" >
Female<input type="radio" name="Emp_Gender" ><br>
<br>
Marital Status:<br>
<br>
<input type="radio" name= "a">Single<br>
<input type="radio" name="a" >Married<br>
<input type="radio" name= "a" >Divorced<br>
<input type="radio" name="a" >Separated<br>
<input type="radio" name="a">Widowed<br>
<br>
Address<input type="text" name="Emp_Home_Address"><br>
<br>
Contact Number<input type="text" name="Emp_Contact_Num"><br>
<br>
Manager key ID<input type="text" name="Mgr_Id"><br>


 <br>
 <br>
 <br>
 <input type="submit" value="next">
 <br>
 
 </form>

</body>
</html>