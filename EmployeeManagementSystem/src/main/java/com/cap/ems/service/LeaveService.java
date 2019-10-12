package com.cap.ems.service;

import com.cap.ems.dao.LeaveDao;
import com.cap.ems.model.Leave;


public class LeaveService {
LeaveDao dao;
	
	public boolean saveLeaves(Leave lv) throws Exception {
		dao=new LeaveDao();
		return dao.saveLeaves(lv);
	}

	
}
