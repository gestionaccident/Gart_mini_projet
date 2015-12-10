package com.onsr.accidents.dao;

import java.io.Serializable;
import java.sql.Statement;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.onsr.accidents.business.Employe;
import com.onsr.accidents.business.Poste;

/**
 * @author Sirine
 *
 */
public class EmployeDAO implements Serializable{
	

	Connexion c = new Connexion() ;
	Statement stm ;
	
	public int insert(Employe e)
	{  
	 int x = 0 ;
		try {
			
			
			stm = c.Connection() ;
			
			System.out.println("cin"+e.getCin()+"-id"+e.getId()) ;
			String req="insert into employe (nom,prenom,cin,sexe,datenaiss,adresse,grade,situationfam) values ('"+e.getNom()+"','"+e.getPrenom()+"',"+e.getCin()+",'"+e.getSexe()+"','"+e.getDatenaiss()+"','"+e.getAdresse()+"','"+e.getGrade()+"','"+e.getSituationfam()+"');" ;
			x=stm.executeUpdate(req) ;
			System.out.println("execution du requete") ;
			
		}catch (Exception ex)
		{
			ex.getStackTrace() ;
			ex.getMessage() ;
		}
		return x ;
	}
	
	public int modifier_employes(Employe employe)
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Mini_projet");
				EntityManager em = emf.createEntityManager();
				
				// 2 : Ouverture transaction 
EntityTransaction tx =  em.getTransaction();
				
				
		
		
		tx.begin();
		 
		 em.merge(employe);
		 tx.commit();
		
		
		
		return 0;
		
		
		
		
	}
	
	public List<Employe> liste_employe()
	{
		
		EntityManagerFactory emd= Persistence.createEntityManagerFactory("Mini_projet");
		EntityManager emx = emd.createEntityManager();
		
		// 2 : Ouverture transaction 
		EntityTransaction tx =  emx.getTransaction();
		tx.begin();
		List <Employe> list=emx.createNamedQuery("Employe.findAll", Employe.class).getResultList();
		emx.close();
		emd.close();
		return list;
	}

	
	
	
	
	
	


}
