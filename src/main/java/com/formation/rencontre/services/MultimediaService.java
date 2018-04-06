package com.formation.rencontre.services;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formation.rencontre.entities.Multimedia;
import com.formation.rencontre.repositories.MultimediaRepository;

@Service
public class MultimediaService {
	private MultimediaRepository multimediaservice;
	@Autowired
	
	public MultimediaService(MultimediaRepository multimediaservice) {
		super();
		this.multimediaservice = multimediaservice;
	}	
public  void save(Multimedia multimedia) {
	multimediaservice.save(multimedia);	
	}	
}
