package kkfujita.dev.eventORG.infra.percistence;

import jakarta.persistence.*;
import kkfujita.dev.eventORG.core.enuns.EventType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Entity
@Table(name = "event_tb")
public class EventEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String descricao;

    private String identificador;

    @Column(name = "data_inicio")
    private LocalDateTime DataInicio;

    @Column(name = "data_fim")
    private LocalDateTime Datafim;

    @Column(name = "local_evento", nullable = false)
    private String localEvento;


    private Long capacidade;

    private String organizador;

    @Enumerated(EnumType.STRING)
    private EventType tipo;

    public EventEntity(Long id, String nome, String descricao, String identificador, LocalDateTime dataInicio, LocalDateTime datafim, String localEvento, Long capacidade, String organizador, EventType tipo) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.identificador = identificador;
        DataInicio = dataInicio;
        Datafim = datafim;
        this.localEvento = localEvento;
        this.capacidade = capacidade;
        this.organizador = organizador;
        this.tipo = tipo;
    }

    public EventEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public LocalDateTime getDataInicio() {
        return DataInicio;
    }

    public void setDataInicio(LocalDateTime dataInicio) {
        DataInicio = dataInicio;
    }

    public LocalDateTime getDatafim() {
        return Datafim;
    }

    public void setDatafim(LocalDateTime datafim) {
        Datafim = datafim;
    }

    public String getLocalEvento() {
        return localEvento;
    }

    public void setLocalEvento(String localEvento) {
        this.localEvento = localEvento;
    }

    public Long getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Long capacidade) {
        this.capacidade = capacidade;
    }

    public String getOrganizador() {
        return organizador;
    }

    public void setOrganizador(String organizador) {
        this.organizador = organizador;
    }

    public EventType getTipo() {
        return tipo;
    }

    public void setTipo(EventType tipo) {
        this.tipo = tipo;
    }
}
