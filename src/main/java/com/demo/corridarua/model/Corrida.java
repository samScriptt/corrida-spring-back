package com.demo.corridarua.model;
import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Data
@Entity
public class Corrida {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private LocalDate data;
    private String status; // PLANEJADA, EM_ANDAMENTO, ENCERRADA
    private String categoria; // STREET, DRAG, DRIFT

    @ManyToOne
    @JoinColumn(name = "pista_id")
    private Pista pista;
}
