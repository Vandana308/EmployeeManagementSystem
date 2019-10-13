<%@page import="com.cap.ems.model.Leave"%>
<%@page import="java.util.List" %>
<%@page import="javax.websocket.SendResult"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style >
input[type=submit]{
background-color: #0067a4;
color: white;
align: middle;
border: none;
padding: 16px 32px;
text-decoration: none;
margin: 4px 2px;
cursor: pointer;}</style>
<meta charset="ISO-8859-1">
<title>Manage Leaves</title>
</head>
<body>

Leave Id:<br>
Employee Id:<br>
Date from: <br>
Date to: <br>
Status: <br>
<form action="ApproveLeaveController" method="post">
<input type="submit"  value="Approve">
</form><br>
<form action="RejectLeaveController" method="post">
<input type="submit" value="Reject">
</form>


<br>
<%
List<Leave> leaveList = (List<Leave>)request.getAttribute("leaveDetailsList");


for(Leave lv:leaveList){
out.print("/t"+lv.getLeave_Id()+"<br>");
out.print("/t"+lv.getEmployeeId()+"<br>");
out.print("/t"+lv.getDate_from()+"<br>");
out.print("/t"+lv.getDate_to()+"<br>");
out.print("/t"+lv.getStatus()+"<br>");
}
%>
</body>
</html>