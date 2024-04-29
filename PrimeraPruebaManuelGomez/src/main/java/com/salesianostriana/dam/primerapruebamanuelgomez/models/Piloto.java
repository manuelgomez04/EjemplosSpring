package com.salesianostriana.dam.primerapruebamanuelgomez.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Piloto {

	@Id
	@GeneratedValue
	private Long id;

	private String nombre;
	private String apellidos;
	private String dni;
	private double salario;
}
