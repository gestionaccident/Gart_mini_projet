package com.onsr.accidents.managedbeans;

import java.io.Serializable;



import java.sql.Statement;

import javax.faces.application.FacesMessage;

import org.primefaces.context.RequestContext;

 

import com.onsr.accidents.dao.*;
import com.onsr.accidents.business.Participant;

 


public class Mbpart implements Serializable  {
	
	
	
	 
		    
	 Participant part=new Participant();
	Connexion cnx=new Connexion();
	Statement st;
	
	
	
	public void inserer(){		
		
		
		
		int x=0;
		try {
			x = st.executeUpdate("insert into participant  values("+part.getIndividu()+"'"+part.getSituation()+"'"+part.getSexe()+"'"+part.getAge()+"'"+part.getMetier()+"'"+part.getDate_permis()+"'"+part.getCeinture()+"'"+part.getCasque() +"'"+part.getCause()+")");
		
		
		
			if (x != 0)
			{
				FacesMessage msg =new FacesMessage(FacesMessage.SEVERITY_INFO,"ajout","oui");
				RequestContext.getCurrentInstance().showMessageInDialog(msg);
				 
				
			}else{
				FacesMessage msg =new FacesMessage(FacesMessage.SEVERITY_WARN,"ajout","non");
				RequestContext.getCurrentInstance().showMessageInDialog(msg); }
			
		}catch (Exception e)
		{
			e.getStackTrace() ;
		}
	}
	
	
	

	
	public Participant getPart() {
		return part;
	}

	public void setPart(Participant part) {
		this.part = part;
	}
	
}
