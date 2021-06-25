package com.xworkz.perfumes.app.perfumes.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="perfume_table")

public class PerfumeDTO implements Serializable {
	
	@Id
	@Column(name="perfume_id")
	private int perfumeId;
	@Column(name="perfume_Name")
	private String perfumeName;
	@Column(name="perfume_color")
	private String perfumeColor;
	@Column(name="perfume_price")
	private double price;
	@Column(name="perfume_flavour")
	private String perfumeFlavour;
	
	
	public PerfumeDTO() {
		System.out.println(this.getClass().getSimpleName()+"created");
		
	}


	public int getPerfumeId() {
		return perfumeId;
	}


	public void setPerfumeId(int perfumeId) {
		this.perfumeId = perfumeId;
	}


	public String getPerfumeName() {
		return perfumeName;
	}


	public void setPerfumeName(String perfumeName) {
		this.perfumeName = perfumeName;
	}


	public String getPerfumeColor() {
		return perfumeColor;
	}


	public void setPerfumeColor(String perfumeColor) {
		this.perfumeColor = perfumeColor;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getPerfumeFlavour() {
		return perfumeFlavour;
	}


	public void setPerfumeFlavour(String perfumeFlavour) {
		this.perfumeFlavour = perfumeFlavour;
	}
	
	
	
	

}
