package com.salesianostriana.dam.ejemplobucleyswitchmio.productservice;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.salesianostriana.dam.ejemplobucleyswitchmio.model.Producto;

@Service
public class ProductService {

	public List<Producto> getLista() {
		return Arrays.asList(

				new Producto(1, "Motor", "Motor tela de rápido", 99.0),
				new Producto(2, "Motor", "Motor tela de rápido", 99.0),
				new Producto(3, "Motor", "Motor tela de rápido", 99.0),
				new Producto(4, "Motor", "Motor tela de rápido", 99.0));

	}
}
