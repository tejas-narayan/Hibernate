package com.xworkz.blutooth;

import java.util.Scanner;

import com.xworkz.blutooth.dto.BluetoothDTO;
import com.xworkz.blutooth.service.BluetoothSpeakerService;
import com.xworkz.blutooth.service.BluetoothSpeakerServiceImpl;

public class BluetoothTester {

	public static void main(String[] args) {
		System.out.println("Bluetooth data ");
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter no of records to store");
		int rec = sc.nextInt();
		for(int i=0;i<rec;i++) {
			System.out.println("Enter ID");
			int id1 = sc.nextInt();
			System.out.println("Enter Bluetooth Name");
			String s1 = sc.next();
			System.out.println("Enter Bluetooth Brand");
			String s2 = sc.next();
			System.out.println("Enter Bluetooth Range");
			String s3 = sc.next();
			
			BluetoothDTO bluetoothDTO = new BluetoothDTO();
			bluetoothDTO.setBluetoothId(id1);
			bluetoothDTO.setBluetoothName(s1);
			bluetoothDTO.setBrand(s2);
			bluetoothDTO.setRange(s3);
			System.out.println(bluetoothDTO);
			
			BluetoothSpeakerService bluetoothSpeakerService = new BluetoothSpeakerServiceImpl();
			bluetoothSpeakerService.validateAndSave(bluetoothDTO);
			
		}
		
		System.out.println("Enter no of details to get by ID");
		int up = sc.nextInt();
		
		for(int j=0;j<up;j++) {
			
			BluetoothSpeakerService bluetootSpeakerService = new BluetoothSpeakerServiceImpl();

			BluetoothDTO bD = bluetootSpeakerService.validateAndGetBrandById(up);
			System.out.println(bD);
		}
		
		//BluetoothSpeakerService bluetoothSService = new BluetoothSpeakerServiceImpl();
				//List<BluetoothSpeakerDTO> bDTOs = bluetoothSService.validateAndGetAllDetails();
				/*for(BluetoothSpeakerDTO bs:bDTOs) {
					System.out.println(bs);
				} */
				
				System.out.println("Enter number of records to delete");
				int del = sc.nextInt();
				
				for(int l=0;l<del;l++) {
				System.out.println("Enter id to delete ");
				int idd = sc.nextInt();		
				BluetoothSpeakerService blueToothSServic = new BluetoothSpeakerServiceImpl();
				blueToothSServic.validateAndDeleteById(idd);
				System.out.println("deleted");
				}
				
				System.out.println("Enter number of records to update by id");
				int uid = sc.nextInt();
				for(int m=0;m<uid;m++) {
					System.out.println("enter id to update");
					int iddd = sc.nextInt();
					System.out.println("enter new range");
					String rang = sc.next();
				BluetoothSpeakerService bluToothSService = new BluetoothSpeakerServiceImpl();
				System.out.println("updating details by range");
				bluToothSService.validateAndUpdateRangeByName(iddd,rang);
				}
				
		

		
	}

}
