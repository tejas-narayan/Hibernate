package com.xworkz.sweets.sweets;

import java.util.Scanner;

import com.xworkz.sweets.sweets.dto.SweetsDTO;
import com.xworkz.sweets.sweets.service.SweetService;
import com.xworkz.sweets.sweets.service.SweetServiceImpl;

public class SweetTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	 
//		SweetsDTO sweetsDTO = new SweetsDTO();
//		sweetsDTO.setSweetId(1);
//		sweetsDTO.setSweetname("kaju barfi");
//		sweetsDTO.setPrice(800.00);
//		sweetsDTO.setShape("Diamond");
//		sweetsDTO.setColor("Dusty white");
		
	SweetsDTO sweetsDTO = new SweetsDTO();
	System.out.println("Enter the Sweet id :");
	sweetsDTO.setSweetId(sc.nextInt());
	System.out.println("Enter the sweet name :");
	sweetsDTO.setSweetname(sc.next());
	System.out.println("Enter Price :");
	sweetsDTO.setPrice(sc.nextDouble());
	System.out.println("Enter the Shape of the Sweet :");
	sweetsDTO.setShape(sc.next());
	System.out.println("Enter the colour of the sweet :");
	sweetsDTO.setColor(sc.next());
	
	
 	
	
		
		
		
		SweetService sweetService = new SweetServiceImpl();
		sweetService.validateAndSave(sweetsDTO);
		
		
		
		
		
		

	}

}
