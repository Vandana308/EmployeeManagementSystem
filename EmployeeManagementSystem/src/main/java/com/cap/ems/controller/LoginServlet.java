package com.cap.ems.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cap.ems.dao.LoginDao;
import com.cap.ems.model.Employee;



/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
          
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String userpassword = request.getParameter("userpassword");
		LoginDao dao = new LoginDao();
		  		
			try {
			   
				
				if(dao.check(username, userpassword))
				{
				HttpSession session = request.getSession();
				session.setAttribute("UserNameObj", username);
				
				Employee emp = dao.getEmpDetailById(username);
				session.setAttribute("EmployeeObj", emp);
				//response.sendRedirect("Welcome.jsp");
				RequestDispatcher rd=request.getRequestDispatcher("/Welcome.jsp");
				rd.forward(request, response);
				}
				else
				{
					response.sendRedirect("Login.jsp");
					PrintWriter out = response.getWriter();
					out.println("wrong username or password");
				}
			} catch (Exception e)
			{
				e.printStackTrace();
			}
		} 
}
