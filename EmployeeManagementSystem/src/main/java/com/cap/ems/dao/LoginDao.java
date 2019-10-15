package com.cap.ems.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cap.ems.model.Employee;



public class LoginDao {
	
	boolean status=false;
	public String userType;
	Connection con;
	
	public boolean check(String username, String userpassword) throws Exception 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://192.168.12.125:3306/miniprojectems","rajul","qwer1234");
		PreparedStatement st = con.prepareStatement("select * from User_Master where UserName = ? and UserPassword =? ");
	    st.setString(1, username);
	    st.setString(2, userpassword);    
	    ResultSet rs = st.executeQuery();
	    
	    if(rs.next())
	    {	
		    userType = rs.getString("UserType");
	    	status= true;
	    }
	    else		
	    	status= false;
	    return status;
	}
	
	public Employee getEmpDetailById(String empId) throws SQLException, ClassNotFoundException {
		String fetchQuery = "select * from employee where Emp_ID=(select UserId from User_Master where UserName =?)";
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://192.168.12.125:3306/miniprojectems","rajul","qwer1234");
		PreparedStatement pst = con.prepareStatement(fetchQuery);
		pst.setString(1, empId);
		
		ResultSet rs = pst.executeQuery();
		rs.next();
		Employee emp = new Employee();
		emp.setEmpID(rs.getString("Emp_ID"));
		emp.setEmpFirstName(rs.getString("Emp_First_Name"));
		emp.setEmpLastName(rs.getString("Emp_last_Name"));
		emp.setMgrID(rs.getString("Mgr_Id"));
		emp.setEmpDateofJoining(rs.getString("Emp_Date_of_Joining"));
		emp.setEmpDesignation(rs.getString("Emp_Designation"));
		emp.setEmpDeptID(rs.getInt("Emp_Dept_ID"));
		emp.setEmpGrade(rs.getString("Emp_Grade"));
		
		
		
		return emp;
	}

}

