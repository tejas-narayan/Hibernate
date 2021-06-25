package com.xworkz.paymentmerchant.paymentmerchant.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworks.singleton.singletonn.HibernateUtil;
import com.xworkz.paymentmerchant.paymentmerchant.dto.PaymentmerchantDTO;

public class PaymentmerchantDAOImpl implements PrivatemerchantDAO {
//	SessionFactory sf = null;
	Session sess = null;
	Transaction trans = null;
	public void save(PaymentmerchantDTO pmDTO) {
		try {
			
//	 sf = HibernateUtil.getSessionFactory();
//
//	 sf.openSession();
		
	sess = HibernateUtil.getSessionFactory().openSession();
	
		
		
	trans = sess.beginTransaction();
		
		sess.save(pmDTO);
		
		trans.commit();
		}
		catch (HibernateException e) {
			e.printStackTrace();
			trans.rollback();
		}
		finally {
			if(sess!=null) {
				
				sess.close();

			}
			
		}
		
		
				
		
	}

}
