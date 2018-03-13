package br.com.ifood.v1.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.ifood.v1.modells.Restaurante;
import br.com.ifood.v1.service.RestauranteService;

//serve para informar ao springboot que e ó controller e faz conexao http
@RestController 
@RequestMapping("/v1/restaurantes") //o spring se encarrega de instanciar a classe 
public class RestauranteController {

	//injeçao(objeto) de dependecia
	@Autowired(required = true)
	private RestauranteService rService; 
	
	@RequestMapping(method = RequestMethod.GET)
	ResponseEntity<List<Restaurante>> listarRestaurante() { 
		List<Restaurante> restaurantes = rService.listar();
		return new ResponseEntity<List<Restaurante>>(restaurantes, HttpStatus.FOUND);
	}

}
