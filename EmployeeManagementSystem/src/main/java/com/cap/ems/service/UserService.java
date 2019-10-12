package com.cap.ems.service;

import com.cap.ems.dao.UserDao;
import com.cap.ems.model.UserMaster;

public class UserService {
UserDao dao;
	
	public boolean saveUsers(UserMaster users) throws Exception {
		dao=new UserDao();
		return dao.saveUsers(users);
	}
}
