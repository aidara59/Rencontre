package com.formation.rencontre.services;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.formation.rencontre.entities.Apparence;
import com.formation.rencontre.repositories.ApparenceRepository;
@Service
public class ApparenceService {
	private ApparenceRepository apparencerepository;
	@Autowired
	public ApparenceService(ApparenceRepository apparencerepository) {
		super();
		this.apparencerepository = apparencerepository;
	}
	public void save(Apparence apparence) {
		apparencerepository.save(apparence);
	}
}
