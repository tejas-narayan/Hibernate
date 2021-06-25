 package com.xworkz.whats_app_demo.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.whats_app_demo.dto.WhatsappDTO;




public class WhatsappDAOImpl implements WhatsappDAO {

	@Override
	public void saveWhatsapp(WhatsappDTO wDTO) {


		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(WhatsappDTO.class);
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(wDTO);
		transaction.commit();
		session.close();
		factory.close();
		
		
	}


	

}
