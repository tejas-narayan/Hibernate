package com.xworkz.sweets.sweets.service;

import com.xworkz.sweets.sweets.dao.SweetsDAO;
import com.xworkz.sweets.sweets.dao.SweetsDAOImpl;
import com.xworkz.sweets.sweets.dto.SweetsDTO;

public class SweetServiceImpl implements SweetService {
	
	private SweetsDAO sweetsDAO;
	
	public SweetServiceImpl() {
		sweetsDAO = new SweetsDAOImpl();
	}
	

	public void validateAndSave(SweetsDTO sweetsDTO) {

		if(sweetsDTO != null) {
			sweetsDAO.save(sweetsDTO);
		}
		
		
		
		
	}

}
