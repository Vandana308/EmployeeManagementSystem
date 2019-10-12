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

import org.joda.time.DateTime;
import org.joda.time.Days;

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
		format = new SimpleDateFormat("yyyy/MM/dd");
		Date d1= null;
		Date d2= null;
		int emp_Id= Integer.parseInt(request.getParameter("emp_Id"));
		String status="applied";
		long leave_balance;
    	long noofdays_applied;
		try {
			d1= format.parse(date_from);
			d2= format.parse(date_to);
		long diff= d2.getTime() - d1.getTime();
		noofdays_applied = diff/(24*60*60*1000);
		leave_balance= 12 - noofdays_applied;
       Leave lv= new Leave(emp_Id, leave_balance, noofdays_applied, status, date_from, date_to);
		ls= new LeaveService();
		
				if(ls.saveLeaves(lv)){
					
					System.out.println("leaves added"+noofdays_applied);
					//response.sendRedirect("viewLeaves.jsp");
						}
					else {
					//response.sendRedirect("leaveFail.jsp");
					System.out.println("Else caluse");
					}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
   	}
}
				
   	
	

			
		
   	
		
		
		
   	


