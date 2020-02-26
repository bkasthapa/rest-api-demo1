package com.rab3.Dtos;

import java.io.Serializable;

public class PassengerDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;
	private String address;
	private String phoneNo;
	private String emailAddress;
	private String Ssn;
	private String gender;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getSsn() {
		return Ssn;
	}

	public void setSsn(String ssn) {
		Ssn = ssn;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "PassengerDto [name=" + name + ", address=" + address + ", phoneNo=" + phoneNo + ", emailAddress="
				+ emailAddress + ", Ssn=" + Ssn + ", gender=" + gender + "]";
	}

}
