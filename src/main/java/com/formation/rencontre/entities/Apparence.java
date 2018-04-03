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
@Table(name = "Apparence")
public class Apparence {
@Id
@Column(name="idapparence", unique= true, nullable= false)
@GeneratedValue(strategy=GenerationType.AUTO)	
private int idapparence;
@Column(name="taille",nullable=false,length=5)
private float taille;
@Column(name="masse",nullable=false,length=5)
private float masse;
@Column(name="yeux",nullable=false,length=10)
private String yeux;
@Column(name="origine",nullable=false,length=10)
private String origine;
@Column(name="type_cheveux",nullable=false,length=10)
private String type_cheveux;
@Column(name="couleur_cheveux",nullable=false,length=10)
private String couleur_cheveux;
@OneToMany
private List<Utilisateur> utilisateurs;
public int getIdapparence() {
	return idapparence;
}
public void setIdapparence(int idapparence) {
	this.idapparence = idapparence;
}
public float getTaille() {
	return taille;
}
public void setTaille(float taille) {
	this.taille = taille;
}
public float getMasse() {
	return masse;
}
public void setMasse(float masse) {
	this.masse = masse;
}
public String getYeux() {
	return yeux;
}
public void setYeux(String yeux) {
	this.yeux = yeux;
}
public String getOrigine() {
	return origine;
}
public void setOrigine(String origine) {
	this.origine = origine;
}
public String getType_cheveux() {
	return type_cheveux;
}
public void setType_cheveux(String type_cheveux) {
	this.type_cheveux = type_cheveux;
}
public String getCouleur_cheveux() {
	return couleur_cheveux;
}
public void setCouleur_cheveux(String couleur_cheveux) {
	this.couleur_cheveux = couleur_cheveux;
}
public List<Utilisateur> getUtilisateurs() {
	return utilisateurs;
}
public void setUtilisateurs(List<Utilisateur> utilisateurs) {
	this.utilisateurs = utilisateurs;
}
public Apparence(int idapparence, float taille, float masse, String yeux, String origine, String type_cheveux,
		String couleur_cheveux, List<Utilisateur> utilisateurs) {
	super();
	this.idapparence = idapparence;
	this.taille = taille;
	this.masse = masse;
	this.yeux = yeux;
	this.origine = origine;
	this.type_cheveux = type_cheveux;
	this.couleur_cheveux = couleur_cheveux;
	this.utilisateurs = utilisateurs;
}

@Override
public String toString() {
	return "Apparence [idapparence=" + idapparence + ", taille=" + taille + ", masse=" + masse + ", yeux=" + yeux
			+ ", origine=" + origine + ", type_cheveux=" + type_cheveux + ", couleur_cheveux=" + couleur_cheveux
			+ ", utilisateurs=" + utilisateurs + "]";
}
public Apparence() {
	
}


}