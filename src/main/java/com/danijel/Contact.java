package com.danijel;

public class Contact {
	private String email;
	private String phoneNumber;
	public Contact(){
	}
	public Contact(String email, String phoneNumber) {
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "Contact [email=" + email + ", phoneNumber=" + phoneNumber + "]";
	}
	
	public String getEmail() {
		return email;
	}
	public String getPhone() {
		return phoneNumber;
	}
}