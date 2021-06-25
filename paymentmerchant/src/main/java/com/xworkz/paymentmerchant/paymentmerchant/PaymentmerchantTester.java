package com.xworkz.paymentmerchant.paymentmerchant;

import java.util.Scanner;

import com.xworkz.paymentmerchant.paymentmerchant.dto.PaymentmerchantDTO;
import com.xworkz.paymentmerchant.paymentmerchant.service.PaymentmerchantService;
import com.xworkz.paymentmerchant.paymentmerchant.service.PaymentmerchantServiceImpl;

public class PaymentmerchantTester {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	PaymentmerchantDTO pmDTO = new PaymentmerchantDTO();
	
	
	System.out.println("Press \"Y\" to save data or press \"N\"  " );
	if(sc.next().equalsIgnoreCase("Y")) {
	System.out.println("Enter the name of payment merchant");
	pmDTO.setMerchantName(sc.next());
	System.out.println("Enter the ceo name");
	pmDTO.setCEO(sc.next());
	System.out.println("Enter the headQuarter");
	pmDTO.setHq(sc.next());
	
	PaymentmerchantService ps = new PaymentmerchantServiceImpl();
	ps.validateAndSave(pmDTO);
	
		
	}
		
	}

}
