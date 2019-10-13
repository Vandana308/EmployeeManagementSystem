package com.cap.ems.model;



public class Leave {
	private int leave_Id; 
	private String status, date_from, date_to, employeeId;

	public int getLeave_Id() {
		return leave_Id;
	}
	public void setLeave_Id(int leave_Id) {
		this.leave_Id = leave_Id;
	}



	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
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
	public Leave(String emp_ID, String status, String date_from,
			String date_to) {
		super();
		this.employeeId = emp_ID;
		this.status = status;
		this.date_from = date_from;
		this.date_to = date_to;
	}
	public Leave(int leave_Id, String emp_ID, String date_from, String date_to,
			String status) {
		super();
		this.leave_Id = leave_Id;
		this.employeeId = emp_ID;
		this.date_from = date_from;
		this.date_to = date_to;
		this.status = status;
	}
	public Leave(String status) {
		this.status= status;
	}
	public Leave() {
	}
	@Override
	public String toString() {
		return "Leave [leave_Id=" + leave_Id + ", emp_ID=" + employeeId + ", status=" + status + ", date_from=" + date_from
				+ ", date_to=" + date_to + "]";
	}
}
