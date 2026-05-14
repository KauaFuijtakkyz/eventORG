package kkfujita.dev.eventORG.infra.mappers;

import kkfujita.dev.eventORG.core.entities.Event;
import kkfujita.dev.eventORG.infra.dtos.EventDTO;
import org.springframework.stereotype.Component;

@Component
public class EventDTOMapper {

    public Event toDomain(EventDTO dto) {
        return new Event(
                null, // ID inicial nulo para criação
                dto.nome(),
                dto.descricao(),
                dto.identificador(),
                dto.dataInicio(),
                dto.datafim(),
                dto.localEvento(),
                dto.capacidade(),
                dto.organizador(),
                dto.tipo()
        );
    } // <-- Chave que faltava aqui!

    public EventDTO toDto(Event event) {
        return new EventDTO(
                event.id(),
                event.nome(),
                event.descricao(),
                event.identificador(),
                event.dataInicio(),
                event.datafim(),
                event.localEvento(),
                event.capacidade(),
                event.organizador(),
                event.tipo()
        );
    }
}
