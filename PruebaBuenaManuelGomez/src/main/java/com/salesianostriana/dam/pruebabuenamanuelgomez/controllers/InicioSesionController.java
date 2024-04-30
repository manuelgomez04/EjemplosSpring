package com.salesianostriana.dam.pruebabuenamanuelgomez.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InicioSesionController {

	@GetMapping("/")
	public String showInicio() {
		return "inicioSesion";
	}
}
