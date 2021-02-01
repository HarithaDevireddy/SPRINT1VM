package com.cg.vm.dao;

import java.util.List;


import com.cg.vm.bean.Vehicle;

public interface IVehicleRepository {
	public Vehicle addVehicle(Vehicle v);
	public Vehicle updateVehicle(Vehicle v);
	public Vehicle deleteVehicle(Vehicle v);
	public List<Vehicle> viewAllVehicles();

}
