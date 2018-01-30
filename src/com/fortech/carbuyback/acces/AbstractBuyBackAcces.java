package com.fortech.carbuyback.acces;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.fortech.carbuyback.entities.AbstractBuyBackEntity;

/**
 * Abstract class used to encapsulate common functionality for Access classes
 * 
 * @author david.rus
 *
 */
public abstract class AbstractBuyBackAcces {
	
	private static final String PERSISTENCE_UNIT_NAME = "BuyBackEntityManager";
	
	private EntityManager em;
	

	/**
	 * Method used to create an EntityManagerFactory
	 * @return an Entity Manager Factory
	 */
	public EntityManagerFactory createEmFactory() {
		return Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
	}
	
	/**
	 * Method used to create an EntityManager
	 * @return an Entity Manager
	 */
	public EntityManager createEm() {
		this.em = createEmFactory().createEntityManager();
		return em;
	}

	/**
	 * Method used to begin a transaction
	 */
	public void beginTransaction() {
		if (em!=null) {
			this.em.getTransaction().begin();
		}
	}
	
	/**
	 * Method used to persist a entity to the database
	 * @param abstractBuyBackEntity the entity to be persisted to the database
	 */
	public void persistTransaction(AbstractBuyBackEntity abstractBuyBackEntity) {
		if (em!=null) {
			this.em.persist(abstractBuyBackEntity);
		}
	}
	
	/**
	 * Method used to commit a transaction
	 */
	public void commitTransaction() {
		if (em!=null) {
			this.em.getTransaction().commit();
		}
	}
	
	/**
	 * Method used to update a transaction in the database
	 * @param abstractBuyBackEntity the entity to be updated in the database
	 */
	public void mergeTransaction(AbstractBuyBackEntity abstractBuyBackEntity) {
		if (em!=null) {
			this.em.merge(abstractBuyBackEntity);
		}
	}
	
	/**
	 * Method used to remove a transaction from the database
	 * @param abstractBuyBackEntity the entity to be removed from the database
	 */
	public void remove(AbstractBuyBackEntity abstractBuyBackEntity) {
		if (em!=null) {
			this.em.remove(abstractBuyBackEntity);
		}
	}

}
