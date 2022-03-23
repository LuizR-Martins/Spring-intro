package com.helloword.hello.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping


public class Hellocontoler {
	
	@GetMapping ("hello")
	
	public String  hello() {
		return "Hello Generation";
		
	}
	@GetMapping ("bsm")
	public String  bsm(){
		return "Orientação ao futuro\nResponsabilidade pessoal\nMentalidade de crescimento"
				+ "\nPersistencia\nAtenção aos detalhes\nProatividade\nComunicação"; };
                   
				@GetMapping ("objetivos")
                   public String obejtivos() {
					return "Dominar os novos conhecimentos adquiridos e aplicalos diariamente"; };
					
				};


