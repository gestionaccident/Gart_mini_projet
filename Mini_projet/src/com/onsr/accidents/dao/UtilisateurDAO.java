package com.onsr.accidents.dao;

import java.sql.SQLException;

import java.sql.Statement;

import com.onsr.accidents.business.Utilisateur;


public class UtilisateurDAO {
	Connexion c = new Connexion() ;
	Statement st ;
	
	public String insert(Utilisateur util)
	{
			try {st=c.Connection();
			
				st.executeUpdate("insert into utilisateur values("+util.getCin()+",'"+util.getMot_passe()+"','"+util.getNom()+"','"+util.getPrenom()+"','"+util.getGrade()+ "')");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
	}
	
	public String modifier(Utilisateur util)
	{	
			try {st=c.Connection();
				st.executeUpdate("Update utilisateur set  mot_passe='"+util.getMot_passe()+"' ,nom='"+util.getNom()+"' ,prenom='"+util.getPrenom()+"' ,grade='"+util.getGrade()+"' where  cin="+util.getCin());
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
			
			
	}
	
}
