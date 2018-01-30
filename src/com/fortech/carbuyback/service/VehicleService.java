package com.fortech.carbuyback.service;

import java.util.List;

import com.fortech.carbuyback.acces.VehicleAcces;
import com.fortech.carbuyback.entities.AbstractBuyBackEntity;

/**
 * Service class
 * @author david.rus
 *
 */
public class VehicleService implements IVehicleService {
	
	
	private VehicleAcces vehicleAcces;
	
	/**
	 * Persist a new vehicle to the database
	 * @param abstractBuyBackEntity the vehicle to be persisted
	 * @return true if the entity has been saved top the database
	 */
	@Override
	public boolean createVehicle(AbstractBuyBackEntity abstractBuyBackEntity) {
		return vehicleAcces.createVehicle(abstractBuyBackEntity);
	}

	 /**
     * Fetches all vehicles from the database
     * @return the list of vehicles from the database
     */
	@Override
	public List<AbstractBuyBackEntity> findAllVehicles() {
    	return vehicleAcces.findAllVehicles();
    }
	
	/**
     * Fetches the vehicle from the database based on the vehicle id
     * @param id of the vehicle
     * @return true if the vehicle is fetched from the database
     */
	@Override
    public AbstractBuyBackEntity findVehicleById(String id) {
    	return vehicleAcces.findVehicleById(id);
    }
    
    /**
     * Fetches the vehicle from the database based on the vehicle vin
     * @param id of the vehicle
     * @return true if the vehicle is fetched from the database
     */
	@Override
    public AbstractBuyBackEntity findVehicleByVin(String vin) {
    	return vehicleAcces.findVehicleByVin(vin);
    }
    
    /**
     * Updates the vehicle details
     * @param abstractBuyBackEntity the vehicle to be updated
     * @return true if vehicle is updated
     */
	@Override
    public boolean updateVehicle(AbstractBuyBackEntity abstractBuyBackEntity) {
    	return vehicleAcces.updateVehicle(abstractBuyBackEntity);
    }
    
    /**
     * Deletes a vehicle from the database
     * @param id the id of the vehicle to be deleted
     * @return true if vehicle is deleted
     */
	@Override
    public boolean deleteVehicle(String id) {
    	return vehicleAcces.deleteVehicle(id);
    }
    
}
