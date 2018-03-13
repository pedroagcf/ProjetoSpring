package br.com.ifood.v1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ifood.v1.modells.Cliente;
import br.com.ifood.v1.modells.Restaurante;

@Repository
public interface ClienteRepository extends JpaRepository<Restaurante, Long>{

	
	
}
