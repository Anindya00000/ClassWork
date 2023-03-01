package com.ars.serviceImpl;

import com.ars.dao.PassengerDao;
import com.ars.daoImpl.PassengerDaoImpl;
import com.ars.entity.Passenger;
import com.ars.service.PassengerService;

public class PassengerServiceImpl implements PassengerService{
PassengerDao pdao=new PassengerDaoImpl();
	@Override
	public void savePassenger(Passenger passenger) {
		pdao.savePassenger(passenger);
		
	}

	@Override
	public boolean login(String userName, String password) {
		
		return pdao.login(userName, password);
	}
	

}