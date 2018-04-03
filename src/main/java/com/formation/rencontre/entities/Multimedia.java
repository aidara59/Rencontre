package com.formation.rencontre.entities;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name = "Multimedia")
public class Multimedia {
@Id
@Column(name="multimedia", unique= true, nullable= false)
@GeneratedValue(strategy=GenerationType.AUTO)			
private int multimedia;
private String typeMultimedia;
private String genre;
private String titre;
private String artiste;
@ManyToMany
private List<Centre_Interet>centre_interet;
public int getMultimedia() {
	return multimedia;
}
public void setMultimedia(int multimedia) {
	this.multimedia = multimedia;
}
public String getTypeMultimedia() {
	return typeMultimedia;
}
public void setTypeMultimedia(String typeMultimedia) {
	this.typeMultimedia = typeMultimedia;
}
public String getGenre() {
	return genre;
}
public void setGenre(String genre) {
	this.genre = genre;
}
public String getTitre() {
	return titre;
}
public void setTitre(String titre) {
	this.titre = titre;
}
public String getArtiste() {
	return artiste;
}
public void setArtiste(String artiste) {
	this.artiste = artiste;
}
public List<Centre_Interet> getCentre_interet() {
	return centre_interet;
}
public void setCentre_interet(List<Centre_Interet> centre_interet) {
	this.centre_interet = centre_interet;
}
public Multimedia(int multimedia, String typeMultimedia, String genre, String titre, String artiste,
		List<Centre_Interet> centre_interet) {
	super();
	this.multimedia = multimedia;
	this.typeMultimedia = typeMultimedia;
	this.genre = genre;
	this.titre = titre;
	this.artiste = artiste;
	this.centre_interet = centre_interet;
}
@Override
public String toString() {
	return "Multimedia [multimedia=" + multimedia + ", typeMultimedia=" + typeMultimedia + ", genre=" + genre
			+ ", titre=" + titre + ", artiste=" + artiste + ", centre_interet=" + centre_interet + "]";
}
public Multimedia() {
	
}


}
