package com.cap.ems.model;

public class Leave {
private int Leave_Id, Emp_ID, leave_balance, noofdays_applied;
private String date_from, date_to, status;
public Leave(int leave_Id, int emp_ID, int leave_balance, int noofdays_applied, String date_from, String date_to,
		String status) {
	super();
	this.Leave_Id = leave_Id;
	this.Emp_ID = emp_ID;
	this.leave_balance = leave_balance;
	this.noofdays_applied = noofdays_applied;
	this.date_from = date_from;
	this.date_to = date_to;
	this.status = status;
}
public int getLeave_Id() {
	return Leave_Id;
}
public void setLeave_Id(int leave_Id) {
	Leave_Id = leave_Id;
}
public int getEmp_ID() {
	return Emp_ID;
}
public void setEmp_ID(int emp_ID) {
	Emp_ID = emp_ID;
}
public int getLeave_balance() {
	return leave_balance;
}
public void setLeave_balance(int leave_balance) {
	this.leave_balance = leave_balance;
}
public int getNoofdays_applied() {
	return noofdays_applied;
}
public void setNoofdays_applied(int noofdays_applied) {
	this.noofdays_applied = noofdays_applied;
}
public String getDate_from() {
	return date_from;
}
public void setDate_from(String date_from) {
	this.date_from = date_from;
}
public String getDate_to() {
	return date_to;
}
public void setDate_to(String date_to) {
	this.date_to = date_to;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
@Override
public String toString() {
	return "Leave [Leave_Id=" + Leave_Id + ", Emp_ID=" + Emp_ID + ", leave_balance=" + leave_balance
			+ ", noofdays_applied=" + noofdays_applied + ", date_from=" + date_from + ", date_to=" + date_to
			+ ", status=" + status + "]";
}
public Leave() {
	
}
}
