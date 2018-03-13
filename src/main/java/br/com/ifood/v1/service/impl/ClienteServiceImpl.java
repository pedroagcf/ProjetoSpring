package br.com.ifood.v1.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ifood.v1.modells.Restaurante;
import br.com.ifood.v1.repositories.ClienteRepository;
import br.com.ifood.v1.service.ClienteService;


@Service
public class ClienteServiceImpl implements ClienteService{

	@Autowired(required = true)
	ClienteRepository cRepository;
	
	
	/*
	 * (non-Javadoc)
	 * @see br.com.ifood.v1.service.ClienteService#searchCoordenada(br.com.ifood.v1.modells.Restaurante)
	 * 
	 * PROBLEMA! 
	 * 
	 * O objeto cRepository nao pode retornar o desejado que foi definido na interface ClienteService
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	@Override
	public Long searchCoordenada(Restaurante restaurante) {
		// probleminha ! :( cRepository.
		return null;
	} 

	@Override
	public Restaurante SearchRestaurante(Long cordenada) {
		return cRepository.findOne(cordenada);
	}

	@Override
	public boolean comprar(Restaurante restaurante, float valor) {
		
		return false;
	}

	@Override
	public boolean cadastrarEndereco(String endereco) {
		
		return false;
	}

	@Override
	public void deleteEndereco(String endereco) {
		// TODO Auto-generated method stub
		
	}

}
