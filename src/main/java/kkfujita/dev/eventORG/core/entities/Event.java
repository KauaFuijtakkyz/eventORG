package kkfujita.dev.eventORG.core.entities;

import kkfujita.dev.eventORG.core.enuns.EventType;

import java.time.LocalDateTime;

public record Event(Long id,
                    String nome,
                    String descricao,
                    String identificador,
                    LocalDateTime dataInicio,
                    LocalDateTime datafim,
                    String localEvento,
                    Long capacidade,
                    String organizador,
                    EventType tipo) {}
