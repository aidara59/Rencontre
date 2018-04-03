package com.formation.rencontre.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.formation.rencontre.entities.Apparence;
@Repository
public interface ApparenceRepository extends JpaRepository<Apparence, Long> {

}
