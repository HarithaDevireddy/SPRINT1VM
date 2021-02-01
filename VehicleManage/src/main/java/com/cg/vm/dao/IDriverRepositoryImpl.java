package com.cg.vm.dao;
import java.util.List;
import java.util.Scanner;

import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.vm.bean.Driver;
import com.cg.vm.util.DBUtil;

public class IDriverRepositoryImpl implements IDriverRepository{
	DBUtil dbUtil = new DBUtil();
	EntityManager entityManager = dbUtil.createEntityManager();
    
	@Override
	public Driver addDriver(Driver driver)
	{
		Scanner s = new Scanner(System.in);
		int driverId;
		String firstName,lastName,address,contactNumber,emailId,licenseNo = null;
		System.out.println("----------Enter Driver Details--------------");
			System.out.println("First Name");
			firstName=s.next();
			driver.setFirstName(firstName);
			System.out.println("Last Name");
			lastName=s.next();
			driver.setLastName(lastName);
			System.out.println("Address");
			address=s.next();
			driver.setAddress(address);
			System.out.println("Mobile Number");
			contactNumber=s.next();
			driver.setContactNumber(contactNumber);
			System.out.println("Email-id");
			emailId=s.next();
			driver.setEmail(emailId);
			System.out.println("Licenseno");
			licenseNo=s.next();
			driver.setLicenseNo(licenseNo);
		System.out.println("Successfully Registered");
		entityManager.getTransaction().begin();
		entityManager.persist(driver);
		entityManager.getTransaction().commit();
		dbUtil.closeResources();
		System.out.println(driver);
		return driver;
	}
		@Override
	public Driver updatedriver(String firstName,String lastName,String address,String contactNumber,String emailId,String licenseNo,int Idno)
	{
	 		entityManager.getTransaction().begin();
			Driver driver = entityManager.find(Driver.class, Idno);
			if(!(firstName.equals("nil")))
			driver.setFirstName(firstName);
			if(!(lastName.equals("nil")))
			driver.setLastName(lastName);
			if(!(address.equals("nil")))
			driver.setAddress(address);
			if(!(contactNumber.equals("nil")))
			driver.setContactNumber(contactNumber);
			if(!(emailId.equals("nil")))
			driver.setEmail(emailId);
			if(!(licenseNo.equals("nil")))
			driver.setLicenseNo(licenseNo);
			entityManager.getTransaction().commit();
			return driver;
	}
		@Override
	 	public Driver availabledrivers(Driver driver)
		{
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPA-PU");
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			entityManager.getTransaction().begin();
			Query query =entityManager.createQuery("from Driver");
			List<Driver> users =  query.getResultList();
			for (Driver user : users) {
				System.out.println("FirstName : "+user.getFirstName());
				System.out.println("LastName : "+user.getLastName());
				System.out.println("Contact : "+user.getContactNumber());
				System.out.println("email : "+user.getEmail());
				System.out.println("Address : "+user.getAddress());
				System.out.println("License No :"+user.getLicenseNo());
				System.out.println("-----------------------------");
			}
			
			entityManager.getTransaction().commit();
			entityManager.close();
			entityManagerFactory.close();
			return driver;
		}
		@Override
	 	public Driver deltedriver(int Id)
		{
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPA-PU");
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			entityManager.getTransaction().begin();
		    Driver driver = entityManager.find(Driver.class, Id);
			entityManager.remove(driver);
			entityManager.getTransaction().commit();
			entityManager.close();
			entityManagerFactory.close();
			return driver;
		}
		

	
}
