package com.example.AgroEventos.controller;

import com.example.AgroEventos.controller.dto.EventoAtualizadoDTO;
import com.example.AgroEventos.controller.dto.EventoDTO;
import com.example.AgroEventos.model.Evento;
import com.example.AgroEventos.service.EventoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/eventos")
public class EventoController {

    @Autowired
    private EventoService eventoService;

    @GetMapping("/{id}")
    public ResponseEntity<Evento> buscaEvento(@PathVariable UUID id){
        Optional<Evento> evento = eventoService.buscaEvento(id);
        return evento.map(value -> ResponseEntity.ok().body(value)).orElseGet(() ->
                ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Evento> criarEvento(@RequestBody EventoDTO eventoDTO){
        return ResponseEntity.ok().body(eventoService.criaEvento(eventoDTO));
    }

    @PutMapping
    public ResponseEntity<Evento> atualizaEvento(@RequestBody EventoAtualizadoDTO eventoAtualizadoDTO){
        return ResponseEntity.ok().body(eventoService.atualizaEvento(eventoAtualizadoDTO));
    }
}
