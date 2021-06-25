package com.xworkz.whats_app_demo.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//Hibernate uses DTO to perform CRUD

import com.xworkz.whats_app_demo.constants.StatusPrivacy;

@Entity
@Table(name = "whats_app")

public class WhatsappDTO implements Serializable {
	
	@Id
	private int whatsappId;
	private String status;
	private String chats;
	private long contacts;
	private StatusPrivacy privacy;
	
	
	public WhatsappDTO() {
		System.out.println(this.getClass().getSimpleName()+"created");	
	}

	
	
	
	
	@Override
	public String toString() {
		return "WhatsappDTO [whatsappId=" + whatsappId + ", status=" + status + ", chats=" + chats + ", contacts="
				+ contacts + ", privacy=" + privacy + "]";
	}





	public int getWhatsappId() {
		return whatsappId;
	}
	public void setWhatsappId(int whatsappId) {
		this.whatsappId = whatsappId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getChats() {
		return chats;
	}
	public void setChats(String chats) {
		this.chats = chats;
	}
	public long getContacts() {
		return contacts;
	}
	public void setContacts(long contacts) {
		this.contacts = contacts;
	}
	public StatusPrivacy getPrivacy() {
		return privacy;
	}
	public void setPrivacy(StatusPrivacy privacy) {
		this.privacy = privacy;
	}
	
}
