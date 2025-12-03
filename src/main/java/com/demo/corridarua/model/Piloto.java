package com.demo.corridarua.model;
import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Data
@Entity
public class Piloto {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private LocalDate dataNascimento;
    private String documento;
    private String categoria; // A, B, PRO-AM

    @ManyToOne
    @JoinColumn(name = "equipe_id")
    private Equipe equipe;
}
