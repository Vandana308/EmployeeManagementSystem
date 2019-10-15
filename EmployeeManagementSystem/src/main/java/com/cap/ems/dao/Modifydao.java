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
	public Modifydao() throws SQLException, ClassNotFoundException  {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://192.168.12.125:3306/miniprojectems","rajul","qwer1234");
	}
	
	public boolean Modifydao() throws SQLException{
		Scanner sc = new Scanner(System.in);
		String Emp_Id = sc.nextLine();
		
		String query="update Employee set Emp_Dept_ID=?, Emp_Grade=?, Emp_Designation=?, Emp_Basic=?, Emp_Marital_Status=?, Emp_Home_Address=?, Emp_Contact_Num=?, Mgr_Id=?   where Emp_Id='"+Emp_Id+"'";
		Employee emp =new Employee();
		PreparedStatement ps = con.prepareStatement(query);
		
		//ps.setInt(1, emp.getEmp_ID());
		ps.setInt(1, emp.getEmpDeptID());
		ps.setString(2, emp.getEmpGrade());
		ps.setString(3,emp.getEmpDesignation());
		ps.setInt(4,emp.getEmpBasic());
		ps.setString(5,emp.getEmpMaritalStatus());
		ps.setString(6, emp.getEmpHomeAddress());
		ps.setString(7, emp.getEmpContactNum());
		ps.setString(8, emp.getMgrID());
		int n=ps.executeUpdate();
		if(n>0) {
			return true;
		}
		return false;
		
	}
}

 