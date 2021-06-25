package com.xworkz.perfumes.app.perfumes.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.perfumes.app.perfumes.dto.PerfumeDTO;

public class PerfumeDAOImpl implements PerfumeDAO {

	public void save(PerfumeDTO pDTO) {

		Configuration config = new Configuration();
		config.configure();
		config.addAnnotatedClass(PerfumeDTO.class);
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(pDTO);
		transaction.commit();
		session.close();
		
		
		
		
		
	}

}
