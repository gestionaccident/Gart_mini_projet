package com.onsr.accidents.dao;

import java.io.Serializable;
import java.sql.SQLException;
import java.sql.Statement;

import com.onsr.accidents.business.Participant;


public class ParticipantDAO implements Serializable  {
	
		private static final long serialVersionUID = 1L;
		Statement st ;
		Connexion cnx = new Connexion() ;
		
	
	public int insert(Participant part) {
		int a=0;
		try {
   st =cnx.Connection() ;
a=st.executeUpdate("insert into participant  values("+part.getIndividu()+"'"+"'"+part.getSituation()+"'"+part.getSexe()+"'"+part.getAge()+"'"+part.getMetier()+"'"+part.getDate_permis()+"'"+part.getCeinture()+"'"+part.getCasque() +"'"+part.getCause()+")");
        System.out.println("succes");
		} catch (SQLException e) {
			e.getStackTrace();
			  
		}
		return a;
	}

	}

