package com.onsr.accidents.dao;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.Statement;

public class Connexion {
	
	private Statement Connexion;
	
	public Statement Connection()
	{ String unicode= "?useUnicode=yes&characterEncoding=UTF-8";
		
		try {
			Class.forName("com.mysql.jdbc.Driver") ;
			Connection cn= DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_des_accidents"+unicode, "root","") ;
			Connexion = cn.createStatement() ;
		 
		} catch (ClassNotFoundException e1) {
			
			e1.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
			return Connexion;
		
		}
		return Connexion;

		
		
	}

}
