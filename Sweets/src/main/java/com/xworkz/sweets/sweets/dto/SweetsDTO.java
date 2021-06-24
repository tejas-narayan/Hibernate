package com.xworkz.sweets.sweets.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sweets_table")
public class SweetsDTO implements Serializable {
	
	@Id
	@Column(name="sweet_id")
	private int sweetId;
	@Column(name="sweet_name")
	private String sweetname;
	@Column(name="sweet_price")
	private double price;
	@Column(name="sweet_shape")
	private String shape;
	@Column(name="sweet_color")
	private String color;
	
	public SweetsDTO() {
		System.out.println(this.getClass().getSimpleName()+"Created"); 
	}

	@Override
	public String toString() {
		return "SweetsDTO [sweetId=" + sweetId + ", sweetname=" + sweetname + ", price=" + price + ", shape=" + shape
				+ ", color=" + color + "]";
	}

	public int getSweetId() {
		return sweetId;
	}

	public void setSweetId(int sweetId) {
		this.sweetId = sweetId;
	}

	public String getSweetname() {
		return sweetname;
	}

	public void setSweetname(String sweetname) {
		this.sweetname = sweetname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	

	
}
