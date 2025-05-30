package br.anhembi.barramento.service;

import org.springframework.stereotype.Service;

import br.anhembi.barramento.dto.dto;
import br.anhembi.barramento.model.model;
import br.anhembi.barramento.repo.repository;

@Service
public class service {
    private final repository repository;

    public service(repository  repository) {
        this.repository = repository;
    }


     public void processarEventoo(dto eventoDTO) {
        System.out.println("Recebido evento do user " + eventoDTO.getUserId()
            + ": " + eventoDTO.getMensagem()
            + " em " + eventoDTO.getData());
        // você pode salvar no banco aqui
    }

    public boolean processarEvento(dto dto) {

        if (repository.existsByUserIdAndData(dto.getUserId(), dto.getData())) {
            return false; // Evento duplicado
        }

        model evento = new model();
        evento.setUserId(dto.getUserId());
        evento.setData(dto.getData());
        evento.setMensagem(dto.getMensagem());

        repository.save(evento);
        return true;
    }
}
