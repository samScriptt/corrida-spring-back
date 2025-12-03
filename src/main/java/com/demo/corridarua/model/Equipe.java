package com.demo.corridarua.model;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Equipe {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cidade;
    private String patrocinador;
}
