package com.xworkz.blutooth.dto;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="bluetooth_speaker")
public class BluetoothDTO implements Serializable{
	
	@Id
	@Column(name="bluetooth_id")
	private int bluetoothId;
	@Column(name="bluetooth_brand")
	private String brand;
	@Column(name="bluetooth_name")
	private String bluetoothName;
	@Column(name="range")
	private String range;
	
	public BluetoothDTO() {
		System.out.println(this.getClass().getSimpleName()+"DTO created");
	}
	
	
	
	
	

	@Override
	public String toString() {
		return "BluetoothDTO [bluetoothId=" + bluetoothId + ", brand=" + brand + ", bluetoothName=" + bluetoothName
				+ ", range=" + range + "]";
	}






	public int getBluetoothId() {
		return bluetoothId;
	}






	public void setBluetoothId(int bluetoothId) {
		this.bluetoothId = bluetoothId;
	}






	public String getBrand() {
		return brand;
	}






	public void setBrand(String brand) {
		this.brand = brand;
	}






	public String getBluetoothName() {
		return bluetoothName;
	}






	public void setBluetoothName(String bluetoothName) {
		this.bluetoothName = bluetoothName;
	}






	public String getRange() {
		return range;
	}






	public void setRange(String range) {
		this.range = range;
	}






		
}
