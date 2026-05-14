package kkfujita.dev.eventORG.infra.dtos;

import kkfujita.dev.eventORG.core.enuns.EventType;
import java.time.LocalDateTime;

public record EventDTO(
        Long id,
        String nome,
        String descricao,
        String identificador,
        LocalDateTime dataInicio,
        LocalDateTime datafim,
        String localEvento, // Verifique se o nome é exatamente este
        Long capacidade,
        String organizador,
        EventType tipo
) {}
