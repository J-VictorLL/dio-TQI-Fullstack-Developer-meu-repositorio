package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ProjetoDioPadroesDeProjetoSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoDioPadroesDeProjetoSpringbootApplication.class, args);
	}

}
