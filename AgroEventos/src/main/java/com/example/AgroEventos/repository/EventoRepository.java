package com.example.AgroEventos.repository;

import com.example.AgroEventos.model.Evento;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;


@Repository
public interface EventoRepository extends CrudRepository<Evento, UUID> {
}
