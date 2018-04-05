package com.formation.rencontre.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.formation.rencontre.entities.Centre_Interet;
@Repository
public interface Centre_InteretRepository extends JpaRepository<Centre_Interet, Long> {

}
