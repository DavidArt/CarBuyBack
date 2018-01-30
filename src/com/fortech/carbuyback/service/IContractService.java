package com.fortech.carbuyback.service;

import java.util.List;

import com.fortech.carbuyback.entities.AbstractBuyBackEntity;

/**
 * interface for Contract service class
 * @author david.rus
 *
 */
public interface IContractService {
	
	boolean createContract(AbstractBuyBackEntity abstractBuyBackEntity);
	List<AbstractBuyBackEntity> findAllContracts();
	AbstractBuyBackEntity findContractById(String id);
	AbstractBuyBackEntity findContractByNumber(String number);
	AbstractBuyBackEntity findContractByRvg(String contractRvg);
	boolean updateContract(AbstractBuyBackEntity abstractBuyBackEntity);
	boolean deleteContract(String id);

}
