package com.cyjdetalles.controller;

import com.cyjdetalles.model.Cliente;
import com.cyjdetalles.repository.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
@CrossOrigin(origins = "*") // Reemplazar * con la URL de React en producción
public class ClienteController {

    @Autowired
    private ClienteRepository repository;

    // LISTAR TODOS LOS CLIENTES
    @GetMapping
    public List<Cliente> listar() {
        return repository.findAll();
    }

    // BUSCAR CLIENTE POR ID
    @GetMapping("/{id}")
    public ResponseEntity<Cliente> buscarPorId(@PathVariable Long id) {
        return repository.findById(id)
                .map(cliente -> ResponseEntity.ok(cliente))
                .orElse(ResponseEntity.notFound().build());
    }

    // GUARDAR CLIENTE
    @PostMapping
    public Cliente guardar(@RequestBody Cliente cliente) {
        return repository.save(cliente);
    }

    // ACTUALIZAR CLIENTE
    @PutMapping("/{id}")
    public ResponseEntity<Cliente> actualizar(
            @PathVariable Long id,
            @RequestBody Cliente cliente) {

        if (!repository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }

        cliente.setId_cliente(id);
        return ResponseEntity.ok(repository.save(cliente));
    }

    // ELIMINAR CLIENTE
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        if (!repository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }

        repository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}

