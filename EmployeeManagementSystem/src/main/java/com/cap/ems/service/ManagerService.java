package com.cap.ems.service;

import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

import com.cap.ems.dao.ManagerDao;
import com.cap.ems.model.Leave;


public class ManagerService {
	ManagerDao dao;
	public List<Leave> getLeaveDetails(int eId) throws Exception {
		// TODO Auto-generated method stub
		List<Leave> leave = dao.getLeaves(eId);
		if(leave.size() > 0){
			Collections.reverse(leave);
		}
		return leave;
	}
}
