package com.formation.rencontre.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.formation.rencontre.entities.Adresse;

@Repository
public interface AdresseRepository extends JpaRepository<Adresse, Long> {

}
