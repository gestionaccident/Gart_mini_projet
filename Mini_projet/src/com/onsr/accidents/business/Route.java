package com.onsr.accidents.business;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the route database table.
 * 
 */
@Entity
@Table(name="route")
@NamedQuery(name="Route.findAll", query="SELECT r FROM Route r")
public class Route implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int ID_route;

	@Column(name="autre_type", length=200)
	private String autreType;

	@Column(nullable=false)
	private boolean brouillard;

	@Column(name="chemin_rue", nullable=false, length=200)
	private String cheminRue;

	@Column(name="devant_etab_educ", nullable=false)
	private boolean devantEtabEduc;

	@Column(name="devant_etab_indust", nullable=false)
	private boolean devantEtabIndust;

	@Column(nullable=false)
	private boolean droit;

	@Column(nullable=false, length=400)
	private String éclairage;

	@Column(nullable=false)
	private boolean élevé;

	@Column(name="etat_mal_route", nullable=false)
	private boolean etatMalRoute;

	@Column(name="inter_espace_omran", nullable=false)
	private boolean interEspaceOmran;

	@Column(name="intersec_railroad", nullable=false)
	private boolean intersecRailroad;

	@Column(name="intersec_sans_railroad", nullable=false)
	private boolean intersecSansRailroad;

	@Column(name="`le secteur municipal`", nullable=false, length=200)
	private String le_secteur_municipal;

	@Column(nullable=false)
	private boolean neige;

	@Column(name="non_pavé", nullable=false)
	private boolean nonPavé;

	@Column(name="numero_route", nullable=false, length=200)
	private String numeroRoute;

	@Column(nullable=false)
	private boolean numerotés;

	@Column(name="organis_route", nullable=false, length=200)
	private String organisRoute;

	@Column(nullable=false)
	private boolean pavé;

	@Column(nullable=false)
	private boolean pente;

	@Column(name="point_demonstr", nullable=false, length=200)
	private String pointDemonstr;

	@Column(name="point_kilometrge", nullable=false, length=500)
	private String pointKilometrge;

	@Column(nullable=false)
	private boolean rainy_Météo;

	@Column(name="signe_route", nullable=false, length=200)
	private String signeRoute;

	@Column(name="sous_pont", nullable=false)
	private boolean sousPont;

	@Column(name="sur_pont", nullable=false)
	private boolean surPont;

	@Column(name="surface_route", nullable=false, length=200)
	private String surfaceRoute;

	@Column(name="surface_route_metre", nullable=false, length=200)
	private String surfaceRouteMetre;

	@Column(name="temps_chaud_doux", nullable=false)
	private boolean tempsChaudDoux;

	@Column(name="traveaux_route", nullable=false)
	private boolean traveauxRoute;

	@Column(name="type_route", nullable=false, length=200)
	private String typeRoute;

	@Column(nullable=false)
	private boolean vents;

	@Column(nullable=false)
	private boolean zig;

	public Route() {
	}

	public int getID_route() {
		return this.ID_route;
	}

	public void setID_route(int ID_route) {
		this.ID_route = ID_route;
	}

	public String getAutreType() {
		return this.autreType;
	}

	public void setAutreType(String autreType) {
		this.autreType = autreType;
	}

	public boolean getBrouillard() {
		return this.brouillard;
	}

	public void setBrouillard(boolean brouillard) {
		this.brouillard = brouillard;
	}

	public String getCheminRue() {
		return this.cheminRue;
	}

	public void setCheminRue(String cheminRue) {
		this.cheminRue = cheminRue;
	}

	public boolean getDevantEtabEduc() {
		return this.devantEtabEduc;
	}

	public void setDevantEtabEduc(boolean devantEtabEduc) {
		this.devantEtabEduc = devantEtabEduc;
	}

	public boolean getDevantEtabIndust() {
		return this.devantEtabIndust;
	}

	public void setDevantEtabIndust(boolean devantEtabIndust) {
		this.devantEtabIndust = devantEtabIndust;
	}

	public boolean getDroit() {
		return this.droit;
	}

	public void setDroit(boolean droit) {
		this.droit = droit;
	}

	public String getÉclairage() {
		return this.éclairage;
	}

	public void setÉclairage(String éclairage) {
		this.éclairage = éclairage;
	}

	public boolean getÉlevé() {
		return this.élevé;
	}

	public void setÉlevé(boolean élevé) {
		this.élevé = élevé;
	}

	public boolean getEtatMalRoute() {
		return this.etatMalRoute;
	}

	public void setEtatMalRoute(boolean etatMalRoute) {
		this.etatMalRoute = etatMalRoute;
	}

	public boolean getInterEspaceOmran() {
		return this.interEspaceOmran;
	}

	public void setInterEspaceOmran(boolean interEspaceOmran) {
		this.interEspaceOmran = interEspaceOmran;
	}

	public boolean getIntersecRailroad() {
		return this.intersecRailroad;
	}

	public void setIntersecRailroad(boolean intersecRailroad) {
		this.intersecRailroad = intersecRailroad;
	}

	public boolean getIntersecSansRailroad() {
		return this.intersecSansRailroad;
	}

	public void setIntersecSansRailroad(boolean intersecSansRailroad) {
		this.intersecSansRailroad = intersecSansRailroad;
	}

	public String getLe_secteur_municipal() {
		return this.le_secteur_municipal;
	}

	public void setLe_secteur_municipal(String le_secteur_municipal) {
		this.le_secteur_municipal = le_secteur_municipal;
	}

	public boolean getNeige() {
		return this.neige;
	}

	public void setNeige(boolean neige) {
		this.neige = neige;
	}

	public boolean getNonPavé() {
		return this.nonPavé;
	}

	public void setNonPavé(boolean nonPavé) {
		this.nonPavé = nonPavé;
	}

	public String getNumeroRoute() {
		return this.numeroRoute;
	}

	public void setNumeroRoute(String numeroRoute) {
		this.numeroRoute = numeroRoute;
	}

	public boolean getNumerotés() {
		return this.numerotés;
	}

	public void setNumerotés(boolean numerotés) {
		this.numerotés = numerotés;
	}

	public String getOrganisRoute() {
		return this.organisRoute;
	}

	public void setOrganisRoute(String organisRoute) {
		this.organisRoute = organisRoute;
	}

	public boolean getPavé() {
		return this.pavé;
	}

	public void setPavé(boolean pavé) {
		this.pavé = pavé;
	}

	public boolean getPente() {
		return this.pente;
	}

	public void setPente(boolean pente) {
		this.pente = pente;
	}

	public String getPointDemonstr() {
		return this.pointDemonstr;
	}

	public void setPointDemonstr(String pointDemonstr) {
		this.pointDemonstr = pointDemonstr;
	}

	public String getPointKilometrge() {
		return this.pointKilometrge;
	}

	public void setPointKilometrge(String pointKilometrge) {
		this.pointKilometrge = pointKilometrge;
	}

	public boolean getRainy_Météo() {
		return this.rainy_Météo;
	}

	public void setRainy_Météo(boolean rainy_Météo) {
		this.rainy_Météo = rainy_Météo;
	}

	public String getSigneRoute() {
		return this.signeRoute;
	}

	public void setSigneRoute(String signeRoute) {
		this.signeRoute = signeRoute;
	}

	public boolean getSousPont() {
		return this.sousPont;
	}

	public void setSousPont(boolean sousPont) {
		this.sousPont = sousPont;
	}

	public boolean getSurPont() {
		return this.surPont;
	}

	public void setSurPont(boolean surPont) {
		this.surPont = surPont;
	}

	public String getSurfaceRoute() {
		return this.surfaceRoute;
	}

	public void setSurfaceRoute(String surfaceRoute) {
		this.surfaceRoute = surfaceRoute;
	}

	public String getSurfaceRouteMetre() {
		return this.surfaceRouteMetre;
	}

	public void setSurfaceRouteMetre(String surfaceRouteMetre) {
		this.surfaceRouteMetre = surfaceRouteMetre;
	}

	public boolean getTempsChaudDoux() {
		return this.tempsChaudDoux;
	}

	public void setTempsChaudDoux(boolean tempsChaudDoux) {
		this.tempsChaudDoux = tempsChaudDoux;
	}

	public boolean getTraveauxRoute() {
		return this.traveauxRoute;
	}

	public void setTraveauxRoute(boolean traveauxRoute) {
		this.traveauxRoute = traveauxRoute;
	}

	public String getTypeRoute() {
		return this.typeRoute;
	}

	public void setTypeRoute(String typeRoute) {
		this.typeRoute = typeRoute;
	}

	public boolean getVents() {
		return this.vents;
	}

	public void setVents(boolean vents) {
		this.vents = vents;
	}

	public boolean getZig() {
		return this.zig;
	}

	public void setZig(boolean zig) {
		this.zig = zig;
	}

}