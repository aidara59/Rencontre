package com.formation.rencontre;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.formation.rencontre.services.AdresseService;
import com.formation.rencontre.services.ApparenceService;
import com.formation.rencontre.services.Centre_InteretService;
import com.formation.rencontre.services.MultimediaService;
import com.formation.rencontre.services.PhotoService;
import com.formation.rencontre.services.SituationService;
import com.formation.rencontre.services.UtilisateurService;

@RunWith(SpringRunner.class)
@WebMvcTest
public class RencontreApplicationTests {
	@Autowired // Injection de dépendances
	MockMvc Mockmvc;
	@MockBean
	private AdresseService adresseService;
	@MockBean
	private ApparenceService apparenceService;
	@MockBean
	private Centre_InteretService ciService;
	@MockBean
	private MultimediaService mlService;
	@MockBean
	private PhotoService photoService;
	@MockBean
	private SituationService situationService;
	@MockBean
	private UtilisateurService utilisateurService;
	@Test
	public void index() throws Exception{
		
		this.Mockmvc.perform(get("/"))
		.andExpect(view().name("index"))
		.andExpect(status().isOk())
		.andExpect(content().contentType("text/html;charset=UTF-8"));
		//.andExpect(model().attribute("title", "Dating - Site de rencontre"))
		//.andExpect(content().string(containsString("OlProG 2018")));
	}
	@Test
public void formulaire() throws Exception{
		
		this.Mockmvc.perform(get("/formulaire"))
		//.andExpect(view().name("index"))
		.andExpect(status().isOk());
		//.andExpect(content().contentType("text/html;charset=UTF-8"));
}
}