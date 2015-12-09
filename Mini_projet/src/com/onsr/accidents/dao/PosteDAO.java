package com.onsr.accidents.dao;

import java.io.Serializable;




import com.onsr.accidents.business.*;
import com.onsr.accidents.dao.Connexion;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;

import org.primefaces.context.RequestContext;

public class PosteDAO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	Connexion c = new Connexion() ;
	Statement stm ;
	
	public int insert(Poste p)
	{  System.out.println("hello DAO") ;
	 int x = 0 ;
		try {
			stm = c.Connection() ;
			System.out.println("connexion réussi"+p.getCodep()) ;
			String req="insert into poste values ("+p.getCodep()+",'"+p.getVille()+"','"+p.getCite()+"','"+p.getProvince()+"',"+p.getNbremp()+",'"+p.getPrespos()+"','"+p.getDate()+"');" ;
			x=stm.executeUpdate(req) ;
			
			System.out.println("execution du requete") ;
			
		}catch (Exception e)
		{
			e.getStackTrace() ;
		}
		return x ;
	}
	public int modifier(Poste p)
	{ 
	 int x = 0 ;
		try {
			stm = c.Connection() ;
			String req="update poste set ville='"+p.getVille()+"',cite='"+p.getCite()+"',province='"+p.getProvince()+
					"',nbre_employe="+p.getNbremp()+",pres_Poste='"+p.getPrespos()+"',date='"+p.getDate()+"' where code_poste="+p.getCodep() ;
			x=stm.executeUpdate(req) ;
			System.out.println("la requete a été execute") ;
			
		}catch (Exception e)
		{
			e.getStackTrace() ;
		}
		return x ;
	}
	public List<Poste> cont(){
		stm = c.Connection() ;
		List<Poste>four= new ArrayList<Poste>();
		ResultSet res;
		try {
			res = stm.executeQuery("select * from poste");
			while(res.next()){
				Poste a=new Poste();
				a.setCodep(res.getInt("code_poste"));
				a.setVille(res.getString("ville"));
				a.setCite(res.getString("cite"));
				a.setProvince(res.getString("province"));
				a.setNbremp(res.getInt("nbre_employe"));
				a.setPrespos(res.getString("pres_poste"));
				a.setDate(res.getString("date"));
				four.add(a);
		}} catch (SQLException e) {
			e.printStackTrace();
		}
return four;
	}
	
}
