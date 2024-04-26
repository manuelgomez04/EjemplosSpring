package com.salesianostriana.dam.ejemploformulario1manuelgomez.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianostriana.dam.ejemploformulario1manuelgomez.model.Empleado;

@Controller
public class EmpleadoController {

	@GetMapping("/empleado")
	public String showForm(Model model) {

		/*
		 * Como necesitamos los datos que queremos rellenar, que en este caso son los
		 * atributos de empleado, debemos instanciar un empleado vacío, añadirlo al
		 * model y devolver la página en la que se encuentra el formulario
		 */
		Empleado empleado = new Empleado();
		model.addAttribute("empleadoForm", empleado);

		return "form";
	}

	@PostMapping("/addEmpleado")
	public String submit(@ModelAttribute("empleadoForm") Empleado empleado, Model model) {
		model.addAttribute("empleado", empleado);
		return "view";
	}

}
