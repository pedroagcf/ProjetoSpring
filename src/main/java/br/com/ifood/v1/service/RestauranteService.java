package br.com.ifood.v1.service;

import java.util.List;
import br.com.ifood.v1.modells.Restaurante;

public interface RestauranteService {
	
	List<Restaurante> listar();
	Restaurante criar(Restaurante rest);
	Restaurante atualizar(Restaurante rest);
	Restaurante procurarId(Long id);
	void delete(Restaurante rest);

}
