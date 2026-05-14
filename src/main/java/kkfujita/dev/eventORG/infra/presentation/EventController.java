package kkfujita.dev.eventORG.infra.presentation;

import kkfujita.dev.eventORG.core.entities.Event;
import kkfujita.dev.eventORG.core.usecases.BuscarPorIdentificadorUsecase;
import kkfujita.dev.eventORG.core.usecases.CreatEventUsecase;
import kkfujita.dev.eventORG.core.usecases.SearchEventUsecase;
import kkfujita.dev.eventORG.infra.dtos.EventDTO;
import kkfujita.dev.eventORG.infra.mappers.EventDTOMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/v1/") // Sugestão de plural
public class EventController {

    private final BuscarPorIdentificadorUsecase buscarPorIdentificadorUsecase;
    private final SearchEventUsecase searchEventUsecase;
    private final CreatEventUsecase creatEventUsecase;
    private final EventDTOMapper mapper;

    public EventController(BuscarPorIdentificadorUsecase buscarPorIdentificadorUsecase, SearchEventUsecase searchEventUsecase, CreatEventUsecase creatEventUsecase, EventDTOMapper mapper) {
        this.buscarPorIdentificadorUsecase = buscarPorIdentificadorUsecase;
        this.searchEventUsecase = searchEventUsecase;
        this.creatEventUsecase = creatEventUsecase;
        this.mapper = mapper;
    }

    @PostMapping("criarevento")
    public EventDTO criarEvento(@RequestBody EventDTO eventDTO) {
        Event eventDomain = mapper.toDomain(eventDTO);
        Event eventSalvo = creatEventUsecase.execute(eventDomain);

        return mapper.toDto(eventSalvo);
    }

    @GetMapping("buscareventos")
    public List<EventDTO> listarTodos() {
        return searchEventUsecase.execute()
                .stream()
                .map(mapper::toDto) // Converte Domain para DTO
                .collect(Collectors.toList());
    }

    @GetMapping("filtrareventos/{identificador}")
    public ResponseEntity<Event> buscarPorIdentificador(@PathVariable String identificador){
        Event event = buscarPorIdentificadorUsecase.execute(identificador);
        return ResponseEntity.ok(event);
    }

}

