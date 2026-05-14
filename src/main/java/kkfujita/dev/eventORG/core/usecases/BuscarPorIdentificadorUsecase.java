package kkfujita.dev.eventORG.core.usecases;

import kkfujita.dev.eventORG.core.entities.Event;

public interface BuscarPorIdentificadorUsecase {

    public Event execute(String identificador);
}
