package kkfujita.dev.eventORG.core.usecases;

import kkfujita.dev.eventORG.core.entities.Event;
import kkfujita.dev.eventORG.core.geteway.EventGateway;
import kkfujita.dev.eventORG.infra.exception.NotFoundEventException;

public class BuscarPorIdentificadorUsecaseImpl implements BuscarPorIdentificadorUsecase {
    private final EventGateway gateway;

    public BuscarPorIdentificadorUsecaseImpl(EventGateway gateway) {
        this.gateway = gateway;
    }

    public Event execute(String identificador) {
        return gateway.buscarPorIdentificador(identificador)
                .orElseThrow(() -> new NotFoundEventException("Evento não encontrado"));
    }

}
