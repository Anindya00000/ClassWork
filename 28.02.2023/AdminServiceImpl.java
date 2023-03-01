package com.ars.serviceImpl;

import com.ars.dao.AdminDao;
import com.ars.daoImpl.AdminDaoImpl;
import com.ars.entity.Admin;
import com.ars.service.AdminService;

public class AdminServiceImpl implements AdminService{
	AdminDao aDao=new AdminDaoImpl();
	@Override
	public void registerAdmin(Admin admin) {
		aDao.registerAdmin(admin);
		
	}

	@Override
	public boolean loginAdmin(String userName, String password) {
		
		return aDao.loginAdmin(userName, password);
	}
	

}