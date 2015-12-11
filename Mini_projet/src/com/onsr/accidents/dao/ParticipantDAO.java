package com.onsr.accidents.dao;

import java.io.Serializable;
import java.sql.Statement;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.onsr.accidents.business.Participant;



public class ParticipantDAO implements Serializable  {
	private EntityManagerFactory emf ;
	private EntityManager em;
		private static final long serialVersionUID = 1L;
		/*	Statement st ;
		Connexion cnx = new Connexion() ;
		
	
	public int insert(Participant part)throws SQLException {
		int a=0;
		
   st =cnx.Connection() ;
a=st.executeUpdate("INSERT INTO participant(individu,situation,sexe,age,metier,date_permis,ceinture,ceinture,casque,cause)values("+part.getIndividu()+",'"+part.getSituation()+"','"+part.getSexe()+"','"+part.getAge()+"','"+part.getMetier()+"','"+part.getDate_permis()+"',"+part.getCeinture()+","+part.getCasque()+",'"+part.getCause()+"')");
        System.out.println("succes");
		
		return a;
	}*/
		public void insert(Participant part){
	emf= Persistence.createEntityManagerFactory("Mini_projet");
		em = emf.createEntityManager();
		EntityTransaction tx =  em.getTransaction();
	tx.begin();
 em.persist(part);
 tx.commit();




	
		}
	
	
	
	

	}