package com.cap.ems.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.cap.ems.model.Employee;

public class Modifydao{
	
	Connection  con;
	PreparedStatement ps;
	ResultSet rs;
	public Modifydao() throws SQLException  {
		con=DriverManager.getConnection("jdbc:mysql://localhost/miniprojectems","root","India@12345");
	}
	
	public boolean Modifydao() throws SQLException{
		Scanner sc = new Scanner(System.in);
		String Emp_Id = sc.nextLine();
		
		String query="update Employee set Emp_Dept_ID=?, Emp_Grade=?, Emp_Designation=?, Emp_Basic=?, Emp_Marital_Status=?, Emp_Home_Address=?, Emp_Contact_Num=?, Mgr_Id=?   where Emp_Id='"+Emp_Id+"'";
		Employee emp =new Employee();
		PreparedStatement ps = con.prepareStatement(query);
		
		//ps.setInt(1, emp.getEmp_ID());
		ps.setInt(1, emp.getEmp_Dept_ID());
		ps.setString(2, emp.getEmp_Grade());
		ps.setString(3,emp.getEmp_Designation());
		ps.setInt(4,emp.getEmp_Basic());
		ps.setString(5,emp.getEmp_Marital_Status());
		ps.setString(6, emp.getEmp_Home_Address());
		ps.setString(7, emp.getEmp_Contact_Num());
		ps.setInt(8, emp.getMgr_Id());
		int n=ps.executeUpdate();
		if(n>0) {
			return true;
		}
		return false;
		
	}
}

 