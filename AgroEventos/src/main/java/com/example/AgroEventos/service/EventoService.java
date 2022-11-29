package com.example.AgroEventos.service;

import com.example.AgroEventos.controller.dto.EventoAtualizadoDTO;
import com.example.AgroEventos.controller.dto.EventoDTO;
import com.example.AgroEventos.model.Evento;
import com.example.AgroEventos.repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.UUID;

@Service
public class EventoService {


    @Autowired
    private EventoRepository eventoRepository;

    public Optional<Evento> buscaEvento(UUID id){
        return eventoRepository.findById(id);
    }

    public Evento criaEvento(EventoDTO eventoDTO){
        Evento evento = new Evento(eventoDTO);
        return eventoRepository.save(evento);
    }
    public Evento atualizaEvento(EventoAtualizadoDTO eventoAtualizadoDTO){
        Evento evento = eventoRepository.findById(eventoAtualizadoDTO.getEvento()).orElseThrow();
        evento.setQuantidadeIngressos(evento.getQuantidadeIngressos() - eventoAtualizadoDTO.getQuantidadeIngressos());
        return eventoRepository.save(evento);
    }
}
