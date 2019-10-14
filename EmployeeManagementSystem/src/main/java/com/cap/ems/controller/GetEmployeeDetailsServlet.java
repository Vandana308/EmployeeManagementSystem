package com.cap.ems.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cap.ems.model.Employee;
import com.cap.ems.service.EmployeeService;

/**
 * Servlet implementation class GetEmployeeDetailsServlet
 */
@WebServlet("/GetEmployeeDetailsServlet")
public class GetEmployeeDetailsServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{          
		String empId=request.getParameter("EmployeeID");			
		EmployeeService es = new EmployeeService();						
		try {
				Employee emp = es.getEmployee(empId);
				RequestDispatcher rd=request.getRequestDispatcher("ModifyEmployeeDetails.jsp");
				request.setAttribute("emp", emp);
				rd.forward(request, response);
		} catch (Exception e) {

			e.printStackTrace();
		}
		
	}
}
