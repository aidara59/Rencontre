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
@Table(name = "adresse")
public class Adresse {
@Id
@Column(name="idadress", unique= true, nullable= false)
@GeneratedValue(strategy=GenerationType.AUTO)	
private int idadress;
@Column(name="code_postal",nullable=false,length=5)
private int code_postal;
@Column(name="num_rue",nullable=false,length=5)
private int num_rue;
@Column(name="ville",nullable=false,length=10)
private String ville;
@Column(name="nom_rue",nullable=false,length=10)
private String nom_rue;
@Column(name="prefixe",nullable=false,length=5)
private String prefixe;
@Column(name="complement",nullable=false,length=10)
private String complement;
@Column(name="type_rue",nullable=false,length=10)
private String type_rue;
@OneToMany
private List<Utilisateur> utilisateur;
public Adresse(int idadress, int code_postal, int num_rue, String ville, String nom_rue, String prefixe,
		String complement, String type_rue, List<Utilisateur> utilisateur) {
	super();
	this.idadress = idadress;
	this.code_postal = code_postal;
	this.num_rue = num_rue;
	this.ville = ville;
	this.nom_rue = nom_rue;
	this.prefixe = prefixe;
	this.complement = complement;
	this.type_rue = type_rue;
	this.utilisateur = utilisateur;
}

@Override
public String toString() {
	return "Adresse [idadress=" + idadress + ", code_postal=" + code_postal + ", num_rue=" + num_rue + ", ville="
			+ ville + ", nom_rue=" + nom_rue + ", prefixe=" + prefixe + ", complement=" + complement + ", type_rue="
			+ type_rue + ", utilisateur=" + utilisateur + "]";
}

public int getIdadress() {
	return idadress;
}

public void setIdadress(int idadress) {
	this.idadress = idadress;
}

public int getCode_postal() {
	return code_postal;
}

public void setCode_postal(int code_postal) {
	this.code_postal = code_postal;
}

public int getNum_rue() {
	return num_rue;
}

public void setNum_rue(int num_rue) {
	this.num_rue = num_rue;
}

public String getVille() {
	return ville;
}

public void setVille(String ville) {
	this.ville = ville;
}

public String getNom_rue() {
	return nom_rue;
}

public void setNom_rue(String nom_rue) {
	this.nom_rue = nom_rue;
}

public String getPrefixe() {
	return prefixe;
}

public void setPrefixe(String prefixe) {
	this.prefixe = prefixe;
}

public String getComplement() {
	return complement;
}

public void setComplement(String complement) {
	this.complement = complement;
}

public String getType_rue() {
	return type_rue;
}

public void setType_rue(String type_rue) {
	this.type_rue = type_rue;
}

public List<Utilisateur> getUtilisateur() {
	return utilisateur;
}

public void setUtilisateur(List<Utilisateur> utilisateur) {
	this.utilisateur = utilisateur;
}

public Adresse() {
	
}

}
