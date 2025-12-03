package com.demo.corridarua.controller;

import com.demo.corridarua.model.Pista;
import com.demo.corridarua.repository.PistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/pistas")
public class PistaController {

    @Autowired
    private PistaRepository repository;

    @GetMapping
    public List<Pista> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Pista criar(@RequestBody Pista obj) {
        return repository.save(obj);
    }

    @GetMapping("/{id}")
    public Pista buscar(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Pista atualizar(@PathVariable Long id, @RequestBody Pista obj) {
        obj.setId(id); // Assume que existe setId via Lombok
        return repository.save(obj);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
