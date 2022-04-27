package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hellow")
public class hellowcontroller {
     
	@GetMapping
	public String hellow() 
	{
		return"helloworld";
	}
	@GetMapping ("/bsm")
	public String bsm() 
	{
		return"*Comunicação <br /> *Persistência <br /> * Orientação ao futuro <br/>"
				+ "*Responsabilidade pessoal <br/> *Mentalidade de crescimento <br/> * Persistência <br/>"
				+ "*Habilidades:<br/> *Trabalho em equipe<br/> * Atenção aos detalhes<br/>"
				+ " *Proatividade<br/>*Comunicação";
		
	}
	
}
