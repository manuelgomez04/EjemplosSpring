package com.salesianostriana.dam.primerapruebamanuelgomez.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianostriana.dam.primerapruebamanuelgomez.models.Piloto;
import com.salesianostriana.dam.primerapruebamanuelgomez.services.PilotoService;

@Controller
public class PilotoController {

	@Autowired
	private PilotoService pilotoService;

	@GetMapping("/")
	public String lista(Model model) {
		model.addAttribute("pilotos", pilotoService.findAll());
		return "mecanicos";
	}

	@GetMapping("/piloto")
	public String addPiloto(Model model) {
		Piloto piloto = new Piloto();
		model.addAttribute("pilotoForm", piloto);
		return "formulario";
	}

	@PostMapping("/addPiloto")
	public String showPiloto(@ModelAttribute("pilotoForm") Piloto piloto, Model model) {

		model.addAttribute("piloto", piloto);

		pilotoService.agregarBD(piloto);

		return "mecanicos";
	}
}
