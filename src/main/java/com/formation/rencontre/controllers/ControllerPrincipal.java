package com.formation.rencontre.controllers;
import java.time.LocalDateTime;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import com.formation.rencontre.entities.Adresse;
import com.formation.rencontre.entities.Apparence;
import com.formation.rencontre.entities.Centre_Interet;
import com.formation.rencontre.entities.Multimedia;
import com.formation.rencontre.entities.Photo;
import com.formation.rencontre.entities.Situation;
import com.formation.rencontre.entities.Utilisateur;
import com.formation.rencontre.services.AdresseService;
import com.formation.rencontre.services.ApparenceService;
import com.formation.rencontre.services.Centre_InteretService;
import com.formation.rencontre.services.MultimediaService;
import com.formation.rencontre.services.PhotoService;
import com.formation.rencontre.services.SituationService;
import com.formation.rencontre.services.UtilisateurService;
@Controller
public class ControllerPrincipal {
	private AdresseService adresseService;
	private ApparenceService apparenceService;
	private Centre_InteretService ciService;
	private MultimediaService mlService;
	private PhotoService photoService;
	private SituationService situationService;
	private UtilisateurService utilisateurService;
	@Autowired	
	@GetMapping("/")
	public String index() {

		return "index";
	}
	public ControllerPrincipal(AdresseService adresseService, ApparenceService apparenceService,
			Centre_InteretService ciService, MultimediaService mlService, PhotoService photoService,
			SituationService situationService, UtilisateurService utilisateurService) {
		super();
		this.adresseService = adresseService;
		this.apparenceService = apparenceService;
		this.ciService = ciService;
		this.mlService = mlService;
		this.photoService = photoService;
		this.situationService = situationService;
		this.utilisateurService = utilisateurService;
	}
	@GetMapping("/formulaire")
	public ModelAndView  formulaire() {
		ModelAndView mav = new ModelAndView("formulaire.html");
		mav.addObject("utilisateur", new Utilisateur());
		mav.addObject("adresse", new Adresse());
		mav.addObject("apparence", new Apparence());
		mav.addObject("centre_interet", new Centre_Interet());
		mav.addObject("multimedia", new Multimedia());
		mav.addObject("photo", new Photo());
		mav.addObject("situation", new Situation());
		return mav;		
	}
	@PostMapping("/formulaire")
    public String postRegister(@Valid @ModelAttribute(value = "utilisateur") Utilisateur utilisateur, BindingResult utilisateurResult,
                               @Valid @ModelAttribute(value = "adresse") Adresse adresse, BindingResult adresseResult,
                               @Valid @ModelAttribute(value = "apparence") Apparence apparence, BindingResult apparenceResult,
                               @Valid @ModelAttribute(value = "situation") Situation situation, BindingResult situationResult,
                               @Valid @ModelAttribute(value = "multimedia") Multimedia multimedia, BindingResult multimediaResult,
                               @Valid @ModelAttribute(value = "photo") Photo photo, BindingResult photoResult,
                               @Valid @ModelAttribute(value = "centre_interet") Centre_Interet centreInteret, BindingResult centre_interetResult,
                               ModelMap model) {
        if (utilisateurResult.hasErrors() || adresseResult.hasErrors() ||
                situationResult.hasErrors() || apparenceResult.hasErrors() ||
                photoResult.hasErrors() || centre_interetResult.hasErrors()) {
                     
            return "formulaire";
        }
        situationService.save(situation);
        utilisateur.setSituation(situation);
        apparenceService.save(apparence);
        utilisateur.setApparence(apparence);
        adresseService.save(adresse);
        utilisateur.setAdresse(adresse);
        utilisateur.setType(1);
        photoService.save(photo);
        photo.setUtilisateur(utilisateur); 
        ciService.save(centreInteret);
        mlService.save(multimedia);
        utilisateurService.save(utilisateur);
        return "connexion";
             
    }	
	public void session(HttpSession httpsession, Utilisateur user)
	{
		String sessionKey="dating";
		httpsession.setAttribute("sessionKey", sessionKey);
		Object time= httpsession.getAttribute(sessionKey);
		if(time==null)
		{
			time= LocalDateTime.now();
			httpsession.setAttribute(sessionKey, time);		
		}
		httpsession.setAttribute("name", sessionKey);
		httpsession.setAttribute("email", user.getEmail());
		httpsession.setAttribute("pseudo", user.getPseudo());
		httpsession.setMaxInactiveInterval(60*30);
	}

}



