package com.cap.ems.service;

import java.util.List;

import com.cap.ems.dao.LeaveDao;
import com.cap.ems.model.Leave;


public class LeaveService {
LeaveDao dao;
	
	public boolean saveLeaves(Leave lv) throws Exception {
		dao=new LeaveDao();
		return dao.saveLeaves(lv);
	}
	public List<Leave> getAllLeaves() throws Exception{
		dao=new LeaveDao();
		return dao.getLeaves();
		}
	public boolean approveLeaves(Leave lv) throws Exception {
		dao=new LeaveDao();
		return dao.approveLeaves(lv);
	}
	public boolean rejectLeaves(Leave lv) throws Exception {
		dao=new LeaveDao();
		return dao.approveLeaves(lv);
	}
	
	
}
