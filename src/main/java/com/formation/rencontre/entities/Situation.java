package com.formation.rencontre.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "Situation")
public class Situation {
@Id
@Column(name="idsituation", unique= true, nullable= false)
@GeneratedValue(strategy=GenerationType.AUTO)		
private Long idsituation;
@Column(length=10)
private String statutPro;
@Column(length=10)
private String statutPerso;
@Column(length=2)
private Integer nbreEnfant;
@Column(length=10)
private String orientation;
@Column(length=10)
private String fumeur;
@Column(length=10)
private String alcool;
@OneToMany
public List<Utilisateur>utilisateur;
public Long getIdsituation() {
	return idsituation;
}
public void setIdsituation(Long idsituation) {
	this.idsituation = idsituation;
}
public String getStatutPro() {
	return statutPro;
}
public void setStatutPro(String statutPro) {
	this.statutPro = statutPro;
}
public String getStatutPerso() {
	return statutPerso;
}
public void setStatutPerso(String statutPerso) {
	this.statutPerso = statutPerso;
}
public Integer getNbreEnfant() {
	return nbreEnfant;
}
public void setNbreEnfant(Integer nbreEnfant) {
	this.nbreEnfant = nbreEnfant;
}
public String getOrientation() {
	return orientation;
}
public void setOrientation(String orientation) {
	this.orientation = orientation;
}
public String getFumeur() {
	return fumeur;
}
public void setFumeur(String fumeur) {
	this.fumeur = fumeur;
}
public String getAlcool() {
	return alcool;
}
public void setAlcool(String alcool) {
	this.alcool = alcool;
}
public List<Utilisateur> getUtilisateur() {
	return utilisateur;
}
public void setUtilisateur(List<Utilisateur> utilisateur) {
	this.utilisateur = utilisateur;
}
public Situation(Long idsituation, String statutPro, String statutPerso, Integer nbreEnfant, String orientation,
		String fumeur, String alcool, List<Utilisateur> utilisateur) {
	super();
	this.idsituation = idsituation;
	this.statutPro = statutPro;
	this.statutPerso = statutPerso;
	this.nbreEnfant = nbreEnfant;
	this.orientation = orientation;
	this.fumeur = fumeur;
	this.alcool = alcool;
	this.utilisateur = utilisateur;
}
@Override
public String toString() {
	return "Situation [idsituation=" + idsituation + ", statutPro=" + statutPro + ", statutPerso=" + statutPerso
			+ ", nbreEnfant=" + nbreEnfant + ", orientation=" + orientation + ", fumeur=" + fumeur + ", alcool="
			+ alcool + ", utilisateur=" + utilisateur + "]";
}
public Situation() {
	
}
public static Object values() {
	
	return null;
}

}
