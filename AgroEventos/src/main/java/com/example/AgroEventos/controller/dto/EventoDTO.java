package com.example.AgroEventos.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
public class EventoDTO {
    private String nome;
    private Long quantidadeIngressos;
    private LocalDateTime dataEvento;
}
