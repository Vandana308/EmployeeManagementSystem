package com.cap.ems.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import com.cap.ems.model.Leave;
import com.cap.ems.service.LeaveService;
import com.cap.ems.utility.FunctionResponse;

/**
 * Servlet implementation class ApplyLeaveController
 */
@WebServlet("/ApplyLeaveController")
public class ApplyLeaveController extends HttpServlet {

	LeaveService ls;
	SimpleDateFormat format;
	private static final long serialVersionUID = 1L;
   	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   		
   			
   		String date_from = request.getParameter("date_from");
   	
		String date_to=request.getParameter("date_to");
		
		String emp_Id= request.getParameter("emp_Id");
		String status="applied";
		Leave lv= new Leave(emp_Id, status, date_from, date_to);
		ls= new LeaveService();
		
				try {
					if(ls.saveLeaves(lv)){
						response.sendRedirect("EmployeeAppliesLeave.jsp");
							}
						else {
						response.sendRedirect("LeaveNotApplied.jsp");
						}
				} catch (Exception e) {
					response.sendRedirect("LeaveNotApplied.jsp");
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} 
   	}

				
   	
	

			
		
   	
		
		
		
   	


