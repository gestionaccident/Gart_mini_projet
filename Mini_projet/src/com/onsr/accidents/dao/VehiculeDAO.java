package com.onsr.accidents.dao;

import java.io.Serializable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.onsr.accidents.business.Vehicule;

public class VehiculeDAO implements Serializable  {
	private static final long serialVersionUID = 1L;
	Statement st ;
	Connexion cnx = new Connexion() ;
	
	
public int insert(Vehicule v){
	int a=0;
		try {
   st =cnx.Connection() ;
a=st.executeUpdate( "INSERT INTO vehicule(nb_vehicule,genre_vehicule,nationnalite,prop_vehicule,prob_vehicule,scan_vehicule) VALUES ("+v.getNb_vehicule()+",'"+v.getGenre_vehicule()+"','"+v.getNationnalite()+"','"+v.getProp_vehicule()+"','"+v.getProb_vehicule()+"','"+v.getScan_vehicule()+"')");
        System.out.println("succes");
		} catch (SQLException e) {
			e.getStackTrace();
			  
		}
		return a;
	}


}
