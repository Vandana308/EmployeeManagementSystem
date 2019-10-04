package com.cap.ems.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cap.ems.model.Employee;

public class EmployeeDao {
	Connection  con;
	PreparedStatement ps;
	ResultSet rs;
	public EmployeeDao() throws SQLException  {
		con=DriverManager.getConnection("jdbc:mysql://localhost/miniprojectems","root","India@12345");
	}
public boolean saveEmployee(Employee emp)throws Exception {
		
		
		ps=con.prepareStatement("insert into Employee values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
		ps.setInt(1, emp.getEmp_ID());
		ps.setString(2, emp.getEmp_First_Name());
		ps.setString(3, emp.getEmp_Last_Name());
		ps.setString(4, emp.getEmp_Date_of_Birth());
		ps.setString(5, emp.getEmp_Date_of_Joining());
		ps.setInt(6, emp.getEmp_Dept_ID());
		ps.setString(7, emp.getEmp_Grade());
		ps.setString(8, emp.getEmp_Designation());
		ps.setInt(9, emp.getEmp_Basic());
		ps.setString(10, emp.getEmp_Gender());
		ps.setString(11, emp.getEmp_Marital_Status());
		ps.setString(12, emp.getEmp_Home_Address());
		ps.setInt(13, emp.getEmp_Contact_Num());
		ps.setInt(14, emp.getMgr_Id());
		int n=ps.executeUpdate();
		if(n>0) {
			return true;
		}
		return false;
	}
	
	public Employee getEmployeeById(int Emp_ID) throws Exception {	
		ps=con.prepareStatement("select * from employee where Emp_ID=?");
		ps.setInt(1, Emp_ID);
		rs=ps.executeQuery();
		Employee emp=new Employee();
		if(rs.next()) {
		emp.setEmp_ID(rs.getInt(1));
		emp.setEmp_First_Name(rs.getString(2));
		emp.setEmp_Last_Name(rs.getString(3));
		emp.setEmp_Date_of_Birth(rs.getString(4));
		emp.setEmp_Date_of_Joining(rs.getString(5));
		emp.setEmp_Dept_ID(rs.getInt(6));
		emp.setEmp_Grade(rs.getString(7));
		emp.setEmp_Designation(rs.getString(8));
		emp.setEmp_Basic(rs.getInt(9));
		emp.setEmp_Gender(rs.getString(10));
		emp.setEmp_Marital_Status(rs.getString(11));
		emp.setEmp_Home_Address(rs.getString(12));
		emp.setEmp_Contact_Num(rs.getInt(13));
		emp.setMgr_Id(rs.getInt(14));
		return emp;
		}
		return null;	
	}
	
	public List<Employee> getEmployees() throws Exception {	
		ps=con.prepareStatement("select * from employee");
		rs=ps.executeQuery();
		List<Employee> empList=new ArrayList<>();
		while(rs.next()) {
		Employee emp=new Employee();
		emp.setEmp_ID(rs.getInt(1));
		emp.setEmp_First_Name(rs.getString(2));
		emp.setEmp_Last_Name(rs.getString(3));
		emp.setEmp_Date_of_Birth(rs.getString(4));
		emp.setEmp_Date_of_Joining(rs.getString(5));
		emp.setEmp_Dept_ID(rs.getInt(6));
		emp.setEmp_Grade(rs.getString(7));
		emp.setEmp_Designation(rs.getString(8));
		emp.setEmp_Basic(rs.getInt(9));
		emp.setEmp_Gender(rs.getString(10));
		emp.setEmp_Marital_Status(rs.getString(11));
		emp.setEmp_Home_Address(rs.getString(12));
		emp.setEmp_Contact_Num(rs.getInt(13));
		emp.setMgr_Id(rs.getInt(14));
		empList.add(emp);
		}
		return empList;
			
	}
	
	public boolean deleteEmployeeById(int Emp_ID) throws Exception {
		ps=con.prepareStatement("delete from employee where Emp_ID=?");
		ps.setInt(1, Emp_ID);
		int r=ps.executeUpdate();
		if(r>0) {
			return true;
		}
		return false;
	}
	
	
}

