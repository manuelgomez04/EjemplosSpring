package com.salesianostriana.dam.ejemplobucleyswitchmio.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Producto {

	private long id;
	private String nombre;
	private String descripcion;
	private double precio;

}
