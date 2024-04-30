package com.salesianostriana.dam.pruebabuenamanuelgomez.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class PilotoController {

	@GetMapping("/pilotos")
	public String showPiloto() {
		return "pilotos";
	}
}
