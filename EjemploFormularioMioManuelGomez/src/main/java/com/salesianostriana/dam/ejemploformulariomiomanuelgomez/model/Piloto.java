package com.salesianostriana.dam.ejemploformulariomiomanuelgomez.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Piloto {

	@Id
	@GeneratedValue
	private long id;

	private String nombre;
	private String apellidos;

}
