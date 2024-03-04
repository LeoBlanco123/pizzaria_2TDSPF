package br.com.fiap.pizzaria_2TDSPF.repository;


import br.com.fiap.pizzaria_2TDSPF.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
