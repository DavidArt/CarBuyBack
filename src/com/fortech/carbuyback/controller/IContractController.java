package com.fortech.carbuyback.controller;

import java.util.List;

import com.fortech.carbuyback.entities.AbstractBuyBackEntity;

/**
 * Interface for contract controller class
 * @author david.rus
 *
 */
public interface IContractController {
	
	boolean createContract(AbstractBuyBackEntity abstractBuyBackEntity);
	List<AbstractBuyBackEntity> findAllContracts();
	AbstractBuyBackEntity findContractById(String id);
	AbstractBuyBackEntity findContractByNumber(String number);
	AbstractBuyBackEntity findContractByRvg(String contractRvg);
	boolean updateContract(AbstractBuyBackEntity abstractBuyBackEntity);
	boolean deleteContract(String id);
	
}
