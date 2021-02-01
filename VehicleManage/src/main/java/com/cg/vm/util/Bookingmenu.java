package com.cg.vm.util;


import java.util.*;
import java.time.LocalDate;

import com.cg.vm.bean.Booking;
import com.cg.vm.dao.IBookingRepositoryImpl;
import com.cg.vm.service.IBookingService;
import com.cg.vm.service.IBookingServiceImpl;

public class Bookingmenu extends VMSMainMenu {
	DBUtil dbUtil=new DBUtil();
	
	Scanner sc = new Scanner(System.in);
	   void bookingmenustart(){
		   System.out.println("Valid user");
			System.out.println("-----Booking Services------");
			System.out.println("1.Book your Vehice");
			System.out.println("2.Cancel Booking");
			System.out.println("3.Update Booking");
			System.out.println("4. View Booking");
			System.out.println("Enter your booking choice");
				int bookingchoice=sc.nextInt();
			switch(bookingchoice) {
			case 1:{
				System.out.println("------Enter your booking details-------");
				Booking booking=new Booking();
				//System.out.println("Enter Booking Id:");
			    //int bookingid = sc.nextInt();
				
			    LocalDate date= LocalDate.now();
			    System.out.println("Your booking from "+date);
			    System.out.println("Enter for no. of Days :");
			    int days = sc.nextInt();
			    System.out.println("Your booking till date");
	            LocalDate tilldate = date.plusDays(days);
	            System.out.println(tilldate);
	            System.out.println("Enter Booking Description :");
	           //String desc = sc.next();
	            //System.out.println("Enter cost per day for the car :");
	            System.out.println("Enter the distance in KM");
	            double distance = sc.nextDouble();
	            double costperday = distance*12;
	            System.out.println("Cost per km for the car is :"+12);
	            double totalCost = costperday * days; 
	            System.out.println("Total cost for "+days+" days " +totalCost);
	            
	            //booking.setBookingId(bookingid);
	            booking.setBookingDate(date);
	            booking.setBookedTillDate(tilldate);
	           // booking.setBookingDescription(desc);
	            booking.setDistance(distance);
	           // booking.setCustomer(customer);
	            IBookingService ibookingservice = new IBookingServiceImpl();
			    ibookingservice.addBooking(booking);
			    break;
	            
			}
			case 2 :
			{   System.out.println("----Enter Booking ID to be deleted-----");
			    int bookingid = sc.nextInt();
				Booking booking = dbUtil.entityManager.find(Booking.class, bookingid);
					if(booking==null)
					{
					System.out.println("Customer detail not found");
					}
					else {	
		        IBookingService ibookingservice = new IBookingServiceImpl();
			    ibookingservice.cancelBooking(booking);
					 }
					break;
			 }
			case 3 : 
			{
				System.out.println("----Enter Booking ID to be updated-----");
			    int bookingid = sc.nextInt();
				Booking booking =dbUtil.entityManager.find(Booking.class, bookingid);
					if(booking==null)
					{
					System.out.println("Customer detail not found");
					}
					else {	
		        IBookingService ibookingservice = new IBookingServiceImpl();
			    ibookingservice.updateBooking(booking);
			    break;
					 }
			}
			}
	   }
}
