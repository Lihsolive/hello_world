package com.generation.Hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsm")
public class BSMController {
	@GetMapping
	public String BSMs() {
		return "\t\tBSM - Habilidades Comportamentais e Mentais \n"
				+ "\n1- Mentalidade de Crescimento;" 
				+ "\n2- Persistência;" 
				+ "\n3- Responsabilidade Pessoal;"
				+ "\n4- Orientação ao Futuro;" 
				+ "\n5- Comunicação;" 
				+ "\n6- Orientação ao Detalhe;"
				+ "\n7- Proatividade;" 
				+ "\n8- Trabalho em Equipe;" 
				+ "\n9- Dar e Receber;"
				+ "\n10- Força de Trabalho Distribuída" 
				+ "\n11- Gestão do Tempo;" 
				+ "\n12- Forças de Caráter;"
				+ "\n13- Aprendizagem Online";
	}
}
