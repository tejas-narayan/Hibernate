package com.xworkz.blutooth.service;

import com.xworkz.blutooth.dto.BluetoothDTO;


import java.util.List;

public interface BluetoothSpeakerService {

	public void validateAndSave(BluetoothDTO bluetoothDTO);


		public BluetoothDTO validateAndGetBrandById(int id);
		
		public List<BluetoothDTO> validateAndGetAllDetails();
		
		void validateAndDeleteById(int Id);
		
		void validateAndUpdateRangeByName(int id,String range);
		
		
	}


