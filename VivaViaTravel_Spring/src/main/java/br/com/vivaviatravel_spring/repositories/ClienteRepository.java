package br.com.vivaviatravel_spring.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.vivaviatravel_spring.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{
	
	
	  @EntityGraph(attributePaths = { "reservas" }) List<Cliente> findAll();
	 
}
