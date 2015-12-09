package com.onsr.accidents.managedbeans;

import java.io.Serializable;

import javax.faces.application.FacesMessage;

import org.primefaces.context.RequestContext;

import com.onsr.accidents.business.*;
import com.onsr.accidents.dao.*;




public class ManagedbeanRoute implements Serializable {
	
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private Route route=new Route();


public Route getRoute() {
	return route;
}
public void setRoute(Route route) {
	this.route = route;
}


public String Inserer()
{
	
	
	RouteDAO routedao=new RouteDAO();
	routedao.inserer_route(route);
	
	
	FacesMessage msg =new FacesMessage(FacesMessage.SEVERITY_INFO,"ajout","Ajout Effectué");
	RequestContext.getCurrentInstance().showMessageInDialog(msg);
	return null;
	
	
}


}
