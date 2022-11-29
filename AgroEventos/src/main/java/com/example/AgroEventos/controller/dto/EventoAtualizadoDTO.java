package com.example.AgroEventos.controller.dto;

import lombok.Getter;

import java.util.UUID;

@Getter
public class EventoAtualizadoDTO {
    private UUID evento;
    private int quantidadeIngressos;
}
