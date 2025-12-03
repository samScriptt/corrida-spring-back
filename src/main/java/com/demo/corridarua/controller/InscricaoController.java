package com.demo.corridarua.controller;

import com.demo.corridarua.model.Inscricao;
import com.demo.corridarua.repository.InscricaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/inscricaos")
public class InscricaoController {

    @Autowired
    private InscricaoRepository repository;

    @GetMapping
    public List<Inscricao> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Inscricao criar(@RequestBody Inscricao obj) {
        return repository.save(obj);
    }

    @GetMapping("/{id}")
    public Inscricao buscar(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Inscricao atualizar(@PathVariable Long id, @RequestBody Inscricao obj) {
        obj.setId(id); // Assume que existe setId via Lombok
        return repository.save(obj);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
