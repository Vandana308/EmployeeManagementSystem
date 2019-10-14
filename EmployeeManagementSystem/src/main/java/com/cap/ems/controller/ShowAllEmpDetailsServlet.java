package com.cap.ems.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cap.ems.model.Employee;
import com.cap.ems.service.EmployeeService;

@WebServlet("/ShowAllEmpDetails")
public class ShowAllEmpDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public ShowAllEmpDetailsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		EmployeeService es=new EmployeeService();
		try {
			List<Employee> empList=es.getAllEmployee();
			request.setAttribute("empDetailsList", empList);
			RequestDispatcher rd=request.getRequestDispatcher("/ShowAllEmpDetails.jsp");
			rd.forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
