package com.example.compra_alimentos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CompraAlimentosApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompraAlimentosApplication.class, args);
		System.out.println("Servidor corriendo en puerto 8080...");
	}

}
