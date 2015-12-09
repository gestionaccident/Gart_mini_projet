package com.onsr.accidents.dao;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.onsr.accidents.business.Route;

public class RouteDAO {
	
	
	public int inserer_route(Route route)
	{
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Mini_projet");
		EntityManager em = emf.createEntityManager();
		
	
		EntityTransaction tx =  em.getTransaction();
		tx.begin();
		 em.persist(route);
         tx.commit();
      System.out.println("ajout cv");
		em.close();
		emf.close();
		
		
		return 0;
		
		
	}

}
