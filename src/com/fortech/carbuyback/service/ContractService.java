package com.fortech.carbuyback.service;

import java.util.List;

import com.fortech.carbuyback.acces.ContractAcces;
import com.fortech.carbuyback.entities.AbstractBuyBackEntity;

/**
 * Service class
 * @author david.rus
 *
 */
public class ContractService implements IContractService {

	
	private ContractAcces contractAcces;
	
	/**
	 * Persist a new contract to the database
	 * @param abstractBuyBackEntity the contract to be persisted
	 * @return true if the entity has been saved top the database
	 */
	@Override
	public boolean createContract(AbstractBuyBackEntity abstractBuyBackEntity) {
		return contractAcces.createContract(abstractBuyBackEntity);
	}
	
    /**
     * Fetches all contracts from the database
     * @return the list of contracts from the database
     */
	@Override
	public List<AbstractBuyBackEntity> findAllContracts() {
		return contractAcces.findAllContracts();
	}
	
    /**
     * Fetches the contract from the database based on the contract id
     * @param id of the contract
     * @return true if the contract is fetched from the database
     */
	@Override
	public AbstractBuyBackEntity findContractById(String id) {
		return contractAcces.findContractById(id);
	}
	
    /**
     * Fetches the contract from the database based on the contract number
     * @param number of the contract
     * @return true if the contract is fetched from the database
     */
	@Override
    public AbstractBuyBackEntity findContractByNumber(String number) {
    	return contractAcces.findContractByNumber(number);
    }
    
    /**
     * Fetches the contract from the database based on the contractRvg
     * @param contractRvg of the contract
     * @return true if the contract is fetched from the database
     */
	@Override
    public AbstractBuyBackEntity findContractByRvg(String contractRvg) {
    	return contractAcces.findContractByRvg(contractRvg);
    }
    
    /**
     * Updates the contract details
     * @param abstractBuyBackEntity the contract to be updated
     * @return true if contract is updated
     */
	@Override
    public boolean updateContract(AbstractBuyBackEntity abstractBuyBackEntity) {
    	return contractAcces.updateContract(abstractBuyBackEntity);
    }
    
    /**
     * Deletes a contract from the database
     * @param id the id of the contract to be deleted
     * @return true if contract is deleted
     */
	@Override
    public boolean deleteContract(String id) {
    	return contractAcces.deleteContract(id);
    }
    
}
