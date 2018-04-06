package com.formation.rencontre.services;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formation.rencontre.entities.Centre_Interet;
import com.formation.rencontre.entities.Situation;
import com.formation.rencontre.repositories.Centre_InteretRepository;

@Service
public class Centre_InteretService {
	private Centre_InteretRepository centre_interet;

	@Autowired
	public Centre_InteretService(Centre_InteretRepository centre_interet) {
		super();
		this.centre_interet = centre_interet;
	}

	public void save(Centre_Interet centreInteret) {
		centre_interet.save(centreInteret);
	}

}
