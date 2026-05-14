package kkfujita.dev.eventORG.infra.gateway;

import kkfujita.dev.eventORG.core.entities.Event;
import kkfujita.dev.eventORG.core.geteway.EventGateway;
import kkfujita.dev.eventORG.infra.exception.NotFoundEventException;
import kkfujita.dev.eventORG.infra.mappers.EventEntityMapper;
import kkfujita.dev.eventORG.infra.percistence.EventEntity;
import kkfujita.dev.eventORG.infra.percistence.EventRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class EventRepositoryGateway implements EventGateway {

    private final EventRepository repository;
    private final EventEntityMapper mapper;

    public EventRepositoryGateway(EventRepository repository, EventEntityMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public Event criarEvento(Event event) {
        EventEntity entity = mapper.toEntity(event);
        EventEntity novoEvento = repository.save(entity);
        return mapper.toDomain(novoEvento);
    }

    @Override
    public List<Event> listarEventos() {
        return repository.findAll() // O JpaRepository já tem esse método pronto
                .stream()
                .map(mapper::toDomain) // Converte cada Entity para Domain
                .toList();
    }

    // Local: infra/gateway/EventRepositoryGateway.java
    @Override
    public Optional<Event> buscarPorIdentificador(String identificador) {
        return repository.findByIdentificador(identificador) // Retorna Optional<EventEntity>
                .map(mapper::toDomain); // Converte para Optional<Event> e retorna a "caixa" fechada
    }



}
