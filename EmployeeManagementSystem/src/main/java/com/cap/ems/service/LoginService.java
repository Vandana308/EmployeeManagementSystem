package com.cap.ems.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginService {

	public boolean check(String UserName, String UserPassword) throws SQLException, ClassNotFoundException
	{ 

		Connection con;
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/miniprojectems","root","India@12345");
		
	  
	    PreparedStatement st = con.prepareStatement("select * from user_master where UserName = ? and UserPassword = ? ");
	    st.setString(1, UserName);
	    st.setString(2, UserPassword);
	    
	    ResultSet rs = st.executeQuery();
	    
	    if(rs.next())
	    {	
	    	
	    	return true;
	    }
		
		return false;
	}
	
}
