package com.cg.vm.service;

import java.time.LocalDate;
import java.util.List;

import com.cg.vm.bean.Booking;
import com.cg.vm.bean.Customer;
import com.cg.vm.bean.Driver;
import com.cg.vm.bean.Payment;
import com.cg.vm.bean.Vehicle;
import com.cg.vm.dao.IDriverRepositoryImpl;

public class IDriverServiceImpl implements IDriverService{
	IDriverRepositoryImpl iDriverRepositoryImpl = new IDriverRepositoryImpl();

	@Override
	public Driver addDriver(Driver driver) {
		iDriverRepositoryImpl.addDriver(driver);
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Driver availabledrivers(Driver driver) {
		iDriverRepositoryImpl.availabledrivers(driver);
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Driver updatedriver(String firstName, String lastName, String address, String contactNumber, String emailId,
			String licenseNo, int Idno) {
		iDriverRepositoryImpl.updatedriver(firstName, lastName, address, contactNumber, emailId, licenseNo, Idno);
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Driver deltedriver(int Id) {
		iDriverRepositoryImpl. deltedriver(Id);
		// TODO Auto-generated method stub
		return null;
	}
	

}
