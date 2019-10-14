package com.cap.ems.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cap.ems.model.Employee;



public class LoginDao {
	String url = "jdbc:mysql://localhost:3306/miniprojectems"; //:3306
	String uname = "root";
	String password = "India@12345";
	boolean status=false;
             
	public boolean check(String username, String userpassword) throws Exception 
	{
	
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(url,uname,password);
	   // String query = "select * from User_Master where UserName = ? and UserPassword =?";
	    PreparedStatement st = con.prepareStatement("select * from User_Master where UserName = ? and UserPassword =? ");
	    st.setString(1, username);
	    st.setString(2, userpassword);
	   
	    
	    ResultSet rs = st.executeQuery();
	  
	    if(rs.next())
	    {
	    	status= true;
	    }
	    else		
	    	status= false;
	    return status;
	}
	
	public Employee getEmpDetailById(String empId) throws SQLException {
		String fetchQuery = "select * from employee where Emp_ID=(select UserId from User_Master where UserName =?)";
		Connection con = DriverManager.getConnection(url,uname,password);
		PreparedStatement pst = con.prepareStatement(fetchQuery);
		pst.setString(1, empId);
		
		ResultSet rs = pst.executeQuery();
		rs.next();
		Employee emp = new Employee();
		emp.setEmp_ID(rs.getString("Emp_ID"));
		emp.setEmp_First_Name(rs.getString("Emp_First_Name"));
		emp.setEmp_Last_Name(rs.getString("Emp_last_Name"));
		emp.setMgrId(rs.getString("Mgr_Id"));
		emp.setEmp_Date_of_Joining(rs.getString("Emp_Date_of_Joining"));
		emp.setEmp_Designation(rs.getString("Emp_Designation"));
		emp.setEmp_Dept_ID(rs.getInt("Emp_Dept_ID"));
		emp.setEmp_Grade(rs.getString("Emp_Grade"));
		
		
		
		return emp;
	}

}

