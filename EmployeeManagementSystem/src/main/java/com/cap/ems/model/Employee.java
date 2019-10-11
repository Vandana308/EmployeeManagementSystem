package com.cap.ems.model;

public class Employee {
	private int  Emp_Basic,  Mgr_Id;
	String Emp_Dept_ID;
	private String Emp_ID,Emp_First_Name, Emp_Last_Name, Emp_Grade, Emp_Designation,  Emp_Gender,  Emp_Marital_Status,  Emp_Home_Address, Emp_Date_of_Birth, Emp_Date_of_Joining, Emp_Contact_Num;
	public Employee(String emp_ID, int emp_Basic, String emp_Contact_Num, int mgr_Id, String emp_Dept_ID, String emp_First_Name,
			String emp_Last_Name, String emp_Grade, String emp_Designation, String emp_Gender, String emp_Marital_Status,
			String emp_Home_Address, String emp_Date_of_Birth, String emp_Date_of_Joining) {
	            	
		this.Emp_ID = emp_ID;
		this.Emp_Basic = emp_Basic;
		this.Emp_Contact_Num = emp_Contact_Num;
		this.Mgr_Id = mgr_Id;
		this.Emp_Dept_ID = emp_Dept_ID;
		this.Emp_First_Name = emp_First_Name;
		this.Emp_Last_Name = emp_Last_Name;
		this.Emp_Grade = emp_Grade;
		this.Emp_Designation = emp_Designation;
		this.Emp_Gender = emp_Gender;
		this.Emp_Marital_Status = emp_Marital_Status;
		this.Emp_Home_Address = emp_Home_Address;
		this.Emp_Date_of_Birth = emp_Date_of_Birth;
		this.Emp_Date_of_Joining = emp_Date_of_Joining;
	}
	public String getEmp_ID() {
		return Emp_ID;
	}
	public void setEmp_ID(String emp_ID) {
		Emp_ID = emp_ID;
	}
	public int getEmp_Basic() {
		return Emp_Basic;
	}
	public void setEmp_Basic(int emp_Basic) {
		Emp_Basic = emp_Basic;
	}
	public String getEmp_Contact_Num() {
		return Emp_Contact_Num;
	}
	public void setEmp_Contact_Num(String emp_Contact_Num) {
		Emp_Contact_Num = emp_Contact_Num;
	}
	public int getMgr_Id() {
		return Mgr_Id;
	}
	public void setMgr_Id(int mgr_Id) {
		Mgr_Id = mgr_Id;
	}
	public String getEmp_Dept_ID() {
		return Emp_Dept_ID;
	}
	public void setEmp_Dept_ID(String emp_Dept_ID) {
		Emp_Dept_ID = emp_Dept_ID;
	}
	public String getEmp_First_Name() {
		return Emp_First_Name;
	}
	public void setEmp_First_Name(String emp_First_Name) {
		Emp_First_Name = emp_First_Name;
	}
	public String getEmp_Last_Name() {
		return Emp_Last_Name;
	}
	public void setEmp_Last_Name(String emp_Last_Name) {
		Emp_Last_Name = emp_Last_Name;
	}
	public String getEmp_Grade() {
		return Emp_Grade;
	}
	public void setEmp_Grade(String emp_Grade) {
		Emp_Grade = emp_Grade;
	}
	public String getEmp_Designation() {
		return Emp_Designation;
	}
	public void setEmp_Designation(String emp_Designation) {
		Emp_Designation = emp_Designation;
	}
	public String getEmp_Gender() {
		return Emp_Gender;
	}
	public void setEmp_Gender(String emp_Gender) {
		Emp_Gender = emp_Gender;
	}
	public String getEmp_Marital_Status() {
		return Emp_Marital_Status;
	}
	public void setEmp_Marital_Status(String emp_Marital_Status) {
		Emp_Marital_Status = emp_Marital_Status;
	}
	public String getEmp_Home_Address() {
		return Emp_Home_Address;
	}
	public void setEmp_Home_Address(String emp_Home_Address) {
		Emp_Home_Address = emp_Home_Address;
	}
	public String getEmp_Date_of_Birth() {
		return Emp_Date_of_Birth;
	}
	public void setEmp_Date_of_Birth(String emp_Date_of_Birth) {
		Emp_Date_of_Birth = emp_Date_of_Birth;
	}
	public String getEmp_Date_of_Joining() {
		return Emp_Date_of_Joining;
	}
	public void setEmp_Date_of_Joining(String emp_Date_of_Joining) {
		Emp_Date_of_Joining = emp_Date_of_Joining;
	}

	public String toString() {
		return "Employee [Emp_ID=" + Emp_ID + ", Emp_Basic=" + Emp_Basic + ", Emp_Contact_Num=" + Emp_Contact_Num
				+ ", Mgr_Id=" + Mgr_Id + ", Emp_Dept_ID=" + Emp_Dept_ID + ", Emp_First_Name=" + Emp_First_Name
				+ ", Emp_Last_Name=" + Emp_Last_Name + ", Emp_Grade=" + Emp_Grade + ", Emp_Designation=" + Emp_Designation
				+ ", Emp_Gender=" + Emp_Gender + ", Emp_Marital_Status=" + Emp_Marital_Status + ", Emp_Home_Address="
				+ Emp_Home_Address + ", Emp_Date_of_Birth=" + Emp_Date_of_Birth + ", Emp_Date_of_Joining="
				+ Emp_Date_of_Joining + "]";
	}
	public Employee() {
		}




}
