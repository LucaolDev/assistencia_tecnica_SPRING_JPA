package br.fiap.assistencia_tecnica.service;

import br.fiap.assistencia_tecnica.domain.Equipamento;
import br.fiap.assistencia_tecnica.repository.ClienteRepository;
import br.fiap.assistencia_tecnica.repository.EquipamentoRepository;
import br.fiap.assistencia_tecnica.web.dto.EquipamentoDTO;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class EquipamentoService {
    private final ClienteRepository clienteRepository;
    private final EquipamentoRepository equipamentoRepository;

    public EquipamentoService(ClienteRepository clienteRepository, EquipamentoRepository equipamentoRepository) {
        this.clienteRepository = clienteRepository;
        this.equipamentoRepository = equipamentoRepository;
    }

    public Equipamento inserir(EquipamentoDTO equipamentoDTO){
        var cliente = clienteRepository.findById(equipamentoDTO.getIdCliente())
                .orElseThrow(() -> new NoSuchElementException("Cliente não cadastrado"));

        var equipamento = new Equipamento();
        equipamento.setTipo(equipamentoDTO.getTipo());
        equipamento.setMarca(equipamentoDTO.getMarca());
        equipamento.setModelo(equipamentoDTO.getModelo());
        equipamento.setNumeroSerie(equipamentoDTO.getNumeroSerie());
        equipamento.setDataCadastro(equipamentoDTO.getDataCadastro());
        equipamento.setCliente(cliente);
        return equipamentoRepository.save(equipamento);
    }
}
