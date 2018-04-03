package com.formation.rencontre.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.formation.rencontre.entities.Situation;
@Repository
public interface SituationRepository extends JpaRepository<Situation, Long> {

}
