package com.salesianostriana.dam.pruebabuenamanuelgomez.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianostriana.dam.pruebabuenamanuelgomez.models.Mecanico;
import com.salesianostriana.dam.pruebabuenamanuelgomez.services.MecanicoService;

@Controller
public class MecanicoController {

	@Autowired
	private MecanicoService mecanicoService;

	@GetMapping("/mecanicos")
	public String mostrarListaMecanicos(Model model) {
		model.addAttribute("listaCompletaMecanicos", mecanicoService.findAll());
		return "mecanicos";
	}

	@GetMapping("/mecanicoFormulario")
	public String adddMecanico(Model model) {
		Mecanico mecanico = new Mecanico();
		model.addAttribute("mecanicoForm", mecanico);
		return "mecanicoForm";
	}

	@PostMapping("/addMecanico")
	public String showMecanico(@ModelAttribute("mecanicoForm") Mecanico mecanico, Model model) {

		// model.addAttribute("piloto", piloto);
		mecanicoService.save(mecanico);

		model.addAttribute("listaCompletaMecanicos", mecanicoService.findAll());

		return "redirect:/mecanicos";
	}

	@GetMapping("/editar/{id}")
	public String editMecanico(@PathVariable("id") Long id, Model model) {

		if (mecanicoService.findById(id).isPresent()) {
			model.addAttribute("mecanicoForm", mecanicoService.findById(id).get());
			return "mecanicoForm";
		} else {
			return "mecanicos";
		}
	}

	@PostMapping("/editar/submit")
	public String procesarFormularioEdicion(@ModelAttribute("mecanicoForm") Mecanico m) {
		mecanicoService.save(m);
		return "redirect:/mecanicos";
	}
	
	@GetMapping("/borrar/{id}")
	public String borrarMecanico (@PathVariable("id") Long id) {
		mecanicoService.deleteById(id);
		return"redirect:/mecanicos";
	}
}
