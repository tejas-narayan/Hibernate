package com.xworkz.blutooth.dao;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.blutooth.dto.BluetoothDTO;

public class BluetoothDAOimpl implements BluetoothDAO {

public void save(BluetoothDTO bluetoothSpeakerDTO) {
	
	System.out.println("IN dao impl");
		
		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(BluetoothDTO.class);
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		System.out.println("in impl");
		System.out.println(bluetoothSpeakerDTO+"in daoimpl");
		Transaction transaction = session.beginTransaction();
		session.save(bluetoothSpeakerDTO);  
		transaction.commit();
		session.close();
		factory.close();
		
		
	}

	public BluetoothDTO getBrandById(int id) {
		
		Configuration config = new Configuration();
		config.configure();
		config.addAnnotatedClass(BluetoothDTO.class);
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		BluetoothDTO bDTO = session.get(BluetoothDTO.class,id);
		session.close();
		factory.close();
		
		return bDTO;
	}

	public List<BluetoothDTO> getAllDetails() {
		Configuration conf = new Configuration();
		conf.configure();
		conf.addAnnotatedClass(BluetoothDTO.class);
		SessionFactory factory = conf.buildSessionFactory();
		Session session = factory.openSession();
		//session.get
		//BluetoothSpeakerDTO bDTO = session.get(BluetoothSpeakerDTO.class);
		
		//session.close();
		factory.close();
	
		
		return null;
	}

	public void deleteById(int id) {
		Configuration config = new Configuration();
		config.configure();
		config.addAnnotatedClass(BluetoothDTO.class);
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		BluetoothDTO bDTO1 = session.get(BluetoothDTO.class,id);
		Transaction transaction = session.beginTransaction();
		session.delete(bDTO1);
		transaction.commit();
		session.close();
		factory.close();
		
	}

	public void updateRangeByName(int id,String range) {
		Configuration confi = new Configuration();
		confi.configure();
		confi.addAnnotatedClass(BluetoothDTO.class);
		SessionFactory factory = confi.buildSessionFactory();
		Session session = factory.openSession();
		BluetoothDTO blueeDTO = session.get(BluetoothDTO.class,id);
		blueeDTO.setRange(range);
		Transaction transaction = session.beginTransaction();
		session.update(blueeDTO);
		transaction.commit();
		session.close();
		factory.close();
	 
	
	

}
}