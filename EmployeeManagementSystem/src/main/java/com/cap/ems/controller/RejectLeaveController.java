package com.cap.ems.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cap.ems.model.Leave;
import com.cap.ems.service.LeaveService;

/**
 * Servlet implementation class RejectLeaveController
 */
@WebServlet("/RejectLeaveController")
public class RejectLeaveController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Leave lv;
	LeaveService ls;
    	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    		String status="rejected";
    		lv= new Leave(status);
    		ls= new LeaveService();
    		try {
    		if(ls.rejectLeaves(lv)) {
    			response.sendRedirect("LeaveRejected.jsp");
    		}
    		else {
    			response.sendRedirect("ErrorLeave.jsp");
    			System.out.println("Else caluse");
    		}
    		}
    		catch (Exception e) {
    			e.printStackTrace();
    			response.sendRedirect("ErrorLeave.jsp");
    			System.out.println("Caught");
    		}
    		


    	  	

    	}

}
