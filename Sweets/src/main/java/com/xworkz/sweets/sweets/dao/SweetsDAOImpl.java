package com.xworkz.sweets.sweets.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.sweets.sweets.dto.SweetsDTO;

public class SweetsDAOImpl implements SweetsDAO{

	public void save(SweetsDTO sweetsDTO) {

		Configuration config = new Configuration();
		
		
		config.configure();
		config.addAnnotatedClass(SweetsDTO.class);
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(sweetsDTO);
		transaction.commit();
		session.close();
		
		
		
	}

}
