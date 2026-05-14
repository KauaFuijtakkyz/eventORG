package kkfujita.dev.eventORG.core.usecases;

import kkfujita.dev.eventORG.core.entities.Event;
import kkfujita.dev.eventORG.core.geteway.EventGateway;

public class CreatEventUsecaseImpl implements CreatEventUsecase {

    private final EventGateway gateway;
    private final gerarIdentificadorUsecase gerador; // 1. Adicione o gerador aqui

    // 2. Atualize o construtor para receber ambos
    public CreatEventUsecaseImpl(EventGateway gateway, gerarIdentificadorUsecase gerador) {
        this.gateway = gateway;
        this.gerador = gerador;
    }

    @Override
    public Event execute(Event event) {
        // 3. Gere o código de 6 dígitos
        String idGerado = gerador.executar();

        // 4. Como Event é um Record (imutável), criamos uma nova instância com o ID gerado
        Event eventoComIdentificador = new Event(
                event.id(),
                event.nome(),
                event.descricao(),
                idGerado, // <--- Aqui entra o código (ex: ABC123)
                event.dataInicio(),
                event.datafim(),
                event.localEvento(),
                event.capacidade(),
                event.organizador(),
                event.tipo()
        );

        // 5. Salva o evento já com o identificador preenchido
        return gateway.criarEvento(eventoComIdentificador);
    }
}
