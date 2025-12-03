package com.demo.corridarua.model;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Carro {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String modelo;
    private String placa;
    private Integer ano;
    private String cor;

    @ManyToOne
    @JoinColumn(name = "equipe_id")
    private Equipe equipe;
}
