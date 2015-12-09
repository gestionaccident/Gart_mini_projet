package com.onsr.accidents.business;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the employe database table.
 * 
 * *****
 */




@Entity
@Table(name="employe")
@NamedQuery(name="Employe.findAll", query="SELECT e FROM Employe e")
public class Employe implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(nullable=false, length=50)
	private String adresse;

	@Column(nullable=false)
	private int cin;

	@Column(nullable=false, length=30)
	private String datenaiss;

	@Column(nullable=false, length=20)
	private String grade;

	@Column(nullable=false, length=20)
	private String nom;

	@Column(nullable=false, length=20)
	private String prenom;

	@Column(nullable=false, length=10)
	private String sexe;

	@Column(nullable=false, length=20)
	private String situationfam;

	public Employe() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdresse() {
		return this.adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getCin() {
		return this.cin;
	}

	public void setCin(int cin) {
		this.cin = cin;
	}

	public String getDatenaiss() {
		return this.datenaiss;
	}

	public void setDatenaiss(String datenaiss) {
		this.datenaiss = datenaiss;
	}

	public String getGrade() {
		return this.grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getSexe() {
		return this.sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public String getSituationfam() {
		return this.situationfam;
	}

	public void setSituationfam(String situationfam) {
		this.situationfam = situationfam;
	}

}