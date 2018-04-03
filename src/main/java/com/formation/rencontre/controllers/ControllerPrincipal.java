package com.formation.rencontre.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerPrincipal {
	@GetMapping("/")
	public String index() {

		return "index";
	}

}
