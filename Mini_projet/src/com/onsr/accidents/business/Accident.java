package com.onsr.accidents.business;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the accident database table.
 * 
 */
@Entity
@Table(name="accident")
@NamedQuery(name="Accident.findAll", query="SELECT a FROM Accident a")
public class Accident implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int id;

	@Temporal(TemporalType.DATE)
	@Column(name="`date-accident`", nullable=false)
	private Date date_accident;

	@Column(nullable=false, length=20)
	private String gouvernaurat;

	@Column(nullable=false)
	private int heure;

	@Column(name="id_participant", nullable=false)
	private int idParticipant;

	@Column(name="id_vehicule", nullable=false)
	private int idVehicule;

	@Column(name="nombre_de_victime", nullable=false)
	private int nombreDeVictime;

	@Column(name="`num-mahdher`", nullable=false)
	private int num_mahdher;

	@Column(nullable=false)
	private int route;

	@Column(name="type_accident", nullable=false, length=50)
	private String typeAccident;

	@Column(nullable=false, length=20)
	private String ville;

	@Column(name="`zone-geographique`", nullable=false, length=20)
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

	public int getIdParticipant() {
		return this.idParticipant;
	}

	public void setIdParticipant(int idParticipant) {
		this.idParticipant = idParticipant;
	}

	public int getIdVehicule() {
		return this.idVehicule;
	}

	public void setIdVehicule(int idVehicule) {
		this.idVehicule = idVehicule;
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