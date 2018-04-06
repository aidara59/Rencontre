package com.formation.rencontre.services;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.formation.rencontre.entities.Situation;
import com.formation.rencontre.repositories.SituationRepository;
@Service
public class SituationService {
private SituationRepository sitautionrepository;
@Autowired
public SituationService(SituationRepository sitautionrepository) {
	super();
	this.sitautionrepository = sitautionrepository;
}
	public  void save(Situation situation) {
		sitautionrepository.save(situation);		
	}



}
