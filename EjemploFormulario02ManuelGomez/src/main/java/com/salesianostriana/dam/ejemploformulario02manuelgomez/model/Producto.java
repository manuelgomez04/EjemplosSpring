package com.salesianostriana.dam.ejemploformulario02manuelgomez.model;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Producto {

	@Id
	@GeneratedValue
	private long id;

	private String name;
	private String description;
	private double price;

	private String tipo;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate fCaducidad;
}
