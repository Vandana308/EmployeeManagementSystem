package com.cap.ems.service;

import java.util.List;

import com.cap.ems.dao.EmployeeDao;
import com.cap.ems.model.Employee;

public class EmployeeService {
EmployeeDao dao;
	
	public boolean saveEmployee(Employee emp)throws Exception {
		dao=new EmployeeDao();
		return dao.saveEmployee(emp);
	}
	
	public boolean deleteEmployee(int empId) throws Exception {
		dao=new EmployeeDao();
		return dao.deleteEmployeeById(empId);
	}
	public Employee getEmployee(int empId) throws Exception {
		dao=new EmployeeDao();
		return dao.getEmployeeById(empId);
	}
//	public boolean updateEmployee(Employee emp) {
//		
//	}
public List<Employee> getAllEmployee() throws Exception{
	dao=new EmployeeDao();
	return dao.getEmployees();
	}

}
