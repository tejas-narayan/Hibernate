package com.xworkz.blutooth.dao;

import com.xworkz.blutooth.dto.BluetoothDTO;

import java.util.List;

public interface BluetoothDAO {
	
	public void save(BluetoothDTO bluetoothDTO);
	
	public BluetoothDTO getBrandById(int id);
	
	public List<BluetoothDTO> getAllDetails();
	
	void deleteById(int id);
	
	void updateRangeByName(int id,String range);

}
