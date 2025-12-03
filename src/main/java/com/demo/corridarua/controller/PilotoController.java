package com.demo.corridarua.controller;

import com.demo.corridarua.model.Piloto;
import com.demo.corridarua.repository.PilotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/pilotos")
public class PilotoController {

    @Autowired
    private PilotoRepository repository;

    @GetMapping
    public List<Piloto> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Piloto criar(@RequestBody Piloto obj) {
        return repository.save(obj);
    }

    @GetMapping("/{id}")
    public Piloto buscar(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Piloto atualizar(@PathVariable Long id, @RequestBody Piloto obj) {
        obj.setId(id); // Assume que existe setId via Lombok
        return repository.save(obj);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
