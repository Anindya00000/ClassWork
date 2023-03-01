package com.ars.service;

import com.ars.entity.Passenger;

public interface PassengerService {
	void savePassenger(Passenger passenger);
	boolean login(String userName,String password);

}