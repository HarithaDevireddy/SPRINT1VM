package com.cg.vm.dao;

import com.cg.vm.bean.Driver;

public interface IDriverRepository {

	Driver addDriver(Driver driver);
	Driver availabledrivers(Driver driver);
	Driver updatedriver(String firstName, String lastName, String address, String contactNumber, String emailId,
			String licenseNo, int Idno);
	Driver deltedriver(int Id);

}
