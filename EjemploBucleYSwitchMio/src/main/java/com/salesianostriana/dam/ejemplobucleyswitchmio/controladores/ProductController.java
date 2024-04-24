package com.salesianostriana.dam.ejemplobucleyswitchmio.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.salesianostriana.dam.ejemplobucleyswitchmio.productservice.ProductService;

@Controller

public class ProductController {

	@Autowired
	private ProductService service;

	@GetMapping("/")
	public String controladorProductos(Model model) {
		model.addAttribute("listaProductos", service.getLista());
		return "index";
	}

}