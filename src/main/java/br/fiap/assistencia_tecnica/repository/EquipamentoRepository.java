package br.fiap.assistencia_tecnica.repository;

import br.fiap.assistencia_tecnica.domain.Equipamento;
import br.fiap.assistencia_tecnica.web.dto.EquipamentoDTO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EquipamentoRepository extends JpaRepository<Equipamento, Long> {
    public List<EquipamentoDTO> findByClienteId(Long idCliente);
}
