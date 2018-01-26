package com.fortech.carbuyback.acces;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class Acces {
	
	private static final String PERSISTENCE_UNIT_NAME = "BuyBackEntityManager";
			
	EntityManagerFactory emFactory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
	EntityManager em = emFactory.createEntityManager();

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

}
