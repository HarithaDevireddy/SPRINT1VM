package com.cg.vm.util;


import com.cg.vm.bean.Vehicle;
import com.cg.vm.dao.IVehicleRepository;
import com.cg.vm.dao.IVehicleRepositoryImpl;


public class VehicleMenu extends VMSMainMenu {
	Vehicle vehicle=new Vehicle();
	public void vehiclemenustart() {
	
		
		
		System.out.println("Enter VehicleNumber");
		vehicle.setVehicleNumber(scanner.next());
		System.out.println("Enter type of vehicle CAR/BUS ");
		vehicle.setType(scanner.next());
		System.out.println("Enter category of vehicle AC/ NON AC");
		vehicle.setCategory(scanner.next());
		System.out.println("Enter Location");
		vehicle.setLocation(scanner.next());
		System.out.print("Enter capacity of this vehicle");
		vehicle.setCapacity(scanner.next());
		System.out.println("Enter charges PerKM");
		vehicle.setChargesPerKM(scanner.nextDouble());
		System.out.println("Enter Fixed charges");
		vehicle.setFixedCharges(scanner.nextDouble());
		IVehicleRepository iVehicleRepository = new IVehicleRepositoryImpl();
		Vehicle registerdVehicle = iVehicleRepository.addVehicle(vehicle);
		System.out.println("Vehicle Registered Successfully");
		System.out.println("-----------CHECK VEHICLE DETAILS------");
		System.out.println(registerdVehicle);
	}

}
