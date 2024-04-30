package com.salesianostriana.dam.ejemploformulario02manuelgomez.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.salesianostriana.dam.ejemploformulario02manuelgomez.model.Producto;

@Controller
public class ProductoController {

	@Autowired
	private ProductoService service;

	@GetMapping("/producto")
	public String showFormProducto(Model model) {
		Producto producto = new Producto();
		model.addAttribute("productoForm", producto);
		return "formProductos";
	}
}
