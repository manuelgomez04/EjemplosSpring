package com.salesianostriana.dam.pruebabuenamanuelgomez.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CocheController {

	@GetMapping("/coches")
	public String showCoches() {
		return "coches";
	}
}
