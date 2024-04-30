package com.salesianostriana.dam.pruebabuenamanuelgomez.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianostriana.dam.pruebabuenamanuelgomez.models.Mecanico;
import com.salesianostriana.dam.pruebabuenamanuelgomez.services.MecanicoService;

@Controller
public class MecanicoController {

	@Autowired
	private MecanicoService mecanicoService;

	@GetMapping("/mecanico")
	public String lista(Model model) {
		model.addAttribute("listaCompleta", mecanicoService.findAll());
		return "mecanicos";
	}

	@GetMapping("/mecanicos")
	public String adddMecanico(Model model) {
		Mecanico mecanico = new Mecanico();
		model.addAttribute("mecanicoForm", mecanico);
		return "formulario";
	}

	@PostMapping("/addMecanico")
	public String showMecanico(@ModelAttribute("mecanicoForm") Mecanico mecanico, Model model) {

		// model.addAttribute("piloto", piloto);
		mecanicoService.save(mecanico);

		model.addAttribute("listaCompleta", mecanicoService.findAll());

		return "mecanicos";
	}
}