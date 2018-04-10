package com.formation.rencontre.entities;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.formation.rencontre.services.UtilisateurService;

import junit.framework.Assert;
@RunWith(SpringRunner.class)
@SpringBootTest
public class UtilisateurTest {
	@Autowired
	UtilisateurService utilisateur;
	@Test
	public void findUtilisateurByemail()throws Exception {
		String email ="niangaidara@yahoo.fr";
		Utilisateur sap = Utilisateur.findUtilisateurByemail(email);
		Assert.assertNotNull(sap);
				
	}
}
