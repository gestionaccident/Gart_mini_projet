package com.onsr.accidents.managedbeans;


import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;

import org.primefaces.context.RequestContext;

import com.onsr.accidents.business.Poste;
import com.onsr.accidents.business.Utilisateur;
import com.onsr.accidents.dao.Connexion;
import com.onsr.accidents.dao.UtilisateurDAO;



public class Gestion_utilisateur implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	Statement st;
	private Utilisateur util= new Utilisateur ();
	private UtilisateurDAO ud=new UtilisateurDAO(); 
	List<Utilisateur> liste=new ArrayList<Utilisateur>();
	
	
	
	
	
	public List<Utilisateur> getListe() {
		liste=ud.retour();
		return liste;
	}
	public void setListe(List<Utilisateur> liste) {
		this.liste = liste;
	}
	public Utilisateur getUtil() {
		
		return util;
	}
	public void setUtil(Utilisateur util) {
		this.util = util;
	}
	
	public void inserer()
	{
		UtilisateurDAO ut=new UtilisateurDAO();
		if (ut.insert(util)!= 0)
		{

			FacesMessage msg =new FacesMessage(FacesMessage.SEVERITY_WARN,"ajout","Ajout Echoué");
			RequestContext.getCurrentInstance().showMessageInDialog(msg);
			 
			
		}else{ 

			FacesMessage msg =new FacesMessage(FacesMessage.SEVERITY_INFO,"ajout","Ajout Effectué");
			RequestContext.getCurrentInstance().showMessageInDialog(msg);
		}
		
	
	}

	

	
	public void modif()
	{
		UtilisateurDAO ut=new UtilisateurDAO();
		if (ut.modifier(util)!= 0)
		{
			FacesMessage msg =new FacesMessage(FacesMessage.SEVERITY_INFO,"ajout","Ajout Effectué");
			RequestContext.getCurrentInstance().showMessageInDialog(msg);
			 
			
		}else{
			FacesMessage msg =new FacesMessage(FacesMessage.SEVERITY_WARN,"ajout","Ajout Echoué");
			RequestContext.getCurrentInstance().showMessageInDialog(msg); }
		
	
	}
	
	}
	
	


	
	
	

	

