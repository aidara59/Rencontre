package com.formation.rencontre.repositories;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.formation.rencontre.entities.Utilisateur;
@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, String>{

}
