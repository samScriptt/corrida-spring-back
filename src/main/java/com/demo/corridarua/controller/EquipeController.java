package com.demo.corridarua.controller;

import com.demo.corridarua.model.Equipe;
import com.demo.corridarua.repository.EquipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/equipes")
public class EquipeController {

    @Autowired
    private EquipeRepository repository;

    @GetMapping
    public List<Equipe> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Equipe criar(@RequestBody Equipe obj) {
        return repository.save(obj);
    }

    @GetMapping("/{id}")
    public Equipe buscar(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Equipe atualizar(@PathVariable Long id, @RequestBody Equipe obj) {
        obj.setId(id); // Assume que existe setId via Lombok
        return repository.save(obj);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
