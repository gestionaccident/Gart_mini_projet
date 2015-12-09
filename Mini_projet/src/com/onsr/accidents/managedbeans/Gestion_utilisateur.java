package com.onsr.accidents.managedbeans;


import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.onsr.accidents.business.Utilisateur;
import com.onsr.accidents.dao.UtilisateurDAO;



public class Gestion_utilisateur implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	Statement st;
	private Utilisateur util= new Utilisateur ();
	public Utilisateur getUtil() {
		return util;
	}
	public void setUtil(Utilisateur util) {
		this.util = util;
	}
	
	public void inserer()
	{
		UtilisateurDAO ut=new UtilisateurDAO();
		ut.insert(util);
	
	}
	
	public void modif()
	{
		UtilisateurDAO ut=new UtilisateurDAO();
		ut.modifier(util);
	
	}
	
}
	
	


	
	
	

	

