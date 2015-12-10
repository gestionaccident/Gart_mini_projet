package com.onsr.accidents.managedbeans;

import java.io.Serializable;
import java.sql.SQLException;
import java.sql.Statement;

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

	public void insert() {
		try {
			if (pt.insert(part) != 0) {
				FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "ajout", "Ajout Effectué");
				RequestContext.getCurrentInstance().showMessageInDialog(msg);

			}
			/*
			 * else{ FacesMessage msg =new
			 * FacesMessage(FacesMessage.SEVERITY_WARN,"ajout","Ajout Echoué");
			 * RequestContext.getCurrentInstance().showMessageInDialog(msg); }
			 */
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "ajout",
					"Ajout Echoué: " + e.getMessage());
			RequestContext.getCurrentInstance().showMessageInDialog(msg);
		}

	}
}
