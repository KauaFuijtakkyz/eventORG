package kkfujita.dev.eventORG.core.usecases;

import kkfujita.dev.eventORG.core.entities.Event;

import java.util.List;

public interface SearchEventUsecase {

    public List<Event> execute();

}
