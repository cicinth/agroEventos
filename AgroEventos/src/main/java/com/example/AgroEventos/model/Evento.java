package com.example.AgroEventos.model;

import com.example.AgroEventos.controller.dto.EventoDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@Entity
public class Evento {
    @Id
    @GeneratedValue
    private UUID id;
    private String nome;
    private Long quantidadeIngressos;
    private LocalDateTime dataEvento;

    public Evento(EventoDTO eventoDTO){
        this.nome = eventoDTO.getNome();
        this.quantidadeIngressos = eventoDTO.getQuantidadeIngressos();
        this.dataEvento = eventoDTO.getDataEvento();
    }

    public Evento() {
    }
}
