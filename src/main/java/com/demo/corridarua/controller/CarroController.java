package com.demo.corridarua.controller;

import com.demo.corridarua.model.Carro;
import com.demo.corridarua.repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/carros")
public class CarroController {

    @Autowired
    private CarroRepository repository;

    @GetMapping
    public List<Carro> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Carro criar(@RequestBody Carro obj) {
        return repository.save(obj);
    }

    @GetMapping("/{id}")
    public Carro buscar(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Carro atualizar(@PathVariable Long id, @RequestBody Carro obj) {
        obj.setId(id); // Assume que existe setId via Lombok
        return repository.save(obj);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
