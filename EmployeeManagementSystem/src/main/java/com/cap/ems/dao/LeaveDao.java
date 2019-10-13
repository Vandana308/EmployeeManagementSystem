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
		
		ps = con.prepareStatement("INSERT INTO leave_history(emp_Id, date_from, date_to, status) values(?,?,?,?)");
		
		ps.setString(1, lv.getEmployeeId());
		ps.setString(2, lv.getDate_from());
		ps.setString(3, lv.getDate_to());
		ps.setString(4, lv.getStatus());
		int n=ps.executeUpdate();
		if(n>0) {
			return true;
		}
		else {
			return false;
		}
	}
		
	public List<Leave> getLeaves() throws Exception {	
		ps=con.prepareStatement("select * from leave_history");
		rs=ps.executeQuery();
		List<Leave> leaveList=new ArrayList<>();
		while(rs.next()) {
		Leave lv=new Leave();
		lv.setLeave_Id(rs.getInt(1));
		lv.setEmployeeId(rs.getString(2));
		lv.setDate_from(rs.getString(3));
		lv.setDate_to(rs.getString(4));
		lv.setStatus(rs.getString(5));
		leaveList.add(lv);
		}
		return leaveList;
			
	}
	
	public boolean approveLeaves(Leave lv) throws SQLException{
	String query="update leave_history set status='approved' where status='applied'";
	PreparedStatement ps = con.prepareStatement(query);
	
		int n=ps.executeUpdate();
		if(n>0) {
			return true;
		}
		return false;
		
	}
	public boolean rejectLeaves(Leave lv) throws SQLException{
		String query="update leave_history set status='rejected' where status='applied'";
		PreparedStatement ps = con.prepareStatement(query);
			int n=ps.executeUpdate();
			if(n>0) {
				return true;
			}
			return false;
			
		}
	

}
