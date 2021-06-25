package com.xworks.singleton.singletonn;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	public static SessionFactory sf = null;
	
	public static SessionFactory getSessionFactory() {
		return sf;
	
		}
	static {
		Configuration config = new Configuration();
		
		config.configure();
		
		sf = config.buildSessionFactory();
		
		
		
		
	}
	

}
