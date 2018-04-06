package com.formation.rencontre.services;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formation.rencontre.entities.Adresse;
import com.formation.rencontre.entities.Apparence;
import com.formation.rencontre.repositories.AdresseRepository;

@Service
public class AdresseService {
	private AdresseRepository adresserepository;
	@Autowired
	public AdresseService(AdresseRepository adresserepository) {
		super();
		this.adresserepository = adresserepository;
	}
	public  void save( Adresse adresse) {		
		adresserepository.save(adresse);
	}	
}
