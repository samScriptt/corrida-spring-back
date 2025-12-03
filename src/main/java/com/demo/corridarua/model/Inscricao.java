package com.demo.corridarua.model;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Inscricao {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer numeroLargada;
    private String situacao; // APROVADA, PENDENTE, INDEFERIDA

    @ManyToOne
    @JoinColumn(name = "corrida_id")
    private Corrida corrida;

    @ManyToOne
    @JoinColumn(name = "piloto_id")
    private Piloto piloto;

    @ManyToOne
    @JoinColumn(name = "carro_id")
    private Carro carro;
}
