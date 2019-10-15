package com.cap.ems.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cap.ems.dao.LoginDao;
import com.cap.ems.model.Employee;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("UserName");
		String userpassword = request.getParameter("UserPassword");
		LoginDao dao = new LoginDao();

		try {
		

			if (dao.check(username, userpassword)) {
				
				String userType = dao.userType;
				if (userType .equals("admin")) {
					RequestDispatcher rd = request.getRequestDispatcher("/AdminOptionScreen.jsp");
					rd.forward(request, response);
					
				} else if(userType .equals("employee"))
				{
					HttpSession session = request.getSession();
					session.setAttribute("UserNameObj", username);
					Employee emp = dao.getEmpDetailById(username);
					session.setAttribute("EmployeeObj", emp);
					RequestDispatcher rd1 = request.getRequestDispatcher("/EMPLOYEE_MAIN_OPTION_SCREEN.jsp");
					rd1.forward(request, response);
				}
				else {
					HttpSession session = request.getSession();
					session.setAttribute("UserNameObj", username);
					Employee emp = dao.getEmpDetailById(username);
					session.setAttribute("ManagerObj", emp);
					RequestDispatcher rd2 = request.getRequestDispatcher("/ManagerHomeScreen.jsp");
					rd2.forward(request, response);
				}
			
			} else {
				response.sendRedirect("LoginScreen.jsp");
				System.out.println("null");
				PrintWriter out = response.getWriter();
				out.println("wrong username or password");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}