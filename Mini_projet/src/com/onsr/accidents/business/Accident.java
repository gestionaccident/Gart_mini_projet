package com.onsr.accidents.business;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the accident database table.
 * 
 */
@Entity
@NamedQuery(name="Accident.findAll", query="SELECT a FROM Accident a")

public class Accident implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Temporal(TemporalType.DATE)
	@Column(name="`date-accident`")
	private Date date_accident;

	private String gouvernaurat;

	private int heure;

	@Column(name="nombre_de_victime")
	private int nombreDeVictime;

	@Column(name="`num-mahdher`")
	private int num_mahdher;

	private int route;

	@Column(name="type_accident")
	private String typeAccident;

	private String ville;

	@Column(name="`zone-geographique`")
	private String zone_geographique;

	public Accident() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate_accident() {
		return this.date_accident;
	}

	public void setDate_accident(Date date_accident) {
		this.date_accident = date_accident;
	}

	public String getGouvernaurat() {
		return this.gouvernaurat;
	}

	public void setGouvernaurat(String gouvernaurat) {
		this.gouvernaurat = gouvernaurat;
	}

	public int getHeure() {
		return this.heure;
	}

	public void setHeure(int heure) {
		this.heure = heure;
	}

	public int getNombreDeVictime() {
		return this.nombreDeVictime;
	}

	public void setNombreDeVictime(int nombreDeVictime) {
		this.nombreDeVictime = nombreDeVictime;
	}

	public int getNum_mahdher() {
		return this.num_mahdher;
	}

	public void setNum_mahdher(int num_mahdher) {
		this.num_mahdher = num_mahdher;
	}

	public int getRoute() {
		return this.route;
	}

	public void setRoute(int route) {
		this.route = route;
	}

	public String getTypeAccident() {
		return this.typeAccident;
	}

	public void setTypeAccident(String typeAccident) {
		this.typeAccident = typeAccident;
	}

	public String getVille() {
		return this.ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getZone_geographique() {
		return this.zone_geographique;
	}

	public void setZone_geographique(String zone_geographique) {
		this.zone_geographique = zone_geographique;
	}

}