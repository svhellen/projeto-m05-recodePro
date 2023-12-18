package br.com.vivaviatravel_spring.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.vivaviatravel_spring.model.Reserva;

public interface ReservaRepository extends JpaRepository<Reserva, Long> {

	@EntityGraph(attributePaths = { "cliente", "passagem" })
	List<Reserva> findAll();
}
