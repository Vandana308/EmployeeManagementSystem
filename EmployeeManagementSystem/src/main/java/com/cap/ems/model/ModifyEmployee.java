package com.cap.ems.model;

public class ModifyEmployee {
	private int  Emp_ID, Emp_Basic, Emp_Contact_Num, Mgr_Id, Emp_Dept_ID;
	private String Emp_Grade, Emp_Designation, Emp_Marital_Status, Emp_Home_Address;
	
//	public ModifyEmployee(int Emp_Dept_ID, String Emp_Grade, String Emp_Designation, int Emp_Basic, String Emp_Marital_Status,String Emp_Home_Address,
//            int Emp_Contact_Num, int Mgr_Id) {
//		
//		}
	

	public ModifyEmployee(int emp_ID, int emp_Dept_ID, String emp_Grade, String emp_Designation, int emp_Basic,
			String emp_Marital_Status, String emp_Home_Address, int emp_Contact_Num, int mgr_Id) {
		Emp_ID = emp_ID;
	    Emp_Basic = emp_Basic;
	    Emp_Contact_Num = emp_Contact_Num;
	    Mgr_Id = mgr_Id;
	    Emp_Dept_ID = emp_Dept_ID;
		Emp_Grade = emp_Grade;
		Emp_Designation = emp_Designation;
		Emp_Marital_Status = emp_Marital_Status;
		Emp_Home_Address = emp_Home_Address;
		
	}
    public int getEmp_ID() {
    	return Emp_ID;
    }

	public int getEmp_Basic() {
		return Emp_Basic;
	}
	public void setEmp_Basic(int emp_Basic) {
		Emp_Basic = emp_Basic;
	}
	public int getEmp_Contact_Num() {
		return Emp_Contact_Num;
	}
	public void setEmp_Contact_Num(int emp_Contact_Num) {
		Emp_Contact_Num = emp_Contact_Num;
	}
	public int getMgr_Id() {
		return Mgr_Id;
	}
	public void setMgr_Id(int mgr_Id) {
		Mgr_Id = mgr_Id;
	}
	public int getEmp_Dept_ID() {
		return Emp_Dept_ID;
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
		return "ModifyEmployee [Emp_ID=" + Emp_ID + ", Emp_Basic=" + Emp_Basic + ", Emp_Contact_Num=" + Emp_Contact_Num + ", Mgr_Id=" + Mgr_Id
				+ ", Emp_Dept_ID=" + Emp_Dept_ID + ", Emp_Grade=" + Emp_Grade + ", Emp_Designation=" + Emp_Designation
				+ ", Emp_Marital_Status=" + Emp_Marital_Status + ", Emp_Home_Address=" + Emp_Home_Address + "]";
	}
    
	
	
	
   	
}
