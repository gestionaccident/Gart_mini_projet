package com.onsr.accidents.managedbeans;



import javax.faces.application.FacesMessage;

import org.primefaces.context.RequestContext;

import com.onsr.accidents.dao.*;
import com.onsr.accidents.business.Participant;

public class Mbpart {

	private int code;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	Participant part = new Participant();

	public Participant getPart() {
		return part;
	}

	public void setPart(Participant part) {
		this.part = part;
	}

	ParticipantDAO pt = new ParticipantDAO();

	public ParticipantDAO getPt() {
		return pt;
	}

	public void setPt(ParticipantDAO pt) {
		this.pt = pt;
	}

	public String insert() {
		
		
		ParticipantDAO p=new ParticipantDAO();
		p.insert(part);
		System.out.println(part);
                FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "ajout", "Ajout Effectué");
				RequestContext.getCurrentInstance().showMessageInDialog(msg);

		return null;	

	}
	
	
	public String ok() {
		System.out.println("imen");
		return null;
	}
	}
		

