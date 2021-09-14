package com.example.HeadersCiudades;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.*;

@SpringBootApplication
public class HeadersCiudadesApplication {

	public static void main(String[] args) {
		SpringApplication.run(HeadersCiudadesApplication.class, args);
	}

	/*@Bean
	public CiudadesService devolver(){
		System.out.println("creando el bean");
			return new CiudadesService();
	}*/
}
