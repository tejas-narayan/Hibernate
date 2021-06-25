package com.xworkz.whats_app_demo.service;

import com.xworkz.whats_app_demo.dao.WhatsappDAO;
import com.xworkz.whats_app_demo.dao.WhatsappDAOImpl;
import com.xworkz.whats_app_demo.dto.WhatsappDTO;

public class WhatsappServiceImpl implements WhatsappService {
	
	private WhatsappDAO wDAO ;
	
	public WhatsappServiceImpl() {
		wDAO = new WhatsappDAOImpl(); 
	}
	
	@Override
	public void validateAndCreateWhatsapp(WhatsappDTO wDTO) {
		
		if(wDTO!= null) {
			wDAO.saveWhatsapp(wDTO);
		}
		else {
			System.out.println("entry cant be empty");
		}
		
	}

	
}
