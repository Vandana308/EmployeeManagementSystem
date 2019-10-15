package com.cap.ems.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cap.ems.model.UserMaster;

public class UserDao {
	Connection  con;
	PreparedStatement ps;
	ResultSet rs;
	public UserDao() throws SQLException, ClassNotFoundException  {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://192.168.12.125:3306/miniprojectems","rajul","qwer1234");
	}
public boolean saveUsers(UserMaster user)throws Exception {
		
		
		ps=con.prepareStatement("insert into user_master values(?,?,?,?)");
		ps.setString(1, user.getUserId());
		ps.setString(2, user.getUserName());
		ps.setString(3, user.getUserPassword());
		ps.setString(4, user.getUserType());
		int n=ps.executeUpdate();
		if(n>0) {
			return true;
		}
		return false;
	}
}
