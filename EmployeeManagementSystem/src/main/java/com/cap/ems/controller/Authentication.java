package com.cap.ems.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.cap.ems.service.LoginService;



@WebServlet("/login")
public class Authentication extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String UserName = request.getParameter("UserName");
		String UserPassword = request.getParameter("UserPassword");
		   LoginService service= new LoginService();
		   
		
			try {
		
				if(service.check(UserName,UserPassword)) 
			
				{
					HttpSession session = request.getSession();
					session.setAttribute("label", UserName);
				
					if(UserName!="admin") {
						response.sendRedirect("adminOptionScreen.jsp");
			    	}else if(UserName != "Manager") {
			    		response.sendRedirect("manager.jsp");
			    	}else {
			    		response.sendRedirect("EMPLOYEE_MAIN_OPTION_SCREEN.jsp");
			    	}
				}
			
				else
				{
					response.sendRedirect("loginScreen.jsp");
					PrintWriter out = response.getWriter();
					out.println("wrong username or password");
				}
			} catch (Exception e)
			{	
				
				e.printStackTrace();
			}
		} 
		
		
}
