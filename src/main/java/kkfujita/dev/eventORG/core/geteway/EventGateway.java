package kkfujita.dev.eventORG.core.geteway;

import kkfujita.dev.eventORG.core.entities.Event;
import kkfujita.dev.eventORG.infra.percistence.EventEntity;

import java.util.List;
import java.util.Optional;

public interface EventGateway {

    Event criarEvento(Event event);

    List<Event> listarEventos();

    Optional<Event> buscarPorIdentificador(String identificador);
}
