package br.com.ifood.v1.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.ifood.v1.modells.Restaurante;
import br.com.ifood.v1.service.RestauranteService;

@Service
public class RestauranteServiceImpl implements RestauranteService{
	
	@Override
	public List<Restaurante> listar() {
		List<Restaurante> restaurantes = new ArrayList<>();
		restaurantes.add(new Restaurante("pedro", "33435465", "rua do inacio", "o cowboy vai te pegar", 4343324, 42342423));
		restaurantes.add(new Restaurante("felipe", "33435465", "fskifhud", "fsdfsdf", 345, 53453));
		restaurantes.add(new Restaurante("joao", "4534", "vdfg", "gdfg", 879, 6345));
		restaurantes.add(new Restaurante("buceta", "353", "325524", "vxdr", 4343324, 42342423));
		restaurantes.add(new Restaurante("cu", "33435465", "fdb", "53cdsf", 432, 4665));
		return restaurantes;
 	}

	@Override
	public Restaurante criar(Restaurante rest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Restaurante atualizar(Restaurante rest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Restaurante procurarId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Restaurante rest) {
		// TODO Auto-generated method stub
		
	}

}
