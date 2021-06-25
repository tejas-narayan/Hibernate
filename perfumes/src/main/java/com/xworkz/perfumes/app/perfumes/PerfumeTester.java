package com.xworkz.perfumes.app.perfumes;

import java.util.Scanner;

import com.xworkz.perfumes.app.perfumes.dto.PerfumeDTO;
import com.xworkz.perfumes.app.perfumes.service.PerfumeService;
import com.xworkz.perfumes.app.perfumes.service.PerfumeServiceImpl;

public class PerfumeTester {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		
		PerfumeDTO pDTO = new PerfumeDTO();
		System.out.println("Enter perfumr id");
		pDTO.setPerfumeId(sc.nextInt());
		System.out.println("Enter perfumr name");
		pDTO.setPerfumeName(sc.next());
		System.out.println("Enter perfumr color");
		pDTO.setPerfumeColor(sc.next());
		System.out.println("Enter perfumr price");
		pDTO.setPrice(sc.nextDouble());
		System.out.println("Enter perfumr Fragrance");
		pDTO.setPerfumeFlavour(sc.next());

		 
		
		
		
		
		
		
		
		
		
		PerfumeService perfumeService = new PerfumeServiceImpl();
		perfumeService.validateAndSave(pDTO);
		
		}
	}


