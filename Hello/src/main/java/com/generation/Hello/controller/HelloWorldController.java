package com.generation.Hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//essa classe terá os poderes para fazer o CRUD

@RestController // indica que a classe é controladora que fará as configurações necessárias para fazer as requisições

@RequestMapping("/hello-world") // configurando o servidor
public class HelloWorldController {
	
	@GetMapping //criando método de busca
	public String helloWorld() {
		return "Hello World!";
	}
}
