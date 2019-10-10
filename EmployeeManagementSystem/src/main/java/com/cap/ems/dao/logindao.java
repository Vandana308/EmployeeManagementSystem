package com.cap.ems.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class logindao {
	public boolean check(String UserName, String UserPassword) throws Exception 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
	
		Connection con;
		con = DriverManager.getConnection("jdbc:mysql://localhost/miniprojectems","root","India@12345");
		
	    String query = "select * from user_master where UserName = ? and UserPassword = ? ";
	    PreparedStatement st = con.prepareStatement(query);
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

