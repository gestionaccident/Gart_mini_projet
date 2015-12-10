package com.onsr.accidents.managedbeans;


import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;

import org.primefaces.context.RequestContext;

import com.onsr.accidents.business.Employe;
import com.onsr.accidents.dao.EmployeDAO;


public class EmployeManagedBean {
int x =0 ;
Employe empl=new Employe();
	
	Employe aff=new Employe();
	public Employe getAff() {
		return aff;
	}




	public void setAff(Employe aff) {
		this.aff = aff;
	}









	List<Employe> employe=new ArrayList<Employe>();
	
	public Employe getEmpl() {
		return empl;
	}




	public void setEmpl(Employe empl) {
		this.empl = empl;
	}




	public List<Employe> getEmploye() {
		
		EmployeDAO empldao=new  EmployeDAO();
		employe=empldao.liste_employe();
		return employe;
	}




	public void setEmploye(List<Employe> employe) {
		this.employe = employe;
	}




	
	
	
	

	public String modif_emp()
	{
		EmployeDAO empdao=new EmployeDAO ();
		 empdao.modifier_employes(aff);
		
		return null;
	}
	
	

	EmployeDAO empdao = new EmployeDAO() ;
	Employe em = new Employe() ;
	
	
	public Employe getEm() {
		return em;
	}



	public void setEm(Employe p) {
		this.em = p;
	}



	public void insert()
	{   x++ ;
		System.out.println("hello");
	    
		if (empdao.insert(em) != 0)
		{
			FacesMessage msg =new FacesMessage(FacesMessage.SEVERITY_INFO,"ajout","Ajout Effectué");
			RequestContext.getCurrentInstance().showMessageInDialog(msg);
			 
			
		}else{
			FacesMessage msg =new FacesMessage(FacesMessage.SEVERITY_WARN,"ajout","Ajout Echoué");
			RequestContext.getCurrentInstance().showMessageInDialog(msg); }
		
	}



	public EmployeDAO getEmpdao() {
		return empdao;
	}



	public void setEmpdao(EmployeDAO ppdao) {
		this.empdao = ppdao;
	}
	
	
	
}
