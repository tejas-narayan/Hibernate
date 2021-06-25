package com.xworkz.blutooth.service;

import java.util.List;

import com.xworkz.blutooth.dao.BluetoothDAO;
import com.xworkz.blutooth.dao.BluetoothDAOimpl;
import com.xworkz.blutooth.dto.BluetoothDTO;

public class BluetoothSpeakerServiceImpl implements BluetoothSpeakerService {
	
	private BluetoothDAO bluetoothDAO;
	
	public BluetoothSpeakerServiceImpl() {

		bluetoothDAO = new BluetoothDAOimpl();
		
	}

public void validateAndSave(BluetoothDTO bluetoothDTO) {
	if(bluetoothDTO!=null) {
		System.out.println("service method executed");
		bluetoothDAO.save(bluetoothDTO);
	}
	else {
		System.out.println("Object cant be empty");
	}
}
public BluetoothDTO validateAndGetBrandById(int id) {
	if(id>0) {
		return bluetoothDAO.getBrandById(id);
		
	}
	return null;
			
	
}


public List<BluetoothDTO> validateAndGetAllDetails() {
	return bluetoothDAO.getAllDetails();
}


public void validateAndDeleteById(int id) {
	if(id>0) {
		 bluetoothDAO.deleteById(id);
		
	}
	
}


public void validateAndUpdateRangeByName(int id,String range) {
	if(id!=0) {
		
		bluetoothDAO.updateRangeByName(id,range);
	}
	else {
		System.out.println("id cant be empty");
	}
}

		
}
