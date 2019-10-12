<%@page import="com.cap.ems.model.*"%>
<%@page import="java.util.List" %>
<%@page import="javax.websocket.SendResult"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
response.setHeader("Pragma", "no-cache"); 
Leave leaveDetail =(Leave)session.getAttribute("LeaveObj");
%>
Leave Id: <br>
Employee Id: <br>
Leave Balance: <br>
Number of days applied: <br>
Date from: <br>
Date to: <br>
Status:
<fieldset>
<p>
<label>Select Status</label>
<select id="myList1" name="status">
<option value="Applied">Applied</option>
<option value="Approved">Approved</option>
<option value="Rejected">Rejected</option>
</select>
</p>
</fieldset>

<br>
<%
List<Leave> leaveList = (List<Leave>)request.getAttribute("leaveList");


for(Leave lv:leaveList){
System.out.print(lv.getLeave_Id()+"<br>");
System.out.print(lv.getEmp_ID()+"<br>");
System.out.print(lv.getLeave_balance()+"<br>");
System.out.print(lv.getNoofdays_applied()+"<br>");
System.out.print(lv.getDate_from()+"<br>");
System.out.print(lv.getDate_to()+"<br>");
System.out.print(lv.getStatus()+"<br>");
}
%>
<form action="ApproveLeaveController" method="post">
Status
<fieldset>

<p>
<label>Status</label>
<select id="myList1" name="status">
<option value="applied">Applied</option>
<option value="approved">Approved</option>
<option value="rejected">Rejected</option>
</select>
</p>
</fieldset>

<input type="submit" placeholder="Submit action">
 
</form>
</body>
</html>