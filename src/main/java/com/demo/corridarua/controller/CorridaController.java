package com.demo.corridarua.controller;

import com.demo.corridarua.model.Corrida;
import com.demo.corridarua.repository.CorridaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/corridas")
public class CorridaController {

    @Autowired
    private CorridaRepository repository;

    @GetMapping
    public List<Corrida> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Corrida criar(@RequestBody Corrida obj) {
        return repository.save(obj);
    }

    @GetMapping("/{id}")
    public Corrida buscar(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Corrida atualizar(@PathVariable Long id, @RequestBody Corrida obj) {
        obj.setId(id); // Assume que existe setId via Lombok
        return repository.save(obj);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
