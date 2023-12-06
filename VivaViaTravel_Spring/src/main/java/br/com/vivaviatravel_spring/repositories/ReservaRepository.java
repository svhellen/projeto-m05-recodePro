package br.com.vivaviatravel_spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.vivaviatravel_spring.model.Reserva;

public interface ReservaRepository extends JpaRepository<Reserva, Long> {

}
