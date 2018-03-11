package br.com.ifood.v1.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ifood.v1.modells.Restaurante;
import br.com.ifood.v1.repositories.RestauranteRepository;
import br.com.ifood.v1.service.RestauranteService;

@Service
public class RestauranteServiceImpl implements RestauranteService{
	
	@Autowired(required = true)
	RestauranteRepository rRepository;
	
	@Override
	public List<Restaurante> listar() {	
		return rRepository.findAll();	
 	}

	@Override
	public Restaurante criar(Restaurante restaurante) {
		return rRepository.save(restaurante);
	}

	@Override
	public Restaurante atualizar(Restaurante restaurante) {
		return rRepository.save(restaurante);
	}

	@Override
	public Restaurante procurarId(Long id) {
		return rRepository.findOne(id);
	}

	@Override
	public void delete(Restaurante restaurante) {
		rRepository.delete(restaurante);
	}

}
