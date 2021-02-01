package com.cg.vm.bean;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BookingTest {
	Customer customer=new Customer();
	Vehicle vehicle=new Vehicle();
	Booking booking =new Booking();

	 @Before
		public void setup() {
	    	//iCustomerRepository=new  ICustomerRepositoryImpl();
		 
		}
	 @After
	 public void tearDown() {
		 
	 }
	

	 

	@Test
	public void testGetBookingDate() {
		LocalDate expected=LocalDate.of(2021, 1, 1);
		LocalDate actual=booking.getBookingDate();
		assertEquals(expected,actual);
		//fail("Not yet implemented");
	}

	@Test
	public void testGetBookedTillDate() {
		LocalDate expected=LocalDate.of(2021, 1, 2);
		LocalDate actual=booking.getBookedTillDate();
		assertEquals(expected,actual);
		//fail("Not yet implemented");
	}

	@Test
	public void testGetTotalCost() {
		Double expected= 482.00;
		Double actual= booking.getTotalCost();
	     assertEquals(expected,actual);
		
	}

	@Test
	public void testGetDistance() {
		Double expected= 12.00;
		Double actual= booking.getDistance();
	     assertEquals(expected,actual);
	}

}
