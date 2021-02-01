package com.cg.vm.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Driver {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int driverId;
	private String firstName;
	private String lastName;
	private String contactNumber;
	private String email;
	private String address;
	private double chargesPerDay;
	private String licenseNo;
	public int getDriverId() {
		return driverId;
	}
	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getChargesPerDay() {
		return chargesPerDay;
	}
	public void setChargesPerDay(double chargesPerDay) {
		this.chargesPerDay = chargesPerDay;
	}
	public String getLicenseNo() {
		return licenseNo;
	}
	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}
	
	@Override
	public String toString() {
		return "-----Driver Details----- \n driverId=" + driverId + " \n firstName=" + firstName + ", \n lastName=" + lastName
				+ "\n contactNumber=" + contactNumber + "\n email=" + email + "\n address=" + address + 
				  "\n licenseNo=" + licenseNo + "]";
	}	
	
}
