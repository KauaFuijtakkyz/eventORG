package kkfujita.dev.eventORG.infra.percistence;

import kkfujita.dev.eventORG.core.entities.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EventRepository extends JpaRepository<EventEntity, Long> {

    Optional<EventEntity> findByIdentificador(String identificador);

}
