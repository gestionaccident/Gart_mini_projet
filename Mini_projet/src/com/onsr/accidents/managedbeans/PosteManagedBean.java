package com.onsr.accidents.managedbeans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;

import org.primefaces.context.RequestContext;

import com.onsr.accidents.business.Poste;
import com.onsr.accidents.dao.*;
public class PosteManagedBean {
	
	PosteDAO ap = new PosteDAO() ;
	Poste p = new Poste() ;
	
	
	public Poste getP() {
		return p;
	}
	public void setP(Poste p) {
		this.p = p;
	}
List<Poste> liste=new ArrayList<Poste>();

	public List<Poste> getListe() {
	liste=ap.cont();
	return liste;
}
	int code;
public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
public void setListe(List<Poste> liste) {
	this.liste = liste;
}
	public void insert()
	{System.out.println("hello managed bean") ;
		if (ap.insert(p) != 0)
		{
			FacesMessage msg =new FacesMessage(FacesMessage.SEVERITY_INFO,"ajout","Ajout Effectué");
			RequestContext.getCurrentInstance().showMessageInDialog(msg);
			 
			
		}else{
			FacesMessage msg =new FacesMessage(FacesMessage.SEVERITY_WARN,"ajout","Ajout Echoué");
			RequestContext.getCurrentInstance().showMessageInDialog(msg); }
		
	}

	public void modif()
	{
		if (ap.modifier(p) != 0)
		{
			FacesMessage msg =new FacesMessage(FacesMessage.SEVERITY_INFO,"modif","Modification Effectué");
			RequestContext.getCurrentInstance().showMessageInDialog(msg);
			 
			
		}else{
			FacesMessage msg =new FacesMessage(FacesMessage.SEVERITY_WARN,"modif","Modification Echoué");
			RequestContext.getCurrentInstance().showMessageInDialog(msg); }
		
	}

	public PosteDAO getAp() {
		return ap;
	}



	public void setAp(PosteDAO ap) {
		this.ap = ap;
	}
	

}
