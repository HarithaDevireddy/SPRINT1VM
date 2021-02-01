package com.cg.vm.util;
import com.cg.vm.bean.Driver;
import com.cg.vm.dao.IDriverRepositoryImpl;

import java.util.Scanner;
import com.cg.vm.util.*;
import java.util.List;
import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.*;
public class Drivermenu {
	Scanner sc = new Scanner(System.in);
	DBUtil dbUtil = new DBUtil();
	public void drivermenustart() {
	String continueChoice;
	do {
		Driver driver = new Driver();
		System.out.println("5.Add Driver details");
		System.out.println("6.View available Drivers");
		System.out.println("7.View updated list of Drivers");
		System.out.println("8.Delete drivers details");
		System.out.println("0.Exit");
		int adminChoice=sc.nextInt();
		switch(adminChoice) {
		case 5:
			System.out.println("Add Driver details");
			IDriverRepositoryImpl iDriverRepositoryImpl = new IDriverRepositoryImpl();
			iDriverRepositoryImpl.addDriver(driver);
			break;
		case 6:
			System.out.println("Available Drivers");
			IDriverRepositoryImpl iDriverRepositoryImpl1 = new IDriverRepositoryImpl();
			iDriverRepositoryImpl1.availabledrivers(driver);
			break;
		case 7:
			System.out.println("Updated drivers list");
			String firstName,lastName,address,contactNumber,emailId,licenseNo;
			int Idno;
			System.out.println("Enter details you want to update");
			System.out.println("Do you want to change first name");
			{
				if(sc.next().equalsIgnoreCase("yes"))
				{
					System.out.println("Re-enter first name");
					firstName=sc.next();
					driver.setFirstName(firstName);
				}
				else
					firstName="nil";
					
			}
			System.out.println("Do you want to change last name");
			{
				if(sc.next().equalsIgnoreCase("yes"))
				{
					System.out.println("Re-enter last name");
					lastName=sc.next();
					driver.setLastName(lastName);
				}
				else
					lastName="nil";
			}
			System.out.println("Do you want to change address");
			{
				if(sc.next().equalsIgnoreCase("yes"))
				{
					System.out.println("Re-enter address");
					address=sc.next();
					driver.setAddress(address);
				}
				else
					address="nil";
			}
			System.out.println("Do you want to change mobile number");
			{
				if(sc.next().equalsIgnoreCase("yes"))
				{
					System.out.println("Re-enter mobile-number");
					contactNumber=sc.next();
					driver.setContactNumber(contactNumber);
				}
				else
				contactNumber="nil";
			}
			System.out.println("Do you want to change email-id");
			{
				if(sc.next().equalsIgnoreCase("yes"))
				{
					System.out.println("Re-enter email-id");
					emailId=sc.next();
					driver.setEmail(emailId);
				}
				else
					emailId="nil";
			}
			System.out.println("Do you want to change license-no");
			{
				if(sc.next().equalsIgnoreCase("yes"))
				{
					System.out.println("Re-enter license-no");
					licenseNo=sc.next();
					driver.setLicenseNo(licenseNo);
				}
				else
					licenseNo="nil";
			}
			System.out.println("Enter id to be updateted");
			Idno=sc.nextInt();
			IDriverRepositoryImpl iDriverRepositoryImpl2 = new IDriverRepositoryImpl();
			iDriverRepositoryImpl2.updatedriver(firstName, lastName, address, contactNumber, emailId, licenseNo, Idno);
			break;
		case 8:
			System.out.println("Updated list after deletion");
			System.out.println("Enter details you want to delete");
			int Id=sc.nextInt();
			IDriverRepositoryImpl iDriverRepositoryImpl3 = new IDriverRepositoryImpl();
			iDriverRepositoryImpl3. deltedriver(Id);
			break;
		case 0:
			System.exit(0);
			break;
		case 9:
			default :
				System.out.println("Wrong choice");
		
		}
		System.out.print("Do you want to continue [yes/no] with driver details");
		continueChoice = sc.next();
		
		
	}while(continueChoice.equalsIgnoreCase("yes"));
}
}
