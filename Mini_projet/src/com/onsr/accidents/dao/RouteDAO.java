package com.onsr.accidents.dao;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.onsr.accidents.business.Route;

public class RouteDAO {
	
	EntityTransaction tx;
	public int inserer_route(Route route)
	{
		int res=0;
		try {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Mini_projet");
		EntityManager em = emf.createEntityManager();
		
	
		tx =  em.getTransaction();
		tx.begin();
		 em.persist(route);
         tx.commit();
         res=1;
		} catch (Exception e) {
			
			e.printStackTrace();
			tx.rollback();
		}
		return res;
	}
		
		
	

}
