
package com.onsr.accidents.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.onsr.accidents.business.Accident;

public class AccidentDAO {
	
	public List<Accident> liste_Acci()
	{
		
		EntityManagerFactory emd= Persistence.createEntityManagerFactory("Mini_projet");
		EntityManager emx = emd.createEntityManager();
		
		// 2 : Ouverture transaction 
		EntityTransaction tx =  emx.getTransaction();
		tx.begin();
		List<Accident> list=emx.createNamedQuery("Accident.findAll",Accident.class).getResultList();
		emx.close();
		emd.close();
		return list;
	}
}
