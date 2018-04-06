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
@Table(name = "Centre_Interet")
public class Centre_Interet {
@Id
@Column(name="idinteret", unique= true, nullable= false)
@GeneratedValue(strategy=GenerationType.AUTO)		
private Long idinteret;
@Column(name="sport",nullable=false,length=10)
private String sport;
@Column(name="loisir",nullable=false,length=10)
private String loisir;
@ManyToMany
private List<Utilisateur> utilisateur;
@ManyToMany(mappedBy="centre_interet")
private List<Multimedia>multimedia;
public Long getIdinteret() {
	return idinteret;
}
public void setIdinteret(Long idinteret) {
	this.idinteret = idinteret;
}
public String getSport() {
	return sport;
}
public void setSport(String sport) {
	this.sport = sport;
}
public String getLoisir() {
	return loisir;
}
public void setLoisir(String loisir) {
	this.loisir = loisir;
}
public Centre_Interet(Long idinteret, String sport, String loisir) {
	super();
	this.idinteret = idinteret;
	this.sport = sport;
	this.loisir = loisir;
}
@Override
public String toString() {
	return "Centre_Interet [idinteret=" + idinteret + ", sport=" + sport + ", loisir=" + loisir + "]";
}
public Centre_Interet() {
	
}
public static Object values() {
	
	return null;
}

}
