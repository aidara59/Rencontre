package com.formation.rencontre.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.formation.rencontre.entities.Multimedia;
@Repository
public interface MultimediaRepository extends JpaRepository<Multimedia, Long> {

}
