package com.cap.ems.model;



public class Leave {
private int leave_Id, emp_ID; 
long leave_balance, noOfDaysApplied ;
private String status, date_from, date_to;

public int getLeave_Id() {
	return leave_Id;
}
public void setLeave_Id(int leave_Id) {
	this.leave_Id = leave_Id;
}


public int getEmp_ID() {
	return emp_ID;
}
public void setEmp_ID(int emp_ID) {
	this.emp_ID = emp_ID;
}

public long getLeave_balance() {
	return leave_balance;
}
public void setLeave_balance(long leave_balance) {
	this.leave_balance = leave_balance;
}
public long getNoOfDaysApplied() {
	return noOfDaysApplied;
}
public void setNoOfDaysApplied(long noOfDaysApplied) {
	this.noOfDaysApplied = noOfDaysApplied;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
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
public Leave(int emp_ID, long leave_balance, long noofdays_applied, String status, String date_from,
		String date_to) {
	super();
	this.emp_ID = emp_ID;
	this.leave_balance = leave_balance;
	this.noOfDaysApplied = noofdays_applied;
	this.status = status;
	this.date_from = date_from;
	this.date_to = date_to;
}
public Leave(int leave_Id, int emp_ID, long leave_balance, long noofdays_applied, String date_from, String date_to,
		String status) {
	super();
	this.leave_Id = leave_Id;
	this.emp_ID = emp_ID;
	this.leave_balance = leave_balance;
	this.noOfDaysApplied = noofdays_applied;
	this.date_from = date_from;
	this.date_to = date_to;
	this.status = status;
}
@Override
public String toString() {
	return "Leave [leave_Id=" + leave_Id + ", emp_ID=" + emp_ID + ", leave_balance=" + leave_balance
			+ ", noofdays_applied=" + noOfDaysApplied + ", date_from=" + date_from + ", date_to=" + date_to
			+ ", status=" + status + "]";

}
public Leave() {
}
}
