package com.cap.ems.model;

public class ModifyEmployee {
	private int   Emp_Basic,  Emp_Dept_ID;
	private String Emp_Contact_Num, mgrId, Emp_ID, Emp_Grade, Emp_Designation, Emp_Marital_Status, Emp_Home_Address;
	
	public ModifyEmployee(String emp_ID, int emp_Dept_ID, String emp_Grade, String emp_Designation, int emp_Basic,
			String emp_Marital_Status, String emp_Home_Address, String emp_Contact_Num, String mgr_Id) {
		Emp_ID = emp_ID;
	    Emp_Basic = emp_Basic;
	    Emp_Contact_Num = emp_Contact_Num;
	    mgrId = mgr_Id;
	    Emp_Dept_ID = emp_Dept_ID;
		Emp_Grade = emp_Grade;
		Emp_Designation = emp_Designation;
		Emp_Marital_Status = emp_Marital_Status;
		Emp_Home_Address = emp_Home_Address;
		
	}
    public String getEmp_ID() {
    	return Emp_ID;
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
	public int getEmp_Dept_ID() {
		return Emp_Dept_ID;
	}
	public String getMgrId() {
		return mgrId;
	}
	public void setMgrId(String mgrId) {
		this.mgrId = mgrId;
	}
	public void setEmp_ID(String emp_ID) {
		Emp_ID = emp_ID;
	}
	public void setEmp_Dept_ID(int emp_Dept_ID) {
		Emp_Dept_ID = emp_Dept_ID;
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
	@Override
	public String toString() {
		return "ModifyEmployee [Emp_ID=" + Emp_ID + ", Emp_Basic=" + Emp_Basic + ", Emp_Contact_Num=" + Emp_Contact_Num + ", Mgr_Id=" + mgrId
				+ ", Emp_Dept_ID=" + Emp_Dept_ID + ", Emp_Grade=" + Emp_Grade + ", Emp_Designation=" + Emp_Designation
				+ ", Emp_Marital_Status=" + Emp_Marital_Status + ", Emp_Home_Address=" + Emp_Home_Address + "]";
	}
    
	
	
	
   	
}
