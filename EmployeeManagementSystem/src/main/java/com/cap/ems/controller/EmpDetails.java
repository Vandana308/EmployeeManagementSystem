package com.cap.ems.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmpDetails
 */
public class EmpDetails extends HttpServlet {


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{          
		try {Class.forName("com.mysql.jdbc.Driver");
			  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			    String Emp_ID=request.getParameter("Emp_ID");				
				String url = "jdbc:mysql://localhost:3306/miniprojectems";
				String uname = "root";
				String password = "incorrect";
				
			    String query = "select * from employee where Emp_ID='"+Emp_ID+"'";
			    
			    
				Connection con= DriverManager.getConnection(url,uname,password);
				
				Statement st= con.createStatement();
				ResultSet rs= st.executeQuery(query);
				
								
				if(rs.next())
				{
				String Emp_id=rs.getString("Emp_ID");
				String Fname=rs.getString("Emp_First_Name");
				String lname=rs.getString("Emp_last_Name");
				String Department_Id=rs.getString("Emp_Dept_id");
				String Designation=rs.getString("Emp_Designation");
				String Contact_Number=rs.getString("Emp_contact_num");
				
				request.setAttribute("a", Emp_id);
				request.setAttribute("b", Fname);
				request.setAttribute("c", lname);
				request.setAttribute("d", Department_Id);
				request.setAttribute("e", Designation);
				request.setAttribute("f", Contact_Number);
				
				RequestDispatcher rd=request.getRequestDispatcher("showEmployee.jsp");
				
			    rd.forward(request, response);			
				}
			    st.close();
				con.close();
	
			}
		catch(Exception e) 
     	{
			System.out.println(e);
		}
		
	}
}
