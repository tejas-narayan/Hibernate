package com.xworkz.paymentmerchant.paymentmerchant.service;

import com.xworkz.paymentmerchant.paymentmerchant.dao.PaymentmerchantDAOImpl;
import com.xworkz.paymentmerchant.paymentmerchant.dao.PrivatemerchantDAO;
import com.xworkz.paymentmerchant.paymentmerchant.dto.PaymentmerchantDTO;

public class PaymentmerchantServiceImpl implements PaymentmerchantService {
	
	private PrivatemerchantDAO pDAO ;
	public PaymentmerchantServiceImpl() {
		pDAO = new PaymentmerchantDAOImpl();
	}

	public void validateAndSave(PaymentmerchantDTO pmDTO) {
		if(pmDTO!=null) {
			pDAO.save(pmDTO);
		}else {
			System.out.println("The dto can't be null");
		}
		
	}

}
