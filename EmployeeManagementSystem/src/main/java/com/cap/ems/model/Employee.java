package com.cap.ems.model;

public class Employee {
	private int  empBasic, empDeptID;
	private String mgrID, empID, empFirstName, empLastName, empGrade, empDesignation, empGender,  empMaritalStatus;
	private String empHomeAddress, empDateofBirth, empDateofJoining, empContactNum;

	public Employee(String emp_ID, int emp_Basic, String emp_Contact_Num, String mgr_Id, int emp_Dept_ID, String emp_First_Name,
			String emp_Last_Name, String emp_Grade, String emp_Designation, String emp_Gender, String emp_Marital_Status,
			String emp_Home_Address, String emp_Date_of_Birth, String emp_Date_of_Joining) {
	            	
		this.empID = emp_ID;
		this.empBasic = emp_Basic;
		this.empContactNum = emp_Contact_Num;
		this.mgrID = mgr_Id;
		this.empDeptID = emp_Dept_ID;
		this.empFirstName = emp_First_Name;
		this.empLastName = emp_Last_Name;
		this.empGrade = emp_Grade;
		this.empDesignation = emp_Designation;
		this.empGender = emp_Gender;
		this.empMaritalStatus = emp_Marital_Status;
		this.empHomeAddress = emp_Home_Address;
		this.empDateofBirth = emp_Date_of_Birth;
		this.empDateofJoining = emp_Date_of_Joining;
	}
	
	public int getEmpBasic() {
		return empBasic;
	}


	public void setEmpBasic(int empBasic) {
		this.empBasic = empBasic;
	}


	public int getEmpDeptID() {
		return empDeptID;
	}


	public void setEmpDeptID(int empDeptID) {
		this.empDeptID = empDeptID;
	}


	public String getMgrID() {
		return mgrID;
	}


	public void setMgrID(String mgrID) {
		this.mgrID = mgrID;
	}


	public String getEmpID() {
		return empID;
	}


	public void setEmpID(String empID) {
		this.empID = empID;
	}


	public String getEmpFirstName() {
		return empFirstName;
	}


	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}


	public String getEmpLastName() {
		return empLastName;
	}


	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}


	public String getEmpGrade() {
		return empGrade;
	}


	public void setEmpGrade(String empGrade) {
		this.empGrade = empGrade;
	}


	public String getEmpDesignation() {
		return empDesignation;
	}


	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}


	public String getEmpGender() {
		return empGender;
	}


	public void setEmpGender(String empGender) {
		this.empGender = empGender;
	}


	public String getEmpMaritalStatus() {
		return empMaritalStatus;
	}


	public void setEmpMaritalStatus(String empMaritalStatus) {
		this.empMaritalStatus = empMaritalStatus;
	}


	public String getEmpHomeAddress() {
		return empHomeAddress;
	}


	public void setEmpHomeAddress(String empHomeAddress) {
		this.empHomeAddress = empHomeAddress;
	}


	public String getEmpDateofBirth() {
		return empDateofBirth;
	}


	public void setEmpDateofBirth(String empDateofBirth) {
		this.empDateofBirth = empDateofBirth;
	}


	public String getEmpDateofJoining() {
		return empDateofJoining;
	}


	public void setEmpDateofJoining(String empDateofJoining) {
		this.empDateofJoining = empDateofJoining;
	}


	public String getEmpContactNum() {
		return empContactNum;
	}


	public void setEmpContactNum(String empContactNum) {
		this.empContactNum = empContactNum;
	}


	@Override
	public String toString() {
		return "Employee [Emp_ID=" + empID + ", Emp_Basic=" + empBasic + ", Emp_Contact_Num=" + empContactNum
				+ ", Mgr_Id=" + mgrID + ", Emp_Dept_ID=" + empDeptID + ", Emp_First_Name=" + empFirstName
				+ ", Emp_Last_Name=" + empLastName + ", Emp_Grade=" + empGrade + ", Emp_Designation=" +empDesignation
				+ ", Emp_Gender=" + empGender + ", Emp_Marital_Status=" + empMaritalStatus + ", Emp_Home_Address="
				+ empHomeAddress + ", Emp_Date_of_Birth=" + empDateofBirth + ", Emp_Date_of_Joining="
				+ empDateofJoining + "]";
	}
	public Employee() {
	}
}
