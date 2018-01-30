package com.fortech.carbuyback.controller;

import java.util.List;

import com.fortech.carbuyback.entities.AbstractBuyBackEntity;
import com.fortech.carbuyback.service.IVehicleService;

/**
 * Controller class
 * @author david.rus
 *
 */
public class VehicleController implements IVehicleController{

	private IVehicleService vehicleService;
	
	/**
	 * Persist a new vehicle to the database
	 * @param abstractBuyBackEntity the vehicle to be persisted
	 * @return true if the entity has been saved top the database
	 */
	@Override
	public boolean createVehicle(AbstractBuyBackEntity abstractBuyBackEntity) {
		return vehicleService.createVehicle(abstractBuyBackEntity);
	}

	 /**
     * Fetches all vehicles from the database
     * @return the list of vehicles from the database
     */
	@Override
	public List<AbstractBuyBackEntity> findAllVehicles() {
    	return vehicleService.findAllVehicles();
    }
	
	/**
     * Fetches the vehicle from the database based on the vehicle id
     * @param id of the vehicle
     * @return true if the vehicle is fetched from the database
     */
	@Override
    public AbstractBuyBackEntity findVehicleById(String id) {
    	return vehicleService.findVehicleById(id);
    }
    
    /**
     * Fetches the vehicle from the database based on the vehicle vin
     * @param id of the vehicle
     * @return true if the vehicle is fetched from the database
     */
	@Override
    public AbstractBuyBackEntity findVehicleByVin(String vin) {
    	return vehicleService.findVehicleByVin(vin);
    }
    
    /**
     * Updates the vehicle details
     * @param abstractBuyBackEntity the vehicle to be updated
     * @return true if vehicle is updated
     */
	@Override
    public boolean updateVehicle(AbstractBuyBackEntity abstractBuyBackEntity) {
    	return vehicleService.updateVehicle(abstractBuyBackEntity);
    }
    
    /**
     * Deletes a vehicle from the database
     * @param id the id of the vehicle to be deleted
     * @return true if vehicle is deleted
     */
	@Override
    public boolean deleteVehicle(String id) {
    	return vehicleService.deleteVehicle(id);
    }
    	
}
