package com.salesianostriana.dam.ejemplofragmentosmanuelgomez.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/")
	public String index() {
		return "index";
	}

	@GetMapping("/otra")
	public String otra(Model model) {
		model.addAttribute("mensaje", "este es un mensaje en una cadena de caracteres");

		return "otraPagina";
	}
}
