package com.onsr.accidents.managedbeans;

import javax.faces.application.FacesMessage;

import org.primefaces.context.RequestContext;

import com.onsr.accidents.business.Vehicule;
import com.onsr.accidents.dao.VehiculeDAO;

public class MBvehicule {

	private int code;
	public Vehicule getV() {
		return v;
	}
	public void setV(Vehicule v) {
		this.v = v;
	}
	Vehicule v=new Vehicule();
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	VehiculeDAO g=new VehiculeDAO();
	public VehiculeDAO getG() {
		return g;
	}
	public void setG(VehiculeDAO g) {
		this.g = g;
	}
	public void insert()
	{
		if (g.insert(v) != 0)
		{
			FacesMessage msg =new FacesMessage(FacesMessage.SEVERITY_INFO,"ajout","Ajout Effectué");
			RequestContext.getCurrentInstance().showMessageInDialog(msg);
			 
			
		}else{
			FacesMessage msg =new FacesMessage(FacesMessage.SEVERITY_WARN,"ajout","Ajout Echoué");
			RequestContext.getCurrentInstance().showMessageInDialog(msg); }
		
	}
}
