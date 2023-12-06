package br.com.vivaviatravel_spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.vivaviatravel_spring.model.Passagem;

public interface PassagemRepository extends JpaRepository<Passagem, Long>{

}
