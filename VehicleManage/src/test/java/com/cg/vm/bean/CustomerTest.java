package com.cg.vm.bean;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;



public class CustomerTest {
	Customer customer=new Customer("Haritha","Devireddy","7981814657","haritha@gmail.com","Andhrapradesh");

	 @Before
		public void setup() {
	    	//iCustomerRepository=new  ICustomerRepositoryImpl();
		 
		}
	 @After
	 public void tearDown() {
		 
	 }
	@Test
	public void testGetFirstName() {
		String expected="Haritha";
		String actual=customer.getFirstName();
		assertEquals(expected,actual);
		//fail("Not yet implemented");
	}

	@Test
	public void testGetLastName() {
		String expected="Devireddy";
		String actual=customer.getLastName();
		assertEquals(expected,actual);
		//fail("Not yet implemented");
		
	}

	@Test
	public void testGetMobileNumber() {
		String expected="7981814657";
		String actual=customer.getMobileNumber();
		assertEquals(expected,actual);
		//fail("Not yet implemented");
	}

	@Test
	public void testGetEmailId() {
		String expected="haritha@gmail.com";
		String actual=customer.getEmailId();
		assertEquals(expected,actual);
		//fail("Not yet implemented");
	}

}
