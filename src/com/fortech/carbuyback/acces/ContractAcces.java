package com.fortech.carbuyback.acces;

import javax.persistence.TypedQuery;

import com.fortech.carbuyback.entities.Contract;
import com.fortech.carbuyback.entities.ContractImpl;

public class ContractAcces extends Acces{

	public boolean createContract(Contract contract) {
		em.getTransaction().begin();
		em.persist(contract);
		em.getTransaction().commit();
		
		return true;
	}
	
	public boolean getAllContracts() {
		
		return true;
		
	}
	
	public boolean getContractbyId(String id) {
		TypedQuery<ContractImpl> query = em.createNamedQuery(ContractImpl.GET_CONTRACT_BY_ID, ContractImpl.class);
		query.setParameter("id", id);
		
		return true;
	}
	
	public boolean updateContract(Contract contract) {
		em.getTransaction().begin();
		em.merge(contract);
		em.getTransaction().commit();
		
		return true;
	}
	
	public boolean deleteContract(String id) {
		return true;
	}
}
