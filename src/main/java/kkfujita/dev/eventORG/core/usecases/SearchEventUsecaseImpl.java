package kkfujita.dev.eventORG.core.usecases;

import kkfujita.dev.eventORG.core.entities.Event;
import kkfujita.dev.eventORG.core.geteway.EventGateway;

import java.util.List;

public class SearchEventUsecaseImpl implements SearchEventUsecase {

    private final EventGateway gateway;

    public SearchEventUsecaseImpl(EventGateway gateway) {
        this.gateway = gateway;
    }

    @Override
    public List<Event> execute() {
        return gateway.listarEventos();
    }
}
