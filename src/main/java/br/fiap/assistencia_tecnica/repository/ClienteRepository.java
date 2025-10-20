package br.fiap.assistencia_tecnica.repository;

import br.fiap.assistencia_tecnica.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}