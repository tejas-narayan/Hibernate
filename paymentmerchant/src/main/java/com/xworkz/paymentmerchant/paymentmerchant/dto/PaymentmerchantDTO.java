package com.xworkz.paymentmerchant.paymentmerchant.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity


@Table(name="merchant_table")
public class PaymentmerchantDTO implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	@Column(name="merchant_id")
	private int merchantId;
	@Column(name="merchant_name")
	private String merchantName;
	@Column(name="CEO")
	private String CEO;
	@Column(name="hq")
	private String hq;
	@Override
	public String toString() {
		return "PaymentmerchantDTO [merchantId=" + merchantId + ", merchantName=" + merchantName + ", CEO=" + CEO
				+ ", hq=" + hq + "]";
	}
	public int getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(int merchantId) {
		this.merchantId = merchantId;
	}
	public String getMerchantName() {
		return merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	public String getCEO() {
		return CEO;
	}
	public void setCEO(String cEO) {
		CEO = cEO;
	}
	public String getHq() {
		return hq;
	}
	public void setHq(String hq) {
		this.hq = hq;
	}
	
	

}
