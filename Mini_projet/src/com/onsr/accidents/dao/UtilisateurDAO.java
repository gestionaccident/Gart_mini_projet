package com.onsr.accidents.dao;

import java.awt.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;




import com.onsr.accidents.business.Utilisateur;


public class UtilisateurDAO {
	Connexion c = new Connexion() ;
	Statement st ;
	
	
	public int insert(Utilisateur util)
	{
		int x = 0 ;
			try {st=c.Connection();
			
				st.executeUpdate("insert into utilisateur values("+util.getCin()+",'"+util.getMot_passe()+"','"+util.getNom()+"','"+util.getPrenom()+"','"+util.getGrade()+ "')");
				x=st.executeUpdate("insert into utilisateur values("+util.getCin()+",'"+util.getMot_passe()+"','"+util.getNom()+"','"+util.getPrenom()+"','"+util.getGrade()+ "')");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return x;
	}
	
	public int modifier(Utilisateur util)
	{	
		int x = 0 ;
			try {st=c.Connection();
				st.executeUpdate("Update utilisateur set  mot_passe='"+util.getMot_passe()+"' ,nom='"+util.getNom()+"' ,prenom='"+util.getPrenom()+"' ,grade='"+util.getGrade()+"' where  cin="+util.getCin());
				x=st.executeUpdate("Update utilisateur set  mot_passe='"+util.getMot_passe()+"' ,nom='"+util.getNom()+"' ,prenom='"+util.getPrenom()+"' ,grade='"+util.getGrade()+"' where  cin="+util.getCin());
			} catch (SQLException e) {
				
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return x;	
	}
	
	public ArrayList<Utilisateur> retour()
	
	{	
		st=c.Connection();
		ArrayList<Utilisateur> liste=new ArrayList<Utilisateur>();
		
		try {
		ResultSet rs=st.executeQuery("select * from utilisateur");
		while(rs.next()){
			
			Utilisateur u=new Utilisateur();
			u.setCin(rs.getInt("cin"));
			u.setMot_passe(rs.getString("mot_passe"));
			u.setNom(rs.getString("nom"));
			u.setPrenom(rs.getString("prenom"));
			u.setGrade(rs.getString("grade"));
	       
			 liste.add(u);}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return liste;
	
}
	
	
	
}
