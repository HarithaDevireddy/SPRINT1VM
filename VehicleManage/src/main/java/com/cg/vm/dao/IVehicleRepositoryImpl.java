package com.cg.vm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.cg.vm.bean.Customer;
import com.cg.vm.bean.Vehicle;
import com.cg.vm.util.DBUtil;

public class IVehicleRepositoryImpl implements IVehicleRepository {
	
		DBUtil dbUtil = new DBUtil();
		
		EntityManager entityManager = dbUtil.createEntityManager();
		public Vehicle addVehicle(Vehicle v) {
			entityManager.getTransaction().begin();
			entityManager.persist(v);
			entityManager.getTransaction().commit();
			return v;	
			
		}
		public Vehicle updateVehicle(Vehicle v) {
			entityManager.getTransaction().begin();
		     return v;
			
		}
		public Vehicle deleteVehicle(Vehicle v) {
			entityManager.getTransaction().begin();
			entityManager.remove(v);
			entityManager.getTransaction().commit();
			return v;
			
		}
		
		public EntityManager createEntityManager() {
			
			return null;
		}
		public void closeResources() {
			
			
		}
		@Override
		public List<Vehicle> viewAllVehicles() {
			
			entityManager.getTransaction().begin();
			Query query =entityManager.createQuery("from Vehicle");
			@SuppressWarnings("unchecked")
			List<Vehicle> vehicles = query.getResultList();
			for (Vehicle vs :vehicles ) {
				System.out.println(vs.print());
				System.out.println("--------------------------");	
			}
			
			entityManager.getTransaction().commit();
			dbUtil.closeResources();
			
			return vehicles;
		}
	
		
		}
			
		
		
