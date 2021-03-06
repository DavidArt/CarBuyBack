package com.fortech.carbuyback.acces;
 
import java.util.List;
import javax.persistence.Query;

import com.fortech.carbuyback.entities.AbstractBuyBackEntity;

/**
 * Access class used to persist contract entities to the database
 * @author david.rus
 *
 */
public class ContractAcces extends AbstractBuyBackAcces{
 
	/**
	 * Persist a new contract to the database
	 * @param abstractBuyBackEntity the contract to be persisted
	 * @return true if the entity has been saved top the database
	 */
    public boolean createContract(AbstractBuyBackEntity abstractBuyBackEntity) {
        createEm();
        beginTransaction();
        persistTransaction(abstractBuyBackEntity);
        commitTransaction();
       
        return true;
    }
   
    /**
     * Fetches all contracts from the database
     * @return the list of contracts from the database
     */
    @SuppressWarnings("unchecked")
	public List<AbstractBuyBackEntity> findAllContracts() {
        Query query = createEm().createNamedQuery("getAllContracts");
       
        return (List<AbstractBuyBackEntity>) query.getResultList();
    }
   
    /**
     * Fetches the contract from the database based on the contract id
     * @param id of the contract
     * @return true if the contract is fetched from the database
     */
    public AbstractBuyBackEntity findContractById(String id) {
        Query query = createEm().createNamedQuery("AbstractBuyBackAcces.getContractById");
        query.setParameter("id", id);
       
        return  (AbstractBuyBackEntity) query.getSingleResult();
    }
   
    /**
     * Fetches the contract from the database based on the contract number
     * @param number of the contract
     * @return true if the contract is fetched from the database
     */
    public AbstractBuyBackEntity findContractByNumber(String number) {
        Query query = createEm().createNamedQuery("AbstractBuyBackAcces.getContractByNumber");
        query.setParameter("CONT_NUMBER", number);
       
        return (AbstractBuyBackEntity) query.getSingleResult();
    }
   
    /**
     * Fetches the contract from the database based on the contractRvg
     * @param contractRvg of the contract
     * @return true if the contract is fetched from the database
     */
    public AbstractBuyBackEntity findContractByRvg(String contractRvg) {
        Query query = createEm().createNamedQuery("AbstractBuyBackAcces.getContractByRvg");
        query.setParameter("GET_CONTRACT_BY_RVG", contractRvg);
       
        return (AbstractBuyBackEntity) query.getSingleResult();
    }
   
    /**
     * Updates the contract details
     * @param abstractBuyBackEntity the contract to be updated
     * @return true if contract is updated
     */
    public boolean updateContract(AbstractBuyBackEntity abstractBuyBackEntity) {
    	createEm();
        beginTransaction();
        mergeTransaction(abstractBuyBackEntity);
        commitTransaction();
       
        return true;
    }
   
    /**
     * Deletes a contract from the database
     * @param id the id of the contract to be deleted
     * @return true if contract is deleted
     */
    public boolean deleteContract(String id) {
        createEm();
        beginTransaction();
        AbstractBuyBackEntity abstractBuyBackEntity = findContractById(id);
        remove(abstractBuyBackEntity);
        commitTransaction();
        
        return true;
    }
   
}