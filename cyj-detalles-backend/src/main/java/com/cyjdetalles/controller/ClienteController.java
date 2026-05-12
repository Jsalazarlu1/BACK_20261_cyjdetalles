package com.cyjdetalles.controller;

import com.cyjdetalles.model.Cliente;
import com.cyjdetalles.repository.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
@CrossOrigin(origins = "*")
public class ClienteController {

    @Autowired
    private ClienteRepository repository;

    // LISTAR CLIENTES
    @GetMapping
    public List<Cliente> listar() {

        return repository.findAll();
    }

    // GUARDAR CLIENTE
    @PostMapping
    public Cliente guardar(
            @RequestBody Cliente cliente) {

        return repository.save(cliente);
    }

    // ACTUALIZAR CLIENTE
    @PutMapping("/{id}")
    public Cliente actualizar(
            @PathVariable Long id,
            @RequestBody Cliente cliente) {

        cliente.setId_cliente(id);

        return repository.save(cliente);
    }

    // ELIMINAR CLIENTE
    @DeleteMapping("/{id}")
    public void eliminar(
            @PathVariable Long id) {

        repository.deleteById(id);
    }
}
