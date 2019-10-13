package com.cap.ems.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cap.ems.dao.LeaveDao;
import com.cap.ems.model.Leave;
import com.cap.ems.service.LeaveService;

/**
 * Servlet implementation class ApproveLeaveController
 */
@WebServlet("/LeaveController")
public class LeaveController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Leave lv;        
	LeaveService ls;
      	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ls= new LeaveService();
		try {
			List<Leave> leaveList= ls.getAllLeaves();
			request.setAttribute("leaveDetailsList", leaveList);
			RequestDispatcher rd=request.getRequestDispatcher("ManagerApprovalScreen.jsp");
			rd.forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
      	}

      	}
		



