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
import com.cap.ems.utility.FunctionResponse;

public class ManagerDao {
	Connection  con;
	PreparedStatement ps;
	ResultSet rs;
	public ManagerDao() throws SQLException  {
		con=DriverManager.getConnection("jdbc:mysql://localhost/miniprojectems","root","India@12345");
	}
	public List<Leave> getLeaves(int eID) throws Exception {	
		ps=con.prepareStatement("select * from leave_history where EMP_Id=? and status=?");
		ps.setInt(1,eID);
		ps.setString(2, "Applied");
		rs=ps.executeQuery();
		List<Leave> leaveList=new ArrayList<>();
		while(rs.next()) {
		Leave lv=new Leave();
		lv.setLeave_Id(rs.getInt(1));
		lv.setEmp_ID(rs.getInt(2));
		lv.setLeave_balance(rs.getInt(3));
		lv.setNoofdays_applied(rs.getInt(4));
		lv.setDate_from(rs.getString(5));
		lv.setDate_to(rs.getString(6));
		lv.setStatus(rs.getString(7));
		leaveList.add(lv);
		}
		return leaveList;
			
	}
	
	
	public FunctionResponse updateLeaveRequest(int eId, int lId, String status) throws SQLException {
		FunctionResponse fresResponse = new FunctionResponse();
		ps=con.prepareStatement("UPDATE leave_history SET status = ? WHERE Leave_Id = ? and Emp_id = ?");
		
			ps.setString(1, status);
			ps.setInt(2, lId);
			ps.setInt(3,eId);
		
		fresResponse.setEMP_ID(eId);
		fresResponse.setStatus("Approved");
		return fresResponse;
	}
}
