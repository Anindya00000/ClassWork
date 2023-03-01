package com.ars.daoImpl;

import javax.swing.JOptionPane;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import javax.swing.JOptionPane;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.ars.config.HibernateUtil;
import com.ars.dao.PassengerDao;
import com.ars.entity.Admin;
import com.ars.entity.Passenger;
import com.ars.model.PassengerDTO;

import com.ars.dao.AdminDao;
import com.ars.entity.Admin;


public class AdminDaoImpl implements AdminDao {

	@Override
	public void registerAdmin(Admin admin) {
		try(Session session=HibernateUtil.getSession())
		{
		session.beginTransaction();
		session.save(admin);
		session.getTransaction().commit();
		
		session.close();
		}
		catch (HibernateException e) {
			System.out.println(e.getMessage());
		}
		
	}

	@Override
	public boolean loginAdmin(String username, String password) {
		Session session=HibernateUtil.getSession();
		Admin admin=(Admin)session.get(Admin.class,(JOptionPane.showInputDialog("Enter id","type here")));
		if(admin.getUserName().equals(username) && admin.getPassword().equals(admin))
			return true;
		else
		return false;
	}
	
  
}
