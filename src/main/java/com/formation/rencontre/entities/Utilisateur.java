package com.formation.rencontre.entities;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;
@Entity
@Table(name = "Utilisateur")
public class Utilisateur {
	@Id
	@Column(unique= true, nullable= false)
	private String email;
	@Column(name="nom",nullable=false,length=25)
	private String nom;
	@Column(name="prenom",nullable=false,length=50)
	private String prenom;
	@Column(name="dateDeNaissance")
	@DateTimeFormat(pattern="YYYY-MM-dd")
	private Date dateDeNaissance;
	@Column(name="sexe",length=1)
	private String sexe;
	@Column(name="motDepasse",nullable=false,length=8)
	private String motDePasse;
	@Column(name="description",nullable=false,length=100)
	private String description;
	@Column(name="pseudo",nullable=false,length=15)
	private String pseudo;
	@Column(name="numerotel",nullable=false,length=10)
	private String numerotel;
	@Column(name="type",nullable=false,length=25)
	private Integer type;
	@ManyToOne
	@JoinColumn(name="adresse")
	private Adresse adresse;
	@ManyToOne
	@JoinColumn(name="situation")
	private Situation situation;
	@OneToMany
	private List<Photo> photo;
	@ManyToOne
	@JoinColumn(name="apparence")
	private Apparence apparence;
	@ManyToMany(mappedBy="utilisateur")
	private List<Centre_Interet> centre_Interet;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Date getDateDeNaissance() {
		return dateDeNaissance;
	}
	public void setDateDeNaissance(Date dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public String getMotDePasse() {
		return motDePasse;
	}
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPseudo() {
		return pseudo;
	}
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	public String getNumerotel() {
		return numerotel;
	}
	public void setNumerotel(String numerotel) {
		this.numerotel = numerotel;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Adresse getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	public Situation getSituation() {
		return situation;
	}
	public void setSituation(Situation situation) {
		this.situation = situation;
	}
	public List<Photo> getPhoto() {
		return photo;
	}
	public void setPhoto(List<Photo> photo) {
		this.photo = photo;
	}
	public Apparence getApparence() {
		return apparence;
	}
	public void setApparence(Apparence apparence) {
		this.apparence = apparence;
	}
	
	
	public List<Centre_Interet> getCentre_Interet() {
		return centre_Interet;
	}
	public void setCentre_Interet(List<Centre_Interet> centre_Interet) {
		this.centre_Interet = centre_Interet;
	}
	@Override
	public String toString() {
		return "Utilisateur [email=" + email + ", nom=" + nom + ", prenom=" + prenom + ", dateDeNaissance="
				+ dateDeNaissance + ", sexe=" + sexe + ", motDePasse=" + motDePasse + ", description=" + description
				+ ", pseudo=" + pseudo + ", numerotel=" + numerotel + ", type=" + type + ", adresse=" + adresse
				+ ", situation=" + situation + ", photo=" + photo + ", apparence=" + apparence + ", centre_Interet="
				+ centre_Interet + "]";
	}
	
	
	
	public Utilisateur(String email, String nom, String prenom, Date dateDeNaissance, String sexe, String motDePasse,
			String description, String pseudo, String numerotel, Integer type, Adresse adresse, Situation situation,
			List<Photo> photo, Apparence apparence, List<Centre_Interet> centre_Interet) {
		super();
		this.email = email;
		this.nom = nom;
		this.prenom = prenom;
		this.dateDeNaissance = dateDeNaissance;
		this.sexe = sexe;
		this.motDePasse = motDePasse;
		this.description = description;
		this.pseudo = pseudo;
		this.numerotel = numerotel;
		this.type = type;
		this.adresse = adresse;
		this.situation = situation;
		this.photo = photo;
		this.apparence = apparence;
		this.centre_Interet = centre_Interet;
	}
	public Utilisateur() {
		
	}
	public static Object values() {
		
		return null;
	}
	public void saveAll() {
		
		
	}

}

