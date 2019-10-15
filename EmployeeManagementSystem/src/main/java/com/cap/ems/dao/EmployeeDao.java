package com.cap.ems.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cap.ems.model.Employee;
import com.cap.ems.model.Leave;
import com.cap.ems.model.ModifyEmployee;


public class EmployeeDao {
	Connection  con;
	PreparedStatement ps;
	ResultSet rs;
	public EmployeeDao() throws SQLException, ClassNotFoundException  {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://192.168.12.125:3306/miniprojectems","rajul","qwer1234");
	}
public boolean saveEmployee(Employee emp)throws Exception {
		
		
		ps=con.prepareStatement("insert into Employee values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
		ps.setString(1, emp.getEmpID());
		ps.setString(2, emp.getEmpFirstName());
		ps.setString(3, emp.getEmpLastName());
		ps.setString(4, emp.getEmpDateofBirth());
		ps.setString(5, emp.getEmpDateofJoining());
		ps.setInt(6, emp.getEmpDeptID());
		ps.setString(7, emp.getEmpGrade());
		ps.setString(8, emp.getEmpDesignation());
		ps.setInt(9, emp.getEmpBasic());
		ps.setString(10, emp.getEmpGender());
		ps.setString(11, emp.getEmpMaritalStatus());
		ps.setString(12, emp.getEmpHomeAddress());
		ps.setString(13, emp.getEmpContactNum());
		ps.setString(14, emp.getMgrID());
		int n=ps.executeUpdate();
		if(n>0) {
			return true;
		}
		return false;
	}
	
	public Employee getEmployeeById(String Emp_ID) throws Exception {	
		ps=con.prepareStatement("select * from employee where Emp_ID=?");
		ps.setString(1, Emp_ID);
		rs=ps.executeQuery();
		Employee emp=new Employee();
		if(rs.next()) {
		emp.setEmpID(rs.getString(1));
		emp.setEmpFirstName(rs.getString(2));
		emp.setEmpLastName(rs.getString(3));
		emp.setEmpDateofBirth(rs.getString(4));
		emp.setEmpDateofJoining(rs.getString(5));
		emp.setEmpDeptID(rs.getInt(6));
		emp.setEmpGrade(rs.getString(7));
		emp.setEmpDesignation(rs.getString(8));
		emp.setEmpBasic(rs.getInt(9));
		emp.setEmpGender(rs.getString(10));
		emp.setEmpMaritalStatus(rs.getString(11));
		emp.setEmpHomeAddress(rs.getString(12));
		emp.setEmpContactNum(rs.getString(13));
		emp.setMgrID(rs.getString(14));
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
		emp.setEmpID(rs.getString(1));
		emp.setEmpFirstName(rs.getString(2));
		emp.setEmpLastName(rs.getString(3));
		emp.setEmpDateofBirth(rs.getString(4));
		emp.setEmpDateofJoining(rs.getString(5));
		emp.setEmpDeptID(rs.getInt(6));
		emp.setEmpGrade(rs.getString(7));
		emp.setEmpDesignation(rs.getString(8));
		emp.setEmpBasic(rs.getInt(9));
		emp.setEmpGender(rs.getString(10));
		emp.setEmpMaritalStatus(rs.getString(11));
		emp.setEmpHomeAddress(rs.getString(12));
		emp.setEmpContactNum(rs.getString(13));
		emp.setMgrID(rs.getString(14));
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
	public boolean updateEmployeeDetails(ModifyEmployee emp) throws SQLException {
		ps = con.prepareStatement("update Employee set Emp_Dept_ID=?, Emp_Grade=?, Emp_Designation=?, Emp_Basic=?, Emp_Marital_Status=?, Emp_Home_Address=?, Emp_Contact_Num=?, Mgr_Id=?   where Emp_Id=?");
		
		ps.setString(9, emp.getEmp_ID());
		ps.setInt(1, emp.getEmp_Dept_ID());
		ps.setString(2, emp.getEmp_Grade());
		ps.setString(3,emp.getEmp_Designation());
		ps.setInt(4,emp.getEmp_Basic());
		ps.setString(5,emp.getEmp_Marital_Status());
		ps.setString(6, emp.getEmp_Home_Address());
		ps.setString(7, emp.getEmp_Contact_Num());
		ps.setString(8, emp.getMgrId());
		

		int n=ps.executeUpdate();	
		if(n>0) {
			return true;
		}
		return false;	
	}
	
	
	
}

