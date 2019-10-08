package com.cap.ems.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cap.ems.dao.logindao;

/**
 * Servlet implementation class AuthenticationService
 */
@WebServlet("/login")
public class Authentication extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String empname = request.getParameter("UserName");
		String pass = request.getParameter("UserPassword");
		   logindao dao = new logindao();
		   
		
			try {
		///////////code to be added
				if(true)//////code to be added
			///////////code to be added
				{
				HttpSession session = request.getSession();
				session.setAttribute("label", empname);
				response.sendRedirect("welcome.jsp");
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
