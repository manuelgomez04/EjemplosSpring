package com.salesianostriana.dam.ejemploformulariomiomanuelgomez.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianostriana.dam.ejemploformulariomiomanuelgomez.model.Piloto;

@Controller
public class PilotoController {

	@GetMapping("/pilotos")
	public String showForm(Model model) {
		Piloto piloto = new Piloto();
		model.addAttribute("pilotoForm", piloto);
		return "prueba";

	}

	@PostMapping("/addPiloto")
	public String showPiloto(@ModelAttribute("pilotoForm") Piloto piloto, Model model) {
		model.addAttribute("piloto", piloto);
		return "pilotos";
	}
}
