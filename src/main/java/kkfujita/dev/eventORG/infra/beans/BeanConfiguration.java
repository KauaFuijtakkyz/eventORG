package kkfujita.dev.eventORG.infra.beans;

import kkfujita.dev.eventORG.core.geteway.EventGateway;
import kkfujita.dev.eventORG.core.usecases.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public CreatEventUsecase creatEventUsecase(EventGateway gateway, gerarIdentificadorUsecase gerador) {
        return new CreatEventUsecaseImpl(gateway, gerador);
    }


    @Bean
    public SearchEventUsecase searchEventCase(EventGateway eventGateway) {
        return new SearchEventUsecaseImpl(eventGateway);
    }

    @Bean
    public BuscarPorIdentificadorUsecase buscarPorIdentificador(EventGateway eventGateway){
        return new BuscarPorIdentificadorUsecaseImpl(eventGateway);
        };


    @Bean
    public gerarIdentificadorUsecase gerarIdentificadorUsecase(){
        return new gerarIdentificadorUsecaseImpl();
    }
    }

