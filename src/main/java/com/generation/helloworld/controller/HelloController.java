package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@GetMapping
	public String Hello() {
		return "<h1>Hello World!</h1>"
				+ "<br>"
				+ "<a href='./hello/bsm'>BSMs da Generation </a>"
				+ "<br>"
				+ "<a href='./hello/objetivos'>Objetivos da semana</a>";
	}

	@GetMapping("/bsm")
	public String bsm() {
		return "<h1>BSMs da Generation</h1>"
				+"<h2>Mentalidades</h2>"
				+ "<ul>"
				+ "<li>Orientação ao futuro</li>"
				+ "<li>Responsabilidade social</li>"
				+ "<li>Mentalidade de crescimento</li>"
				+ "<li>Persistência</li>"
				+ "<h2>Habilidades</h2>"
				+ "<li>Trabalho em equipe</li>"
				+ "<li>Orientação ao detalhe</li>"
				+ "<li>Proatividade</li>"
				+ "<li>Comunicação</li>"
				+ "</ul>";
	}
	@GetMapping("/objetivos")
	public String objetivos() {
		return "<h1>Alguns dos meus objetivos para essa semana</h1>"
				+ "<ol>"
				+ "<li>Compreender o funcionamento do Spring Boot</li>"
				+ "<li>Iniciar projeto 'Blog pessoal'</li>"
				+ "<li>Realizar bootcamp Decola Tech Avanade na plataforma Dio.me</li>"
				+ "<li>Aprofundar meus conhecimentos em Java</li>"
				+ "</ol>";
	}
}
