package com.cap.ems.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cap.ems.dao.Modifydao;
import com.cap.ems.model.ModifyEmployee;
/**
 * Servlet implementation class ModifyEmpDetailsController
 */
@WebServlet("/modifyEmployee")
public class ModifyEmpDetailsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public ModifyEmpDetailsController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int Emp_ID=Integer.parseInt(request.getParameter("Emp_ID"));
		int Emp_Dept_ID=Integer.parseInt(request.getParameter("Emp_Dept_ID"));
		String Emp_Grade=request.getParameter("Emp_Grade");
		String Emp_Designation=request.getParameter("Emp_Designation");
		int Emp_Basic=Integer.parseInt(request.getParameter("Emp_Basic"));
		String Emp_Marital_Status=request.getParameter("Emp_Marital_Status");
		String Emp_Home_Address=request.getParameter("Emp_Home_Address");
	 	int Emp_Contact_Num=Integer.parseInt(request.getParameter("Emp_Contact_Num"));
		int Mgr_Id=Integer.parseInt(request.getParameter("Mgr_Id")); 
		
		ModifyEmployee emp = new ModifyEmployee(Emp_ID,Emp_Dept_ID,Emp_Grade,Emp_Designation,Emp_Basic,Emp_Marital_Status,Emp_Home_Address,Emp_Contact_Num,Mgr_Id);
		
		try {
			Modifydao dao = new Modifydao();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		

	}

}
