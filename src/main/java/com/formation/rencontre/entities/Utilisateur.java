package com.formation.rencontre.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Utilisateur")
public class Utilisateur {
	private String email;
	private String nom;
	private String prenom;
	private Date dateDeNaissance;
	private String sexe;
	private String motDePasse;
	private String description;
	private String pseudo;
	private String numerotel;
	private Integer type;

}
