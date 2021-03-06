package com.cap.ems.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cap.ems.model.Employee;
import com.cap.ems.model.UserMaster;
import com.cap.ems.service.EmployeeService;
import com.cap.ems.service.UserService;

@WebServlet("/AddEmployee")
public class EmployeeAddController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	EmployeeService es;
	Employee emp;
	UserMaster user;
	UserService us;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String Emp_ID= request.getParameter("Emp_ID");
		String Emp_First_Name=request.getParameter("Emp_First_Name");
		String Emp_Last_Name=request.getParameter("Emp_Last_Name");
		String Emp_Date_of_Birth=request.getParameter("Emp_Date_of_Birth");
		String Emp_Date_of_Joining=request.getParameter("Emp_Date_of_Joining");
		int Emp_Dept_ID=Integer.parseInt(request.getParameter("Emp_Dept_ID"));
		String Emp_Grade=request.getParameter("Emp_Grade");
		String Emp_Designation=request.getParameter("Emp_Designation");
		int Emp_Basic=Integer.parseInt(request.getParameter("Emp_Basic"));
		String Emp_Gender=request.getParameter("Emp_Gender");
		String Emp_Marital_Status=request.getParameter("Emp_Marital_Status");
		String Emp_Home_Address=request.getParameter("Emp_Home_Address");
		String Emp_Contact_Num=request.getParameter("Emp_Contact_Num");
		String Mgr_Id= request.getParameter("Mgr_Id");
		String userId= Emp_ID;
		String userName= Emp_First_Name;
		String userPassword="test@123";
		String userType= request.getParameter("UserType");
		
		
		
		emp=new Employee(Emp_ID, Emp_Basic, Emp_Contact_Num, Mgr_Id, Emp_Dept_ID, Emp_First_Name,
				Emp_Last_Name, Emp_Grade, Emp_Designation, Emp_Gender, Emp_Marital_Status,
				Emp_Home_Address, Emp_Date_of_Birth, Emp_Date_of_Joining );
		
		user= new UserMaster(userId, userName, userPassword,  userType);
		es=new EmployeeService();
		us=new UserService();
		try {
		if((es.saveEmployee(emp)&&us.saveUsers(user))==true) {
			response.sendRedirect("Success.jsp");
		}
		else {
			response.sendRedirect("Failure.jsp");
			System.out.println("Else caluse");
		}
		}
		catch (Exception e) {
			e.printStackTrace();
			response.sendRedirect("Failure.jsp");
			System.out.println("Caught");
		}
		
	}

}

