package com.ars.daoImpl;

import javax.swing.JOptionPane;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.ars.config.HibernateUtil;
import com.ars.dao.PassengerDao;
import com.ars.entity.Admin;
import com.ars.entity.Passenger;
import com.ars.model.PassengerDTO;

public class PassengerDaoImpl implements PassengerDao{

	@Override
	public void savePassenger(Passenger passenger) {
		try(Session session=HibernateUtil.getSession())
		{
			session.beginTransaction();
			session.save(passenger);
			session.getTransaction().commit();
			session.clear();
			
		}catch (HibernateException e) {
			System.out.println(e.getMessage());
		}
		
	}

	@Override
	public boolean login(String userName, String password) {
		Session session=HibernateUtil.getSession();
		Passenger p=(Passenger)session.get(Passenger.class,(JOptionPane.showInputDialog("enter id","type here")));
		if(p.getUserName().equals(userName)&& p.getPassword().equals(password))
		return true;
		else
		return false;
	}
	

}