package com.formation.rencontre.services;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formation.rencontre.entities.Photo;
import com.formation.rencontre.repositories.PhotoRepository;

@Service
public class PhotoService {
	private PhotoRepository photorepository;

	@Autowired
	public PhotoService(PhotoRepository photorepository) {
		super();
		this.photorepository = photorepository;
	}
	public void save(Photo photo) {
		photorepository.save(photo);
	}
}
