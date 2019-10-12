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

public class LeaveDao {

	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	public LeaveDao() throws SQLException, ClassNotFoundException  {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/miniprojectems","root","India@12345");
	}
	public boolean saveLeaves(Leave lv) throws SQLException {
		
		ps = con.prepareStatement("INSERT INTO leave_history(emp_Id, leave_balance, noofdays_applied, date_from, date_to, status) values(?,?,?,?,?,?)");
		
		ps.setInt(1, lv.getEmp_ID());
		ps.setLong(2, lv.getLeave_balance());
		ps.setLong(3, lv.getNoOfDaysApplied());
		ps.setString(4, lv.getDate_from());
		ps.setString(5, lv.getDate_to());
		ps.setString(6, lv.getStatus());
		int n=ps.executeUpdate();
		if(n>0) {
			return true;
		}
		else {
			return false;
		}
	}
		
	public List<Leave> getleaves() throws Exception {	
		ps=con.prepareStatement("select * from leave_history");
		rs=ps.executeQuery();
		List<Leave> leaveList=new ArrayList<>();
		while(rs.next()) {
		Leave lv=new Leave();
		lv.setLeave_Id(rs.getInt(1));
		lv.setEmp_ID(rs.getInt(2));
		lv.setLeave_balance(rs.getInt(3));
		lv.setNoOfDaysApplied(rs.getInt(4));
		lv.setDate_from(rs.getString(5));
		lv.setDate_to(rs.getString(6));
		leaveList.add(lv);
		}
		return leaveList;
			
	}

}
