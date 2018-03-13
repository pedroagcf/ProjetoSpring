package br.com.ifood.v1.service;

import br.com.ifood.v1.modells.Restaurante;

public interface ClienteService {
	
	Long searchCoordenada(Restaurante restaurante);
	Restaurante SearchRestaurante(Long cordenada);
	boolean comprar(Restaurante restaurante, float valor);
	boolean cadastrarEndereco(String endereco);
	void deleteEndereco(String endereco);
	
}
