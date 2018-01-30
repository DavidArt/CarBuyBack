package com.fortech.carbuyback.service;

import java.util.List;

import com.fortech.carbuyback.entities.AbstractBuyBackEntity;

/**
 * Interface for Vehicle service class
 * @author david.rus
 *
 */
public interface IVehicleService {

	boolean createVehicle(AbstractBuyBackEntity abstractBuyBackEntity);
	List<AbstractBuyBackEntity> findAllVehicles();
	AbstractBuyBackEntity findVehicleById(String id);
	AbstractBuyBackEntity findVehicleByVin(String vin);
	boolean updateVehicle(AbstractBuyBackEntity abstractBuyBackEntity);
	boolean deleteVehicle(String id);
	
}
