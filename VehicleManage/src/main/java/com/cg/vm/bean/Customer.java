package com.cg.vm.bean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;


@Entity 
@Inheritance(strategy = InheritanceType.JOINED)
public class Customer extends User{
	public Customer(){
		super();
	}
	
	
	public Customer(String firstName, String lastName, String mobileNumber, String emailId, String address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
		this.emailId = emailId;
		this.address = address;
	}


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerId;
	
	private String firstName;
	private String lastName;
	@Column(length = 10)
	private String mobileNumber;
	private String emailId;
	private String address;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
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
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "-------Your Details--------"+ "\n ->Name= " + firstName + lastName
				+ "\n ->mobileNumber= " + mobileNumber + "\n ->emailId= " + emailId + "\n ->address= " + address+super.toString();
	}
	
	public String Print() {
		return "-> Cust Id= "+ customerId + "\n ->Name= " + firstName + lastName
				+ "\n ->mobileNumber= " + mobileNumber + "\n ->emailId= " + emailId + "\n ->address= " + address ;
	}

	
	
}
