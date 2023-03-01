package com.ars.dao;

import com.ars.entity.Passenger;

public interface PassengerDao 
{
    void savePassenger(Passenger passenger);
    boolean login(String username,String password);
}
