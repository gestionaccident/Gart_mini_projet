package com.onsr.accidents.business;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the participant database table.
 * 
 */
@Entity
@Table(name="participant")
@NamedQuery(name="Participant.findAll", query="SELECT p FROM Participant p")
public class Participant implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false)
	private int id;

	@Column(nullable=false)
	private int age;

	@Column(nullable=false)
	private boolean casque;

	@Column(nullable=false, length=20)
	private String cause;

	@Column(nullable=false)
	private boolean ceinture;

	@Column(name="date_permis", nullable=false, length=200)
	private String datePermis;

	@Column(nullable=false, length=20)
	private String individu;

	@Column(nullable=false, length=20)
	private String metier;

	@Column(nullable=false, length=20)
	private String sexe;

	@Column(nullable=false, length=20)
	private String situation;

	public Participant() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Object getCasque() {
		return this.casque;
	}

	public void setCasque(boolean casque) {
		this.casque = casque;
	}

	public String getCause() {
		return this.cause;
	}

	public void setCause(String cause) {
		this.cause = cause;
	}

	public Object getCeinture() {
		return this.ceinture;
	}

	public void setCeinture(boolean ceinture) {
		this.ceinture = ceinture;
	}

	public String getDatePermis() {
		return this.datePermis;
	}

	public void setDatePermis(String datePermis) {
		this.datePermis = datePermis;
	}

	public String getIndividu() {
		return this.individu;
	}

	public void setIndividu(String individu) {
		this.individu = individu;
	}

	public String getMetier() {
		return this.metier;
	}

	public void setMetier(String metier) {
		this.metier = metier;
	}

	public String getSexe() {
		return this.sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public String getSituation() {
		return this.situation;
	}

	public void setSituation(String situation) {
		this.situation = situation;
	}

}