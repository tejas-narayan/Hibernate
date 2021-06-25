package com.xworkz.whats_app_demo;

import com.xworkz.whats_app_demo.constants.StatusPrivacy;
import com.xworkz.whats_app_demo.dto.WhatsappDTO;
import com.xworkz.whats_app_demo.service.WhatsappService;
import com.xworkz.whats_app_demo.service.WhatsappServiceImpl;

public class Tester {

	public static void main(String[] args) {

		WhatsappDTO appDTO = new WhatsappDTO();
		appDTO.setWhatsappId(6);
		appDTO.setPrivacy(StatusPrivacy.MY_CONTACTS);
		appDTO.setContacts(456456567L);
		appDTO.setChats("HI Machaa");
		appDTO.setStatus("quotes");
		
		WhatsappService whatsappService = new WhatsappServiceImpl();
		whatsappService.validateAndCreateWhatsapp(appDTO);
		
	}

}
