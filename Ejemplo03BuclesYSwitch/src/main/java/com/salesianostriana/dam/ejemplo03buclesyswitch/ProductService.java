package com.salesianostriana.dam.ejemplo03buclesyswitch;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductService {

	public List<Product> getLista() {
		return Arrays.asList(
				new Product(1, "Botijo", "Enfría hasta menos 10 grados", 20.5055, true, LocalDateTime.now()),
				new Product(2, "Botijo extra", "Enfría hasta menos 200 grados", 200.50, true, LocalDateTime.now()),
				new Product(3, "Botijo súper extra", "Enfría hasta menos 250 grados", 20.5055, true,
						LocalDateTime.now()),
				new Product(4, "Botijo híper extra", "Enfría hasta menos 300 grados", 200.50, true,
						LocalDateTime.now()),
				new Product(5, "Botijo megahíper extra", "Enfría hasta menos 500 grados", 20.5055, true,
						LocalDateTime.now()),
				new Product(6, "Botijo top", "Enfría hasta menos 1000 grados", 200.50, true, LocalDateTime.now()));
	}
}
