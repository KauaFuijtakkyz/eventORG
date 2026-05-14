package kkfujita.dev.eventORG.infra.mappers;
import kkfujita.dev.eventORG.core.entities.Event;
import kkfujita.dev.eventORG.infra.percistence.EventEntity;
import org.springframework.stereotype.Component;

@Component
public class EventEntityMapper {

    public EventEntity toEntity(Event event) {
        EventEntity entity = new EventEntity();
        entity.setId(event.id());
        entity.setNome(event.nome());
        entity.setDescricao(event.descricao());
        entity.setIdentificador(event.identificador()); // Aqui funcionou!

        // GARANTA ESTAS DUAS LINHAS:
        entity.setDataInicio(event.dataInicio());
        entity.setDatafim(event.datafim());

        entity.setLocalEvento(event.localEvento());
        entity.setCapacidade(event.capacidade());
        entity.setOrganizador(event.organizador());
        entity.setTipo(event.tipo());
        return entity;
    }

    public Event toDomain(EventEntity entity) {
        if (entity == null) return null;

        return new Event(
                entity.getId(),
                entity.getNome(),
                entity.getDescricao(),
                entity.getIdentificador(),
                entity.getDataInicio(),
                entity.getDatafim(),
                entity.getLocalEvento(), // Use o nome novo aqui também
                entity.getCapacidade(),
                entity.getOrganizador(),
                entity.getTipo()
        );
    }
}