package com.salesianostriana.dam.primerapruebamanuelgomez.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesianostriana.dam.primerapruebamanuelgomez.models.Piloto;
import com.salesianostriana.dam.primerapruebamanuelgomez.repositories.PilotoRepository;
import com.salesianostriana.dam.primerapruebamanuelgomez.service.base.BaseServiceImpl;

@Service
public class PilotoService extends BaseServiceImpl<Piloto, Long, PilotoRepository> {

	@Autowired
	private PilotoRepository pilotoRepository;

	public void agregarBD(Piloto piloto) {
		pilotoRepository.save(piloto);
	}
}
