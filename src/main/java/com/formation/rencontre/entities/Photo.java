package com.formation.rencontre.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.Valid;
@Entity
@Table(name = "Photo")
public class Photo {
@Id
@Column(name="idphoto", unique= true, nullable= false)
@GeneratedValue(strategy=GenerationType.AUTO)		
private Long idphoto;
@Column(length=10)
private String lien;
@Column(length=2)
private Integer note;
@ManyToOne
private Utilisateur utilisateur;
public Long getIdphoto() {
	return idphoto;
}
public void setIdphoto(Long idphoto) {
	this.idphoto = idphoto;
}
public String getLien() {
	return lien;
}
public void setLien(String lien) {
	this.lien = lien;
}
public Integer getNote() {
	return note;
}
public void setNote(Integer note) {
	this.note = note;
}
public Photo(Long idphoto, String lien, Integer note) {
	super();
	this.idphoto = idphoto;
	this.lien = lien;
	this.note = note;
}
@Override
public String toString() {
	return "Photo [idphoto=" + idphoto + ", lien=" + lien + ", note=" + note + "]";
}
public Photo() {
	
}
public static Object values() {
	
	return null;
}
public void setUtilisateur(@Valid Utilisateur utilisateur2) {
	
}


}
