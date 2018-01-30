package com.fortech.carbuyback.acces;

import java.util.List;
import javax.persistence.Query;

import com.fortech.carbuyback.entities.AbstractBuyBackEntity;

/**
 * Access class used to persist vehicle entities to the database
 * @author david.rus
 *
 */

public class VehicleAcces extends AbstractBuyBackAcces {

	/**
	 * Persist a new vehicle to the database
	 * @param abstractBuyBackEntity the vehicle to be persisted
	 * @return true if the entity has been saved top the database
	 */
	public boolean createVehicle(AbstractBuyBackEntity abstractBuyBackEntity) {
	    createEm();
        beginTransaction();
        persistTransaction(abstractBuyBackEntity);
        commitTransaction();
       
        return true;
	}
	
    /**
     * Fetches all vehicles from the database
     * @return the list of vehicles from the database
     */
    @SuppressWarnings("unchecked")
	public List<AbstractBuyBackEntity> findAllVehicles() {
        Query query = createEm().createNamedQuery("AbstractBuyBackAcces.getAllVehicles");
       
        return (List<AbstractBuyBackEntity>) query.getResultList();
    }
    
    /**
     * Fetches the vehicle from the database based on the vehicle id
     * @param id of the vehicle
     * @return true if the vehicle is fetched from the database
     */
    public AbstractBuyBackEntity findVehicleById(String id) {
        Query query = createEm().createNamedQuery("AbstractBuyBackAcces.getVehicleById");
        query.setParameter("id", id);
       
        return  (AbstractBuyBackEntity) query.getSingleResult();
    }
    
    /**
     * Fetches the vehicle from the database based on the vehicle vin
     * @param id of the vehicle
     * @return true if the vehicle is fetched from the database
     */
    public AbstractBuyBackEntity findVehicleByVin(String vin) {
        Query query = createEm().createNamedQuery("AbstractBuyBackAcces.getVehicleByVin");
        query.setParameter("vin", vin);
       
        return  (AbstractBuyBackEntity) query.getSingleResult();
    }
    
    /**
     * Updates the vehicle details
     * @param abstractBuyBackEntity the vehicle to be updated
     * @return true if vehicle is updated
     */
    public boolean updateVehicle(AbstractBuyBackEntity abstractBuyBackEntity) {
    	createEm();
        beginTransaction();
        mergeTransaction(abstractBuyBackEntity);
        commitTransaction();
       
        return true;
    }
   
    /**
     * Deletes a vehicle from the database
     * @param id the id of the vehicle to be deleted
     * @return true if vehicle is deleted
     */
    public boolean deleteVehicle(String id) {
        createEm();
        beginTransaction();
        AbstractBuyBackEntity abstractBuyBackEntity = findVehicleById(id);
        remove(abstractBuyBackEntity);
        commitTransaction();
        
        return true;
    }

}
