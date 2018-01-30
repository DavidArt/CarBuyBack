package com.fortech.carbuyback.controller;

import java.util.List;

import com.fortech.carbuyback.entities.AbstractBuyBackEntity;

/**
 * Interface for Vehicle controller class
 * @author david.rus
 *
 */
public interface IVehicleController {

	boolean createVehicle(AbstractBuyBackEntity abstractBuyBackEntity);
	List<AbstractBuyBackEntity> findAllVehicles();
	AbstractBuyBackEntity findVehicleById(String id);
	AbstractBuyBackEntity findVehicleByVin(String vin);
	boolean updateVehicle(AbstractBuyBackEntity abstractBuyBackEntity);
	boolean deleteVehicle(String id);
	
}
