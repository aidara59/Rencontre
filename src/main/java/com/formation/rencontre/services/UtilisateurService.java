package com.formation.rencontre.services;
import java.util.Date;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.formation.rencontre.entities.Utilisateur;
import com.formation.rencontre.repositories.UtilisateurRepository;
@Service
public class UtilisateurService {
	private  UtilisateurRepository utilisateurRepository;
    @Autowired
    public UtilisateurService(UtilisateurRepository utilisateurRepository) {
        this.utilisateurRepository = utilisateurRepository;
    }
    public  Utilisateur save(Utilisateur utilisateur){
    	return utilisateurRepository.save(utilisateur);}
    public Utilisateur findUtilisateur(String email){
    	return utilisateurRepository.getOne(email);}
}

