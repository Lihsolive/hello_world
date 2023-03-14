package com.generation.Hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos")
public class ObjetivosAprendizagem {
	@GetMapping
	public String objetivosAprendizagem() {
		return "\t\tObjetivos de Aprendizagem da Semana: \n" 
				+ "\n1- Responsabilidade Pessoal;"
				+ "\n2- Persistência;"
				+ "\n3- Trabalho em equipe;"
				+ "\n4- Criatividade.";
	}
}
